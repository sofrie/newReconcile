/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.services;

import com.gdn.scm.bolivia.entity.AWB;
import com.gdn.scm.bolivia.entity.Invoice;
import com.gdn.scm.bolivia.repository.AWBRepository;
import com.gdn.scm.bolivia.request.AWBRequest;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 *
 * @author sofrie.zumaytis
 */
@Service
public class AWBServiceImpl implements AWBService {

    @Autowired
    AWBRepository aWBRepository;

    @Override
    public void addAWB(AWBRequest a) {
        AWB awb = new AWB();
        BeanUtils.copyProperties(a, awb);
        awb.setId(UUID.randomUUID().toString());
        try {
            aWBRepository.save(awb);
        } catch (Exception e) {
            System.out.println("gagal awb---------");
            e.printStackTrace();
        }
    }

    @Override
    public List<AWB> getAll() {
        return aWBRepository.findAll();
    }

    @Override
    public List<AWB> getByStatus(String status) {
        if (status.equals("All")) {
            return aWBRepository.findAll();
        } else {
            return aWBRepository.findByReconStatus(status);
        }
    }

    @Override
    public void updateAWB(AWB a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteAWB(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AWB> getByMonth(Integer month) {
        return aWBRepository.findByMonth(month);
    }

    @Override
    public List<AWB> getByYear(Integer year) {
        return aWBRepository.findByYear(year);
    }

    @Override
    public List<AWB> getByLogisticName(String logisticName) {
        return aWBRepository.findByLogisticName(logisticName);
    }

    @Override
    public List<String> selectAllYear() {
        return aWBRepository.selectAllYear();
    }

    @Override
    public List<AWB> getByAwbNumber(String awbNumber) {
        return aWBRepository.findByAwbNumber(awbNumber);
    }

//    @Override
//    public List<AWB> getByMerchantCode(String merchantCode) {
//        return aWBRepository.findByMerchantCode(merchantCode);
//    }
//
//    @Override
//    public List<AWB> getByGdnRef(String gdnRef) {
//        return aWBRepository.findByGdnRef(gdnRef);
//    }
//
//    @Override
//    public List<AWB> filterAll(Integer month, Integer year, String logisticName, String AwbNumber, String reconStatus, String merchantCode, String gdnRef) {
//        if (reconStatus.equals("All")) {
//            return aWBRepository.filterAllExceptStatus(month, year, logisticName, AwbNumber, merchantCode, gdnRef);
//        } else {
//            return aWBRepository.filterAll(month, year, logisticName, AwbNumber, reconStatus, merchantCode, gdnRef);
//        }
//    }

    @Override
    public void addAWB(AWB a, Boolean isUpdate) {
        AWB awb = new AWB();
        BeanUtils.copyProperties(a, awb);

        try {
            aWBRepository.save(awb);
        } catch (Exception e) {
            System.out.println("gagal awb---------");
            e.printStackTrace();
        }
    }

    @Override
    public Page<AWB> findAll(Pageable pageable) {
        return aWBRepository.findAll(pageable);
    }

    @Override
    public Page<AWB> findByStatus(String status, Pageable pageable) {
        if (status.equals("All")) {
            return aWBRepository.findAll(pageable);
        } else {
            return aWBRepository.findByReconStatus(status, pageable);
        }
    }

    @Override
    public Page<AWB> findByMonth(Integer month, Pageable pageable) {
        return aWBRepository.findByMonth(month, pageable);
    }

    @Override
    public Page<AWB> findByYear(Integer year, Pageable pageable) {
        return aWBRepository.findByYear(year, pageable);
    }

    @Override
    public Page<AWB> findByLogisticName(String logisticName, Pageable pageable) {
        return aWBRepository.findByLogisticName(logisticName, pageable);
    }

    @Override
    public BigDecimal countTotalTagihan() {
        return aWBRepository.countTotalTagihan();
    }

    @Override
    public Page<AWB> sortByAWBNumberAsc(Pageable pageable) {
        return aWBRepository.sortByAWBNumberAsc(pageable);
    }

    @Override
    public AWB findByAwbNumberAndInvoice(String awbNumber, Invoice invoice) {
        return aWBRepository.findByAwbNumberAndInvoice(awbNumber, invoice);
    }

    @Override
    public BigDecimal countTagihan(Invoice invoice) {
        return aWBRepository.countTagihan(invoice);
    }

    @Override
    public Page<AWB> getByMerchantCode(String merchantCode, Pageable pageable) {
        return aWBRepository.findByMerchantCode(merchantCode, pageable);
    }

    @Override
    public Page<AWB> getByGdnRef(String gdnRef, Pageable pageable) {
        return aWBRepository.findByGdnRef(gdnRef,pageable);
    }

    @Override
    public Page<AWB> filterAll(Integer month, Integer year, String logisticName, String AwbNumber, String reconStatus, String merchantCode, String gdnRef, Pageable pageable) {
        if (reconStatus.equals("All")) {
            return aWBRepository.filterAllExceptStatus(month, year, logisticName, AwbNumber, merchantCode, gdnRef, pageable);
        } else {
            return aWBRepository.filterAll(month, year, logisticName, AwbNumber, reconStatus, merchantCode, gdnRef, pageable);
        }
    }

    @Override
    public Page<AWB> filterByInvoice(Integer month, Integer year, String logisticName, Pageable pageable) {
        return aWBRepository.filterByInvoice(month,year,logisticName,pageable);
    }
    
    
    
    //sorting awb
     @Override
    public Page<AWB> findAllSortByAwbNumberASC(Pageable pageable) {
        return aWBRepository.findAllSortByAwbNumberASC(pageable);
    }
    @Override
    public Page<AWB> findAllSortByAwbNumberDESC(Pageable pageable) {
        return aWBRepository.findAllSortByAwbNumberDESC(pageable);
    }
    
    @Override
    public Page<AWB> findMonthSortByAwbNumberASC(Integer month,Pageable pageable) {
        return aWBRepository.findMonthSortByAwbNumberASC(month,pageable);
    }
    @Override
    public Page<AWB> findMonthSortByAwbNumberDESC(Integer month,Pageable pageable) {
        return aWBRepository.findMonthSortByAwbNumberDESC(month,pageable);
    }

    @Override
    public Page<AWB> findYearSortByAwbNumberASC(Integer year, Pageable pageable) {
        return aWBRepository.findYearSortByAwbNumberASC(year,pageable);
    }

    @Override
    public Page<AWB> findYearSortByAwbNumberDESC(Integer year, Pageable pageable) {
        return aWBRepository.findYearSortByAwbNumberDESC(year,pageable);
    }

    @Override
    public Page<AWB> findStatusSortByAwbNumberASC(String status, Pageable pageable) {
        if (status.equals("All")) {
            return aWBRepository.findAllSortByAwbNumberASC(pageable);
        } else {
             return aWBRepository.findReconStatusSortByAwbNumberASC(status,pageable);
        }
       
    }

    @Override
    public Page<AWB> findStatusSortByAwbNumberDESC(String status, Pageable pageable) {
        if (status.equals("All")) {
            return aWBRepository.findAllSortByAwbNumberDESC(pageable);
        } else {
             return aWBRepository.findReconStatusSortByAwbNumberDESC(status,pageable);
        }
    }

    @Override
    public Page<AWB> findLogisticSortByAwbNumberASC(String logistic, Pageable pageable) {
        return aWBRepository.findLogisticSortByAwbNumberASC(logistic,pageable);
    }

    @Override
    public Page<AWB> findLogisticSortByAwbNumberDESC(String logistic, Pageable pageable) {
        return aWBRepository.findLogisticSortByAwbNumberDESC(logistic,pageable);
    }

    @Override
    public Page<AWB> findMerchantCodeSortByAwbNumberASC(String merchantCode, Pageable pageable) {
        return aWBRepository.findMerchantCodeSortByAwbNumberASC(merchantCode,pageable);
    }

    @Override
    public Page<AWB> findMerchantCodeSortByAwbNumberDESC(String merchantCode, Pageable pageable) {
        return aWBRepository.findMerchantCodeSortByAwbNumberDESC(merchantCode,pageable);
    }

    @Override
    public List<AWB> findAwbNumberSortByAwbNumberASC(String awbNumber) {
        return aWBRepository.findAwbNumberSortByAwbNumberASC(awbNumber);
    }

    @Override
    public List<AWB> findAwbNumberSortByAwbNumberDESC(String awbNumber) {
        return aWBRepository.findAwbNumberSortByAwbNumberDESC(awbNumber);
    }

    @Override
    public Page<AWB> findGdnRefSortByAwbNumberASC(String gdnRef, Pageable pageable) {
        return aWBRepository.findGdnRefSortByAwbNumberASC(gdnRef,pageable);
    }

    @Override
    public Page<AWB> findGdnRefSortByAwbNumberDESC(String gdnRef, Pageable pageable) {
        return aWBRepository.findGdnRefSortByAwbNumberDESC(gdnRef,pageable);
    }

    @Override
    public Page<AWB> filterAllSortByAwbNumberASC(Integer month, Integer year, String logisticName, String AwbNumber, String reconStatus, String merchantCode, String gdnRef, Pageable pageable) {
        if (reconStatus.equals("All")) {
            return aWBRepository.filterAllExceptStatusSortByAwbNumberASC(month, year, logisticName, AwbNumber, merchantCode, gdnRef,pageable);
        } else {
            return aWBRepository.filterAllSortByAwbNumberASC(month, year, logisticName, AwbNumber, reconStatus, merchantCode, gdnRef,pageable);
        }
    }

    @Override
    public Page<AWB> filterAllSortByAwbNumberDESC(Integer month, Integer year, String logisticName, String AwbNumber, String reconStatus, String merchantCode, String gdnRef, Pageable pageable) {
        if (reconStatus.equals("All")) {
            return aWBRepository.filterAllExceptStatusSortByAwbNumberDESC(month, year, logisticName, AwbNumber, merchantCode, gdnRef,pageable);
        } else {
            return aWBRepository.filterAllSortByAwbNumberDESC(month, year, logisticName, AwbNumber, reconStatus, merchantCode, gdnRef,pageable);
        }
    }

    @Override
    public Page<AWB> filterByInvoiceSortByAwbNumberASC(Integer month, Integer year, String logisticName, Pageable pageable) {
        return aWBRepository.filterByInvoiceSortByAwbNumberASC(month,year,logisticName,pageable);
    }

    @Override
    public Page<AWB> filterByInvoiceSortByAwbNumberDESC(Integer month, Integer year, String logisticName, Pageable pageable) {
        return aWBRepository.filterByInvoiceSortByAwbNumberDESC(month,year,logisticName,pageable);
    }
    
    
    
    
    //sorting by ReconStatus
    
    @Override
    public Page<AWB> findAllSortByStatusASC(Pageable pageable) {
        return aWBRepository.findAllSortByReconStatusASC(pageable);
    }
    @Override
    public Page<AWB> findAllSortByStatusDESC(Pageable pageable) {
        return aWBRepository.findAllSortByReconStatusDESC(pageable);
    }
    
    @Override
    public Page<AWB> findMonthSortByStatusASC(Integer month,Pageable pageable) {
        return aWBRepository.findMonthSortByReconStatusASC(month,pageable);
    }
    @Override
    public Page<AWB> findMonthSortByStatusDESC(Integer month,Pageable pageable) {
        return aWBRepository.findMonthSortByReconStatusDESC(month,pageable);
    }

    @Override
    public Page<AWB> findYearSortByStatusASC(Integer year, Pageable pageable) {
        return aWBRepository.findYearSortByReconStatusASC(year,pageable);
    }

    @Override
    public Page<AWB> findYearSortByStatusDESC(Integer year, Pageable pageable) {
        return aWBRepository.findYearSortByReconStatusDESC(year,pageable);
    }

    @Override
    public Page<AWB> findStatusSortByStatusASC(String status, Pageable pageable) {
        if (status.equals("All")) {
            return aWBRepository.findAllSortByReconStatusASC(pageable);
        } else {
             return aWBRepository.findReconStatusSortByReconStatusASC(status,pageable);
        }
       
    }

    @Override
    public Page<AWB> findStatusSortByStatusDESC(String status, Pageable pageable) {
        if (status.equals("All")) {
            return aWBRepository.findAllSortByReconStatusDESC(pageable);
        } else {
             return aWBRepository.findReconStatusSortByReconStatusDESC(status,pageable);
        }
    }

    @Override
    public Page<AWB> findLogisticSortByStatusASC(String logistic, Pageable pageable) {
        return aWBRepository.findLogisticSortByReconStatusASC(logistic,pageable);
    }

    @Override
    public Page<AWB> findLogisticSortByStatusDESC(String logistic, Pageable pageable) {
        return aWBRepository.findLogisticSortByReconStatusDESC(logistic,pageable);
    }

    @Override
    public Page<AWB> findMerchantCodeSortByStatusASC(String merchantCode, Pageable pageable) {
        return aWBRepository.findMerchantCodeSortByReconStatusASC(merchantCode,pageable);
    }

    @Override
    public Page<AWB> findMerchantCodeSortByStatusDESC(String merchantCode, Pageable pageable) {
        return aWBRepository.findMerchantCodeSortByReconStatusDESC(merchantCode,pageable);
    }

    @Override
    public List<AWB> findAwbNumberSortByStatusASC(String awbNumber) {
        return aWBRepository.findAwbNumberSortByReconStatusASC(awbNumber);
    }

    @Override
    public List<AWB> findAwbNumberSortByStatusDESC(String awbNumber) {
        return aWBRepository.findAwbNumberSortByReconStatusDESC(awbNumber);
    }

    @Override
    public Page<AWB> findGdnRefSortByStatusASC(String gdnRef, Pageable pageable) {
        return aWBRepository.findGdnRefSortByReconStatusASC(gdnRef,pageable);
    }

    @Override
    public Page<AWB> findGdnRefSortByStatusDESC(String gdnRef, Pageable pageable) {
        return aWBRepository.findGdnRefSortByReconStatusDESC(gdnRef,pageable);
    }

    @Override
    public Page<AWB> filterAllSortByStatusASC(Integer month, Integer year, String logisticName, String AwbNumber, String reconStatus, String merchantCode, String gdnRef, Pageable pageable) {
        if (reconStatus.equals("All")) {
            return aWBRepository.filterAllExceptStatusSortByReconStatusASC(month, year, logisticName, AwbNumber, merchantCode, gdnRef,pageable);
        } else {
            return aWBRepository.filterAllSortByReconStatusASC(month, year, logisticName, AwbNumber, reconStatus, merchantCode, gdnRef,pageable);
        }
    }

    @Override
    public Page<AWB> filterAllSortByStatusDESC(Integer month, Integer year, String logisticName, String AwbNumber, String reconStatus, String merchantCode, String gdnRef, Pageable pageable) {
        if (reconStatus.equals("All")) {
            return aWBRepository.filterAllExceptStatusSortByReconStatusDESC(month, year, logisticName, AwbNumber, merchantCode, gdnRef,pageable);
        } else {
            return aWBRepository.filterAllSortByReconStatusDESC(month, year, logisticName, AwbNumber, reconStatus, merchantCode, gdnRef,pageable);
        }
    }

    @Override
    public Page<AWB> filterByInvoiceSortByStatusASC(Integer month, Integer year, String logisticName, Pageable pageable) {
        return aWBRepository.filterByInvoiceSortByReconStatusASC(month,year,logisticName,pageable);
    }

    @Override
    public Page<AWB> filterByInvoiceSortByStatusDESC(Integer month, Integer year, String logisticName, Pageable pageable) {
        return aWBRepository.filterByInvoiceSortByReconStatusDESC(month,year,logisticName,pageable);
    }
    
    
    
    //sorting awb by GdnRef
     @Override
    public Page<AWB> findAllSortByGdnRefASC(Pageable pageable) {
        return aWBRepository.findAllSortByGdnRefASC(pageable);
    }
    @Override
    public Page<AWB> findAllSortByGdnRefDESC(Pageable pageable) {
        return aWBRepository.findAllSortByGdnRefDESC(pageable);
    }
    
    @Override
    public Page<AWB> findMonthSortByGdnRefASC(Integer month,Pageable pageable) {
        return aWBRepository.findMonthSortByGdnRefASC(month,pageable);
    }
    @Override
    public Page<AWB> findMonthSortByGdnRefDESC(Integer month,Pageable pageable) {
        return aWBRepository.findMonthSortByGdnRefDESC(month,pageable);
    }

    @Override
    public Page<AWB> findYearSortByGdnRefASC(Integer year, Pageable pageable) {
        return aWBRepository.findYearSortByGdnRefASC(year,pageable);
    }

    @Override
    public Page<AWB> findYearSortByGdnRefDESC(Integer year, Pageable pageable) {
        return aWBRepository.findYearSortByGdnRefDESC(year,pageable);
    }

    @Override
    public Page<AWB> findStatusSortByGdnRefASC(String status, Pageable pageable) {
        if (status.equals("All")) {
            return aWBRepository.findAllSortByGdnRefASC(pageable);
        } else {
             return aWBRepository.findReconStatusSortByGdnRefASC(status,pageable);
        }
       
    }

    @Override
    public Page<AWB> findStatusSortByGdnRefDESC(String status, Pageable pageable) {
        if (status.equals("All")) {
            return aWBRepository.findAllSortByGdnRefDESC(pageable);
        } else {
             return aWBRepository.findReconStatusSortByGdnRefDESC(status,pageable);
        }
    }

    @Override
    public Page<AWB> findLogisticSortByGdnRefASC(String logistic, Pageable pageable) {
        return aWBRepository.findLogisticSortByGdnRefASC(logistic,pageable);
    }

    @Override
    public Page<AWB> findLogisticSortByGdnRefDESC(String logistic, Pageable pageable) {
        return aWBRepository.findLogisticSortByGdnRefDESC(logistic,pageable);
    }

    @Override
    public Page<AWB> findMerchantCodeSortByGdnRefASC(String merchantCode, Pageable pageable) {
        return aWBRepository.findMerchantCodeSortByGdnRefASC(merchantCode,pageable);
    }

    @Override
    public Page<AWB> findMerchantCodeSortByGdnRefDESC(String merchantCode, Pageable pageable) {
        return aWBRepository.findMerchantCodeSortByGdnRefDESC(merchantCode,pageable);
    }

    @Override
    public List<AWB> findAwbNumberSortByGdnRefASC(String awbNumber) {
        return aWBRepository.findGdnRefSortByGdnRefASC(awbNumber);
    }

    @Override
    public List<AWB> findAwbNumberSortByGdnRefDESC(String awbNumber) {
        return aWBRepository.findGdnRefSortByGdnRefDESC(awbNumber);
    }

    @Override
    public Page<AWB> findGdnRefSortByGdnRefASC(String gdnRef, Pageable pageable) {
        return aWBRepository.findGdnRefSortByGdnRefASC(gdnRef,pageable);
    }

    @Override
    public Page<AWB> findGdnRefSortByGdnRefDESC(String gdnRef, Pageable pageable) {
        return aWBRepository.findGdnRefSortByGdnRefDESC(gdnRef,pageable);
    }

    @Override
    public Page<AWB> filterAllSortByGdnRefASC(Integer month, Integer year, String logisticName, String GdnRef, String reconStatus, String merchantCode, String gdnRef, Pageable pageable) {
        if (reconStatus.equals("All")) {
            return aWBRepository.filterAllExceptStatusSortByGdnRefASC(month, year, logisticName, GdnRef, merchantCode, gdnRef,pageable);
        } else {
            return aWBRepository.filterAllSortByGdnRefASC(month, year, logisticName, GdnRef, reconStatus, merchantCode, gdnRef,pageable);
        }
    }

    @Override
    public Page<AWB> filterAllSortByGdnRefDESC(Integer month, Integer year, String logisticName, String GdnRef, String reconStatus, String merchantCode, String gdnRef, Pageable pageable) {
        if (reconStatus.equals("All")) {
            return aWBRepository.filterAllExceptStatusSortByGdnRefDESC(month, year, logisticName, GdnRef, merchantCode, gdnRef,pageable);
        } else {
            return aWBRepository.filterAllSortByGdnRefDESC(month, year, logisticName, GdnRef, reconStatus, merchantCode, gdnRef,pageable);
        }
    }

    @Override
    public Page<AWB> filterByInvoiceSortByGdnRefASC(Integer month, Integer year, String logisticName, Pageable pageable) {
        return aWBRepository.filterByInvoiceSortByGdnRefASC(month,year,logisticName,pageable);
    }

    @Override
    public Page<AWB> filterByInvoiceSortByGdnRefDESC(Integer month, Integer year, String logisticName, Pageable pageable) {
        return aWBRepository.filterByInvoiceSortByGdnRefDESC(month,year,logisticName,pageable);
    }

    @Override
    public BigDecimal countTotalPriceLogistic(Invoice invoice) {
        return aWBRepository.countTotalPriceLogistic(invoice);
    }

    @Override
    public BigDecimal countTotalnsuranceLogistic(Invoice invoice) {
        return aWBRepository.countTotalInsuranceLogistic(invoice);
    }

}
