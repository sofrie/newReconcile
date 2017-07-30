/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.entity;

import com.gdn.scm.bolivia.BoliviaApplication;
import com.gdn.scm.bolivia.repository.AWBRepository;
import com.gdn.scm.bolivia.services.ProcessService;
import com.gdn.scm.bolivia.services.ToleranceService;
import com.gdn.scm.bolivia.services.UploadHistoryService;
import com.gdn.scm.bolivia.receiver.Receiver;
import com.gdn.scm.bolivia.services.AWBService;
import com.gdn.scm.bolivia.services.InvoiceService;
import com.gdn.scm.bolivia.services.LogisticProviderService;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.redisson.Redisson;
import org.redisson.api.RMap;
import org.redisson.api.RedissonClient;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sofrie.zumaytis
 */
@Service
public class Compare {

    @Autowired
    AWBRepository awbRepository;

    @Autowired
    AWBService aWBService;

    @Autowired
    InvoiceService invoiceService;

    @Autowired
    ProcessService processService;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    UploadHistoryService uploadHistoryService;

    @Autowired
    ToleranceService toleranceService;

    @Autowired
    LogisticProviderService logisticProviderService;

    @Autowired
    Receiver receiver;

    public Integer counter = 0;

    public List<AWB> listAWB = new ArrayList();

    RedissonClient redisson = Redisson.create();
    public RMap<String, String> map = redisson.getMap("myMap");
    //public RList<RList<String>> list = redisson.getList("myList");

    public Compare() {
        counter = 0;
//        try {     
//            // get input excel files
//            FileInputStream excellFile1 = new FileInputStream(new File(
//                    "D:\\EXCEL\\Book1.xlsx"));
//            FileInputStream excellFile2 = new FileInputStream(new File(
//                    "D:\\EXCEL\\Book2.xlsx"));
//
//            // Create Workbook instance holding reference to .xlsx file
//            XSSFWorkbook workbook1 = new XSSFWorkbook(excellFile1);
//            XSSFWorkbook workbook2 = new XSSFWorkbook(excellFile2);
//
//            // Get first/desired sheet from the workbook
//            XSSFSheet sheet1 = workbook1.getSheetAt(0);
//            XSSFSheet sheet2 = workbook2.getSheetAt(0);
//
//            // Compare sheets
//            if(compareTwoSheets(sheet1, sheet2)) {
//                System.out.println("\n\nThe two excel sheets are Equal");
//            } else {
//                System.out.println("\n\nThe two excel sheets are Not Equal");
//            }
//            
//            //close files
//            excellFile1.close();
//            excellFile2.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    public void Send(XSSFSheet sheet1) {
//        int firstRow1 = sheet1.getFirstRowNum();
//        int lastRow1 = sheet1.getLastRowNum();
        String numberAWB = "";
        try {
            AWB awb;
            UploadHistory upload = uploadHistoryService.findTop1ByOrderByIdDesc();

            Invoice currentInvoice;
            currentInvoice = invoiceService.findByMonthAndYearAndLogisticName(upload.getMonth(), upload.getYear(), upload.getLogistic());
            currentInvoice.setStatusInvoice("On Process");
            currentInvoice.setTagihan(new BigDecimal(0));
            invoiceService.updateInvoice(currentInvoice);

            Iterator<Row> itr = sheet1.iterator();
            Boolean ada = false;
            while (itr.hasNext() && !ada) {
                Row row = itr.next();
                if (row.getRowNum() >= 1) {
                    awb = new AWB();
                    Cell awbNumberCell = row.getCell(2);
                    if (awbNumberCell != null) {
                        try {
                            awb = aWBService.findByAwbNumberAndInvoice(awbNumberCell.getStringCellValue(), currentInvoice);
                            System.out.println("awb 1 " + awb.getId());
                        } catch (Exception e) {
                            awb = new AWB();
                            awb.setId(UUID.randomUUID().toString());
                            awb.setAwbNumber(awbNumberCell.getStringCellValue());
                            System.out.println("awb 2 " + awb.getId());
                        }
                        awb.setAwbNumber(awbNumberCell.getStringCellValue());
//                        System.out.println("awb 2 " + awb.getId());
                        setAWB(awb, row, upload);

//                        awb.setReconStatus("Not Exist");
//
//                        Cell kodeOriginCell = row.getCell(3);
//                        awb.setKodeOriginAPI(kodeOriginCell.getStringCellValue());
//
//                        Cell GDNRef = row.getCell(4);
//                        awb.setGdnRef(NumberToTextConverter.toText(GDNRef.getNumericCellValue()));
////                        System.out.println("GDN REF : " + awb.getGdnRef());
//
//                        Cell kodeDestinasiCell = row.getCell(5);
//                        awb.setKodeDestinasiAPI(kodeDestinasiCell.getStringCellValue());
//
//                        Cell penerimaCell = row.getCell(6);
//                        awb.setNamaPenerimaAPI(penerimaCell.getStringCellValue());
//
//                        Cell weightCell = row.getCell(8);
//                        awb.setWeightLogistic(new BigDecimal(weightCell.getNumericCellValue()));
//
//                        Cell awbPricePerKgCell = row.getCell(9);
//                        awb.setPriceLogistic(new BigDecimal(awbPricePerKgCell.getNumericCellValue()).divide(new BigDecimal(weightCell.getNumericCellValue())));
//
//                        Cell awbInsuranceChargeCell = row.getCell(10);
//                        awb.setInsuranceChargeLogistic(new BigDecimal(awbInsuranceChargeCell.getNumericCellValue()));
////                Cell awbGiftWrapChargeCell = row.getCell(5);
//                        awb.setGiftWrapChargeLogistic(new BigDecimal(0));
//
//                        Cell awbOtherChargeCell = row.getCell(11);
//                        awb.setOtherChargeLogistic(new BigDecimal(awbOtherChargeCell.getNumericCellValue()));
//
//                        Cell awbTotalChargeCell = row.getCell(12);
//                        awb.setTotalChargeLogistic(new BigDecimal(awbTotalChargeCell.getNumericCellValue(), new MathContext(0)));
//
//                        awb.setMerchantCode("MERCH-CODE-007");
//                        awb.setUploadHistoryNumber(upload.getId().toString());
//                        awb.setMonth(upload.getMonth());
//                        awb.setYear(upload.getYear());
//                        awb.setLogisticName(upload.getLogistic());
                        try {
                            awb.setInvoice(currentInvoice);
                        } catch (Exception e) {
                            System.out.println("gagal tambah invoice di AWB");
                            e.printStackTrace();
                        }
                        aWBService.addAWB(awb, false);

                        counter++;
                        awb.setCounter(counter);
                        map.put(awb.getAwbNumber(), awb.getUploadHistoryNumber());
                        listAWB.add(awb);//              
//                        System.out.println("counterrrrrrrrrrr---------------" + counter);
                    } else {
                        ada = true;
                    }
                }
            }
            receiver.cekupload = false;
            numberAWB = listAWB.get(0).getUploadHistoryNumber();
            sentProcess();
//            for (int i = 0; i < listAWB.size(); i++) {
//                listAWB.get(i).counter = counter;
//                processService.requestProcess(listAWB.get(i));
////                System.out.println("iiii" + i);
////                System.out.println("id : " + listAWB.get(i).getId());
//                if (i == 0) {
//                    numberAWB = listAWB.get(i).getUploadHistoryNumber();
//                }
//            }
//            listAWB = new ArrayList();
            Integer tmp = receiver.counterFromCompare;
            waitUntilDone(tmp);
//            while (tmp > 1) {
//                Thread.sleep(500);
//                tmp = receiver.counterFromCompare;
//                System.out.println("tmp " + tmp);
//            }
            Thread.sleep(500);
//            System.out.println("number awb " + numberAWB);

            if (upload != null) {
                setStatusInvoiceAndUploadHistory( currentInvoice,  upload);
            } else {
//                System.out.println("lllllllllllllllllll");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public AWB requestProcess(AWB awb) {
        System.out.println("Reques process" + awb);
        rabbitTemplate.convertAndSend(BoliviaApplication.queueName, awb);
        return awb;
    }

    public UploadHistory setProblemExistAndOK(UploadHistory upload) {
        upload.setProblemExist(receiver.problem.toString());
        Integer ok = counter - receiver.problem;
        upload.setOk(ok.toString());

        return upload;
    }

    public void setTagihan(Invoice currentInvoice, UploadHistory upload) {
        try {
            LogisticProvider logistic = logisticProviderService.findById(currentInvoice.getLogisticProvider().getId());
            BigDecimal b = aWBService.countTotalPriceLogistic(currentInvoice);
            BigDecimal totalTagihan = b.add((logistic.getVat()).divide(new BigDecimal(100)).multiply(b)).subtract((logistic.getDiscount()).divide(new BigDecimal(100)).multiply(b));
            totalTagihan = totalTagihan.add(aWBService.countTotalnsuranceLogistic(currentInvoice));
            upload.setJumlahTagihan(totalTagihan);
            currentInvoice.setTagihan(totalTagihan);
        } catch (Exception e) {
            System.out.println("gagal tagihan");
        }
    }

    public void reset(Invoice currentInvoice, UploadHistory upload) {
        invoiceService.updateInvoice(currentInvoice);
        uploadHistoryService.addUploadHistory(upload);
        counter = 0;
        receiver.counter = 0;
        receiver.problem = 0;
        receiver.cekupload = true;
        receiver.tagihan = new BigDecimal(0);
    }

    public void setStatusInvoiceAndUploadHistory(Invoice currentInvoice, UploadHistory upload) {
        if (upload.getStatus().equals("Uploaded")) {
            if (receiver.problem > 0) {
                currentInvoice.setStatusInvoice("Problem Exist");
                upload.setStatus("Problem Exist");
            } else {
                upload.setStatus("OK");
                currentInvoice.setStatusInvoice("OK");
            }

            upload = setProblemExistAndOK(upload);
            setTagihan(currentInvoice, upload);
//            try {
//                LogisticProvider logistic = logisticProviderService.findById(currentInvoice.getLogisticProvider().getId());
//                BigDecimal b = aWBService.countTotalPriceLogistic(currentInvoice);
//
//                BigDecimal totalTagihan = b.add((logistic.getVat()).divide(new BigDecimal(100)).multiply(b)).subtract((logistic.getDiscount()).divide(new BigDecimal(100)).multiply(b));
//                totalTagihan = totalTagihan.add(aWBService.countTotalnsuranceLogistic(currentInvoice));
//
//                upload.setJumlahTagihan(totalTagihan);
//                currentInvoice.setTagihan(totalTagihan);
//            } catch (Exception e) {
//                System.out.println("gagal tagihan");
//            }

            reset(currentInvoice, upload);
//            invoiceService.updateInvoice(currentInvoice);
//            uploadHistoryService.addUploadHistory(upload);
//            counter = 0;
//            receiver.counter = 0;
//            receiver.problem = 0;
//            receiver.cekupload = true;
//                    System.out.println("Tagihan ----------------- : " + receiver.tagihan);
//            receiver.tagihan = new BigDecimal(0);
        }
    }

    public void waitUntilDone(Integer tmp) throws InterruptedException {
        while (tmp > 1) {
            Thread.sleep(500);
            tmp = receiver.counterFromCompare;
            System.out.println("tmp " + tmp);
        }
    }

    public void sentProcess() {
        for (int i = 0; i < listAWB.size(); i++) {
            listAWB.get(i).counter = counter;
            processService.requestProcess(listAWB.get(i));
        }
        listAWB = new ArrayList();
    }

    public AWB setAWB(AWB awb, Row row, UploadHistory upload) {
        awb.setReconStatus("Not Exist");

        Cell kodeOriginCell = row.getCell(3);
        awb.setKodeOriginAPI(kodeOriginCell.getStringCellValue());

        Cell GDNRef = row.getCell(4);
        awb.setGdnRef(NumberToTextConverter.toText(GDNRef.getNumericCellValue()));

        Cell kodeDestinasiCell = row.getCell(5);
        awb.setKodeDestinasiAPI(kodeDestinasiCell.getStringCellValue());

        Cell penerimaCell = row.getCell(6);
        awb.setNamaPenerimaAPI(penerimaCell.getStringCellValue());

        Cell weightCell = row.getCell(8);
        awb.setWeightLogistic(new BigDecimal(weightCell.getNumericCellValue()));

        Cell awbPricePerKgCell = row.getCell(9);
        awb.setPriceLogistic(new BigDecimal(awbPricePerKgCell.getNumericCellValue()).divide(new BigDecimal(weightCell.getNumericCellValue())));

        Cell awbInsuranceChargeCell = row.getCell(10);
        awb.setInsuranceChargeLogistic(new BigDecimal(awbInsuranceChargeCell.getNumericCellValue()));
//                Cell awbGiftWrapChargeCell = row.getCell(5);
        awb.setGiftWrapChargeLogistic(new BigDecimal(0));

        Cell awbOtherChargeCell = row.getCell(11);
        awb.setOtherChargeLogistic(new BigDecimal(awbOtherChargeCell.getNumericCellValue()));

        Cell awbTotalChargeCell = row.getCell(12);
        awb.setTotalChargeLogistic(new BigDecimal(awbTotalChargeCell.getNumericCellValue(), new MathContext(0)));

        awb.setMerchantCode("MERCH-CODE-007");
        awb.setUploadHistoryNumber(upload.getId().toString());
        awb.setMonth(upload.getMonth());
        awb.setYear(upload.getYear());
        awb.setLogisticName(upload.getLogistic());

        return awb;
    }
}
