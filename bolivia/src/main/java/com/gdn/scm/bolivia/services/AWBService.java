/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.services;

import com.gdn.scm.bolivia.entity.AWB;
import com.gdn.scm.bolivia.entity.Invoice;
import com.gdn.scm.bolivia.request.AWBRequest;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 *
 * @author sofrie.zumaytis
 */
public interface AWBService {

    void addAWB(AWBRequest a);

    void addAWB(AWB a, Boolean isUpdate);

    List<AWB> getAll();

    List<AWB> getByStatus(String status);

    List<AWB> getByYear(Integer year);

    List<AWB> getByLogisticName(String logisticName);

    List<AWB> getByMonth(Integer month);

    List<String> selectAllYear();

    List<AWB> getByAwbNumber(String awbNumber);


    void updateAWB(AWB a);

    void deleteAWB(Integer id);

    Page<AWB> findAll(Pageable pageable);

    Page<AWB> findByStatus(String status, Pageable pageable);

    Page<AWB> findByMonth(Integer month, Pageable pageable);

    Page<AWB> findByYear(Integer year, Pageable pageable);

    Page<AWB> findByLogisticName(String logisticName, Pageable pageable);

    BigDecimal countTotalTagihan();

    Page<AWB> sortByAWBNumberAsc(Pageable pageable);

    AWB findByAwbNumberAndInvoice(String awbNumber, Invoice invoice);

    BigDecimal countTagihan(Invoice invoice);
    
    
    BigDecimal countTotalPriceLogistic(Invoice invoice);
    BigDecimal countTotalnsuranceLogistic(Invoice invoice);
    
    
    
    Page<AWB> getByMerchantCode(String merchantCode,Pageable pageable);
    
    Page<AWB> getByGdnRef(String gdnRef,Pageable pageable);
    
    Page<AWB> filterAll(Integer month, Integer year, String logisticName, String AwbNumber, String reconStatus, String merchantCode, String gdnRef,Pageable pageable);
    Page<AWB> filterByInvoice(Integer month, Integer year, String logisticName,Pageable pageable);
    
    
    //pageable sorting awb
    Page<AWB> findAllSortByAwbNumberASC(Pageable pageable);
    Page<AWB> findAllSortByAwbNumberDESC(Pageable pageable);
    
    Page<AWB> findMonthSortByAwbNumberASC(Integer month,Pageable pageable);
    Page<AWB> findMonthSortByAwbNumberDESC(Integer month,Pageable pageable);
    
    Page<AWB> findYearSortByAwbNumberASC(Integer year,Pageable pageable);
    Page<AWB> findYearSortByAwbNumberDESC(Integer year,Pageable pageable);
    
    Page<AWB> findStatusSortByAwbNumberASC(String status,Pageable pageable);
    Page<AWB> findStatusSortByAwbNumberDESC(String status,Pageable pageable);
    
    Page<AWB> findLogisticSortByAwbNumberASC(String logistic,Pageable pageable);
    Page<AWB> findLogisticSortByAwbNumberDESC(String logistic,Pageable pageable);
    
    Page<AWB> findMerchantCodeSortByAwbNumberASC(String merchantCode,Pageable pageable);
    Page<AWB> findMerchantCodeSortByAwbNumberDESC(String merchantCode,Pageable pageable);
    
    List<AWB> findAwbNumberSortByAwbNumberASC(String awbNumber);
    List<AWB> findAwbNumberSortByAwbNumberDESC(String awbNumber);
    
    Page<AWB> findGdnRefSortByAwbNumberASC(String gdnRef,Pageable pageable);
    Page<AWB> findGdnRefSortByAwbNumberDESC(String gdnRef,Pageable pageable);
    
    Page<AWB> filterAllSortByAwbNumberASC(Integer month, Integer year, String logisticName, String AwbNumber, String reconStatus, String merchantCode, String gdnRef,Pageable pageable);
    Page<AWB> filterAllSortByAwbNumberDESC(Integer month, Integer year, String logisticName, String AwbNumber, String reconStatus, String merchantCode, String gdnRef,Pageable pageable);
    
    Page<AWB> filterByInvoiceSortByAwbNumberASC(Integer month, Integer year, String logisticName,Pageable pageable);
    Page<AWB> filterByInvoiceSortByAwbNumberDESC(Integer month, Integer year, String logisticName,Pageable pageable);
        
    
    
    //Sort by ReconStatus
    
    Page<AWB> findAllSortByStatusASC(Pageable pageable);
    Page<AWB> findAllSortByStatusDESC(Pageable pageable);
    
    Page<AWB> findMonthSortByStatusASC(Integer month,Pageable pageable);
    Page<AWB> findMonthSortByStatusDESC(Integer month,Pageable pageable);
    
    Page<AWB> findYearSortByStatusASC(Integer year,Pageable pageable);
    Page<AWB> findYearSortByStatusDESC(Integer year,Pageable pageable);
    
    Page<AWB> findStatusSortByStatusASC(String status,Pageable pageable);
    Page<AWB> findStatusSortByStatusDESC(String status,Pageable pageable);
    
    Page<AWB> findLogisticSortByStatusASC(String logistic,Pageable pageable);
    Page<AWB> findLogisticSortByStatusDESC(String logistic,Pageable pageable);
    
    Page<AWB> findMerchantCodeSortByStatusASC(String merchantCode,Pageable pageable);
    Page<AWB> findMerchantCodeSortByStatusDESC(String merchantCode,Pageable pageable);
    
    List<AWB> findAwbNumberSortByStatusASC(String awbNumber);
    List<AWB> findAwbNumberSortByStatusDESC(String awbNumber);
    
    Page<AWB> findGdnRefSortByStatusASC(String gdnRef,Pageable pageable);
    Page<AWB> findGdnRefSortByStatusDESC(String gdnRef,Pageable pageable);
    
    Page<AWB> filterAllSortByStatusASC(Integer month, Integer year, String logisticName, String AwbNumber, String reconStatus, String merchantCode, String gdnRef,Pageable pageable);
    Page<AWB> filterAllSortByStatusDESC(Integer month, Integer year, String logisticName, String AwbNumber, String reconStatus, String merchantCode, String gdnRef,Pageable pageable);
    
    Page<AWB> filterByInvoiceSortByStatusASC(Integer month, Integer year, String logisticName,Pageable pageable);
    Page<AWB> filterByInvoiceSortByStatusDESC(Integer month, Integer year, String logisticName,Pageable pageable);
    

    
    //pageable sorting by GdnRef
    Page<AWB> findAllSortByGdnRefASC(Pageable pageable);
    Page<AWB> findAllSortByGdnRefDESC(Pageable pageable);
    
    Page<AWB> findMonthSortByGdnRefASC(Integer month,Pageable pageable);
    Page<AWB> findMonthSortByGdnRefDESC(Integer month,Pageable pageable);
    
    Page<AWB> findYearSortByGdnRefASC(Integer year,Pageable pageable);
    Page<AWB> findYearSortByGdnRefDESC(Integer year,Pageable pageable);
    
    Page<AWB> findStatusSortByGdnRefASC(String status,Pageable pageable);
    Page<AWB> findStatusSortByGdnRefDESC(String status,Pageable pageable);
    
    Page<AWB> findLogisticSortByGdnRefASC(String logistic,Pageable pageable);
    Page<AWB> findLogisticSortByGdnRefDESC(String logistic,Pageable pageable);
    
    Page<AWB> findMerchantCodeSortByGdnRefASC(String merchantCode,Pageable pageable);
    Page<AWB> findMerchantCodeSortByGdnRefDESC(String merchantCode,Pageable pageable);
    
    List<AWB> findAwbNumberSortByGdnRefASC(String awbNumber);
    List<AWB> findAwbNumberSortByGdnRefDESC(String awbNumber);
    
    Page<AWB> findGdnRefSortByGdnRefASC(String gdnRef,Pageable pageable);
    Page<AWB> findGdnRefSortByGdnRefDESC(String gdnRef,Pageable pageable);
    
    Page<AWB> filterAllSortByGdnRefASC(Integer month, Integer year, String logisticName, String GdnRef, String reconStatus, String merchantCode, String gdnRef,Pageable pageable);
    Page<AWB> filterAllSortByGdnRefDESC(Integer month, Integer year, String logisticName, String GdnRef, String reconStatus, String merchantCode, String gdnRef,Pageable pageable);
    
    Page<AWB> filterByInvoiceSortByGdnRefASC(Integer month, Integer year, String logisticName,Pageable pageable);
    Page<AWB> filterByInvoiceSortByGdnRefDESC(Integer month, Integer year, String logisticName,Pageable pageable);
    
    
}
