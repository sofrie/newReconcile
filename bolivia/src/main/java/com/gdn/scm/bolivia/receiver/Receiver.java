/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.receiver;

import com.gdn.scm.bolivia.entity.AWB;
import com.gdn.scm.bolivia.entity.Compare;
import com.gdn.scm.bolivia.services.CacheService;
import com.gdn.scm.bolivia.entity.Process;
import com.gdn.scm.bolivia.entity.Tolerance;
import com.gdn.scm.bolivia.entity.UploadHistory;
import com.gdn.scm.bolivia.repository.AWBRepository;
import com.gdn.scm.bolivia.services.AWBClientServiceImplFeign;
import com.gdn.scm.bolivia.services.AWBService;
import com.gdn.scm.bolivia.services.ToleranceService;
import com.gdn.scm.bolivia.services.UploadHistoryService;
import java.math.BigDecimal;
import java.math.MathContext;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sofrie.zumaytis
 */
@Service
public class Receiver {

    @Autowired
    CacheService cacheSrvice;

    @Autowired
    UploadHistoryService uploadHistoryService;

    @Autowired
    Compare compare;

    @Autowired
    AmqpAdmin admin;

    @Autowired
    AWBService awb;

    @Autowired
    AWBRepository awbRepository;

    @Autowired
    ToleranceService toleranceService;

    AWBClientServiceImplFeign awbFeign = new AWBClientServiceImplFeign();

    public Integer counter = 0;
    public Integer problem = 0;
    public Integer counterFromCompare = 0;
    public BigDecimal tagihan = new BigDecimal(0);
    public Boolean cekupload = false;

    public void receiveMessage(Process message) throws InterruptedException {

        System.out.println("Received <" + message + ">");
        if (cacheSrvice.setIfAbsent(message.getProccessId(), message.getRequestId())) {
            //berarti belum pernah ada yg nge set
            System.out.println("Processing... " + message);

            Thread.sleep(5000);

            cacheSrvice.delete(message.getProccessId());

            if (message.getCounter() == compare.counter) {
                UploadHistory upload = uploadHistoryService.getById(Integer.parseInt(message.getRequestId()));
                upload.setStatus("Done Uploaded");
                uploadHistoryService.addUploadHistory(upload);
            }
        } else {
            //lagi ada yg di proses
            System.out.println("Error..." + message + " is still on process");
        }
    }

//    Integer c = 0;
    public void setAWBSystem(AWB message, AWB fromSystem) {
        message.setPriceSystem(fromSystem.getPriceSystem());
        message.setWeightSystem(fromSystem.getWeightSystem());
        message.setInsuranceChargeSystem(fromSystem.getInsuranceChargeSystem());
        message.setOtherChargeSystem(fromSystem.getOtherChargeSystem());
        message.setTotalChargeSystem(fromSystem.getTotalChargeSystem());

    }

    public Integer compareAWB(BigDecimal tolerancePercent, BigDecimal toleranceAmount, BigDecimal max, AWB message, Tolerance tolerance, Integer counterBeda) {
        tolerancePercent = (tolerance.getPricePercentage().divide(new BigDecimal(100)).multiply(message.getPriceSystem())).add(message.getPriceSystem());
        toleranceAmount = message.getPriceSystem().add(tolerance.getPriceAmount());
        max = tolerancePercent.max(toleranceAmount);
        if (message.getPriceLogistic() != null && message.getPriceLogistic().compareTo(max) > 0) {
            message.setPriceComment("Beda");
            counterBeda += 1;
        } else {
            message.setPriceComment("-");
            message.setPriceApplied(message.getPriceLogistic());
        }

        tolerancePercent = (tolerance.getWeightPercentage().divide(new BigDecimal(100)).multiply(message.getWeightSystem())).add(message.getWeightSystem());
        toleranceAmount = message.getWeightSystem().add(tolerance.getWeightAmount());
        max = tolerancePercent.max(toleranceAmount);
        if (message.getWeightLogistic() != null && message.getWeightLogistic().compareTo(max) > 0) {
            message.setWeightComment("Beda");
            counterBeda += 1;
        } else {
            message.setWeightComment("-");
            message.setWeightApplied(message.getWeightLogistic());
        }

        tolerancePercent = (tolerance.getInsuranceChargePercentage().divide(new BigDecimal(100)).multiply(message.getInsuranceChargeSystem())).add(message.getInsuranceChargeSystem());
        toleranceAmount = message.getInsuranceChargeSystem().add(tolerance.getInsuranceChargeAmount());
        max = tolerancePercent.max(toleranceAmount);
        if (message.getInsuranceChargeLogistic() != null && message.getInsuranceChargeLogistic().compareTo(max) > 0) {
            message.setInsuranceChargeComment("Beda");
            counterBeda += 1;
        } else {
            message.setInsuranceChargeComment("-");
            message.setInsuranceChargeApplied(message.getInsuranceChargeLogistic());
        }

        tolerancePercent = (tolerance.getOtherChargePercentage().divide(new BigDecimal(100)).multiply(message.getOtherChargeSystem())).add(message.getOtherChargeSystem());
        toleranceAmount = message.getOtherChargeSystem().add(tolerance.getOtherChargeAmount());
        max = tolerancePercent.max(toleranceAmount);
        if (message.getOtherChargeLogistic() != null && message.getOtherChargeLogistic().compareTo(max) > 0) {
            message.setOtherChargeComment("Beda");
            counterBeda += 1;
        } else {
            message.setOtherChargeComment("-");
            message.setOtherChargeApplied(message.getOtherChargeLogistic());
        }

        tolerancePercent = (tolerance.getTotalShippingPercentage().divide(new BigDecimal(100)).multiply(message.getTotalChargeSystem())).add(message.getTotalChargeSystem());
        toleranceAmount = message.getTotalChargeSystem().add(tolerance.getTotalShippingAmount());
        max = tolerancePercent.max(toleranceAmount);
        if (message.getTotalChargeLogistic() != null && message.getTotalChargeLogistic().compareTo(max) > 0) {
            message.setTotalChargeComment("Beda");
            counterBeda += 1;
        } else {
            message.setTotalChargeComment("-");
            message.setTotalChargeApplied(message.getTotalChargeLogistic());
        }
        
        System.out.println("counter beda "+counterBeda);
        return counterBeda;
    }

    public void setReconStatus(Integer counterBeda, AWB message) {
        System.out.println("recon "+counterBeda);
        if (counterBeda != 0) {
            message.setReconStatus("Problem Exist");
            problem += 1;
            System.out.println("problemmmmmmm");
        } else {
            message.setReconStatus("OK");
            System.out.println("okkkkkkkkk");
        }
        
    }

    public void receiveMessage(AWB message) throws InterruptedException, Exception {
        if (counter == 0) {
            counterFromCompare = compare.counter;
        }
        Integer counterBeda = 0;
        try {
            System.out.println("Received <" + message + ">");
            //awb.addAWB(message);
            counter += 1;
            counterFromCompare = counterFromCompare - 1;
            Boolean ada = false;
            Integer c = 0;
            cacheSrvice.delete(message.getAwbNumber());
            compare.map.remove(message.getAwbNumber(), message.getUploadHistoryNumber());

            Tolerance tolerance = toleranceService.getTolerance();
            //get awb from logistic
            AWB fromSystem = awbFeign.getAWBSystem(message.getAwbNumber());
            if (fromSystem != null && fromSystem.getPriceSystem() != null) {
//                System.out.println("AWB------------------" + message.getAwbNumber());
//                System.out.println("from system " + fromSystem);
//                System.out.println("getPrice ----------- " + fromSystem.getPriceSystem());

                setAWBSystem(message, fromSystem);
//                message.setPriceSystem(fromSystem.getPriceSystem());
//                message.setWeightSystem(fromSystem.getWeightSystem());
//                message.setInsuranceChargeSystem(fromSystem.getInsuranceChargeSystem());
//                message.setOtherChargeSystem(fromSystem.getOtherChargeSystem());
//                message.setTotalChargeSystem(fromSystem.getTotalChargeSystem());

                System.out.println("message ID " + message.getId());
                awbRepository.save(message);
                //Thread.sleep(500);
//                System.out.println("lalalalalaalalalalla");
//                System.out.println("price " + message.getPriceSystem());
//                System.out.println("weight " + message.getWeightSystem());
//                System.out.println("insurance " + message.getInsuranceChargeSystem());
//                System.out.println("other " + message.getOtherChargeSystem());
//                System.out.println("total " + message.getTotalChargeSystem());

                //untuk perhitungan toleransi
                BigDecimal tolerancePercent;
                BigDecimal toleranceAmount;
                BigDecimal max;
                tolerancePercent = (tolerance.getPricePercentage().divide(new BigDecimal(100)).multiply(message.getPriceSystem())).add(message.getPriceSystem());
                toleranceAmount = message.getPriceSystem().add(tolerance.getPriceAmount());
                max = tolerancePercent.max(toleranceAmount);
                counterBeda=compareAWB(tolerancePercent, toleranceAmount, max, message, tolerance, counterBeda);
//                tolerancePercent = (tolerance.getPricePercentage().divide(new BigDecimal(100)).multiply(message.getPriceSystem())).add(message.getPriceSystem());
//                toleranceAmount = message.getPriceSystem().add(tolerance.getPriceAmount());
//                max = tolerancePercent.max(toleranceAmount);
//                if (message.getPriceLogistic() != null && message.getPriceLogistic().compareTo(max) > 0) {
//                    message.setPriceComment("Beda");
//                    counterBeda += 1;
//                } else {
//                    message.setPriceComment("-");
//                    message.setPriceApplied(message.getPriceLogistic());
//                }
////                System.out.println("maxxxxxxxxxx : "+max);
//
//                tolerancePercent = (tolerance.getWeightPercentage().divide(new BigDecimal(100)).multiply(message.getWeightSystem())).add(message.getWeightSystem());
//                toleranceAmount = message.getWeightSystem().add(tolerance.getWeightAmount());
//                max = tolerancePercent.max(toleranceAmount);
//                if (message.getWeightLogistic() != null && message.getWeightLogistic().compareTo(max) > 0) {
//                    message.setWeightComment("Beda");
//                    counterBeda += 1;
//                } else {
//                    message.setWeightComment("-");
//                    message.setWeightApplied(message.getWeightLogistic());
//                }
//
//                tolerancePercent = (tolerance.getInsuranceChargePercentage().divide(new BigDecimal(100)).multiply(message.getInsuranceChargeSystem())).add(message.getInsuranceChargeSystem());
//                toleranceAmount = message.getInsuranceChargeSystem().add(tolerance.getInsuranceChargeAmount());
//                max = tolerancePercent.max(toleranceAmount);
//                if (message.getInsuranceChargeLogistic() != null && message.getInsuranceChargeLogistic().compareTo(max) > 0) {
//                    message.setInsuranceChargeComment("Beda");
//                    counterBeda += 1;
//                } else {
//                    message.setInsuranceChargeComment("-");
//                    message.setInsuranceChargeApplied(message.getInsuranceChargeLogistic());
//                }
//
//                tolerancePercent = (tolerance.getOtherChargePercentage().divide(new BigDecimal(100)).multiply(message.getOtherChargeSystem())).add(message.getOtherChargeSystem());
//                toleranceAmount = message.getOtherChargeSystem().add(tolerance.getOtherChargeAmount());
//                max = tolerancePercent.max(toleranceAmount);
//                if (message.getOtherChargeLogistic() != null && message.getOtherChargeLogistic().compareTo(max) > 0) {
//                    message.setOtherChargeComment("Beda");
//                    counterBeda += 1;
//                } else {
//                    message.setOtherChargeComment("-");
//                    message.setOtherChargeApplied(message.getOtherChargeLogistic());
//                }
//
//                tolerancePercent = (tolerance.getTotalShippingPercentage().divide(new BigDecimal(100)).multiply(message.getTotalChargeSystem())).add(message.getTotalChargeSystem());
//                toleranceAmount = message.getTotalChargeSystem().add(tolerance.getTotalShippingAmount());
//                max = tolerancePercent.max(toleranceAmount);
//                if (message.getTotalChargeLogistic() != null && message.getTotalChargeLogistic().compareTo(max) > 0) {
//                    message.setTotalChargeComment("Beda");
//                    counterBeda += 1;
//                } else {
//                    message.setTotalChargeComment("-");
//                    message.setTotalChargeApplied(message.getTotalChargeLogistic());
//                }

                //klo ada data yg beda status si awb nya jadi problem exist, klo ngga berarti OK
                setReconStatus(counterBeda, message);
//                if (counterBeda != 0) {
//                    message.setReconStatus("Problem Exist");
//                    problem += 1;
//                } else {
//                    message.setReconStatus("OK");
//                }               

            } else {
                message.setReconStatus("Not Exist");
            }

            //tambahin ke tagihan   
            String tambah = message.getTotalChargeLogistic().toString();
//                System.out.println("TAGIHANNNNNN "+new BigDecimal(tambah,new MathContext(2)));
//                tagihan=tagihan.add(new BigDecimal(tambah,new MathContext(2)));
//                
//                System.out.println("tambah ------------- "+tambah);
//                System.out.println("JUMLAH ------------- "+tagihan);

            //klo uda dibandingin di save
            awbRepository.save(message);
//            System.out.println("counter "+counterFromCompare);
//            for (Map.Entry<String, String> entry : compare.map.entrySet()) {
//                String key = entry.getKey();
//                if (key.equals(message.getUploadHistoryNumber())) {
//                    c+=1;
//                }
//                if (c > 2) {
//                    break;
//                }
//            }
//            if (c <= 1) {
//                UploadHistory upload = uploadHistoryService.getById(message.getUploadHistoryNumber());
//                if (upload != null) {
//                    upload.setStatus("Done Uploaded");
//                    System.out.println("=======aaaaaaaaaaaaaaaaaaaaaaaa");
//                    uploadHistoryService.addUploadHistory(upload);
//                    //    admin.deleteQueue(BoliviaApplication.queueName);
//                }
//                //counter = 0;
//            }
            //}
//            if (counterFromCompare==0) {
//                UploadHistory upload = uploadHistoryService.getById(Integer.parseInt(message.getUploadHistoryNumber()));
//                if (upload != null) {
//                    if (upload.getStatus().equals("Uploaded")) {
//                        if(problem >0)
//                        {
//                            upload.setStatus("Problem Exist");
//                        }
//                        else
//                        {
//                            upload.setStatus("OK");
//                        }
//                        
//                        upload.setProblemExist(problem.toString());
//                        Integer ok = compare.counter - problem;
//                        upload.setOk(ok.toString());
//                        upload.setJumlahTagihan(tagihan);
//                        System.out.println("=======aaaaaaaaaaaaaaaaaaaaaaaa" + problem + " " + compare.counter);
//                        System.out.println("iiiiddddd" + upload.getId().toString());
////                        Thread.sleep(500);
//                        uploadHistoryService.addUploadHistory(upload);
////                        Thread.sleep(500);
//                        //    admin.deleteQueue(BoliviaApplication.queueName);
//                        counter = 0;
//                        compare.counter = 0;
//                        problem = 0;
//                        cekupload = true;
//                        System.out.println("Tagihan ----------------- : "+tagihan);
//                        tagihan=new BigDecimal(0);
//                    }
//                }
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
