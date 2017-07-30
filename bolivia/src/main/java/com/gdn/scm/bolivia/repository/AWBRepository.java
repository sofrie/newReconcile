/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.repository;

import com.gdn.scm.bolivia.entity.AWB;
import com.gdn.scm.bolivia.entity.Invoice;
import com.gdn.scm.bolivia.entity.UploadHistory;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sofrie.zumaytis
 */
@Repository
public interface AWBRepository extends JpaRepository<AWB, String> {

    public Page<AWB> findByReconStatus(String status, Pageable pageable);

    public List<AWB> findByReconStatus(String status);

    public Page<AWB> findByMonth(Integer month, Pageable pageable);

    public List<AWB> findByMonth(Integer month);

    public Page<AWB> findByYear(Integer year, Pageable pageable);

    public List<AWB> findByYear(Integer year);

    public Page<AWB> findByLogisticName(String logisticName, Pageable pageable);

    public List<AWB> findByLogisticName(String logisticName);

    public List<AWB> findByAwbNumber(String awbNumber);

    @Query("SELECT distinct a from AWB a where a.merchantCode like ?")
    public Page<AWB> findByMerchantCode(String merchantCode, Pageable pageable);

    @Query("SELECT distinct a from AWB a where a.gdnRef like ?")
    public Page<AWB> findByGdnRef(String gdnRef, Pageable pageable);

    @Query("SELECT distinct reconStatus from AWB")
    public List<String> selectAllYear();

    @Query("select a from AWB a where a.month = ? AND a.year= ? AND a.logisticName like ? AND a.awbNumber like ? AND a.reconStatus like ? AND a.merchantCode like ? AND a.gdnRef like ?")
    public Page<AWB> filterAll(Integer month, Integer year, String logisticName, String AwbNumber, String reconStatus, String merchantCode, String gdnRef, Pageable pageable);

    @Query("select a from AWB a where a.month = ? AND a.year= ? AND a.logisticName like ? AND a.awbNumber like ? AND a.merchantCode like ? AND a.gdnRef like ?")
    public Page<AWB> filterAllExceptStatus(Integer month, Integer year, String logisticName, String AwbNumber, String merchantCode, String gdnRef, Pageable pageable);

    @Query("select a from AWB a where a.month = ? AND a.year= ? AND a.logisticName like ?")
    public Page<AWB> filterByInvoice(Integer month, Integer year, String logisticName, Pageable pageable);

    @Query("select a from AWB a order by a.awbNumber")
    public List<AWB> findAllOrderByawbNumber();

    @Query("select sum (a.totalChargeLogistic) from AWB a")
    public BigDecimal countTotalTagihan();

    @Query("select a from AWB a ORDER BY a.awbNumber ")
    public Page<AWB> sortByAWBNumberAsc(Pageable pageable);

    @Query("select a from AWB a WHERE a.month = ? AND a.year= ?")
    public Page<AWB> getAllAWBByMonthYear(Integer month, Integer year, Pageable pageable);

    public AWB findByAwbNumberAndInvoice(String awbNumber, Invoice invoice);

    @Query("select sum (a.totalChargeLogistic) from AWB a where a.invoice = ?")
    public BigDecimal countTagihan(Invoice invoice);
    
    
    
    @Query("select sum (a.priceLogistic) from AWB a where a.invoice = ?")
    public BigDecimal countTotalPriceLogistic(Invoice invoice);
    
    @Query("select sum (a.insuranceChargeLogistic) from AWB a where a.invoice = ?")
    public BigDecimal countTotalInsuranceLogistic(Invoice invoice);

    
    //sorting by awb
    @Query("select a from AWB a order by a.awbNumber ASC")
    public Page<AWB> findAllSortByAwbNumberASC(Pageable pageable);

    @Query("select a from AWB a order by a.awbNumber DESC")
    public Page<AWB> findAllSortByAwbNumberDESC(Pageable pageable);

    @Query("select a from AWB a where a.month = ? order by a.awbNumber ASC")
    public Page<AWB> findMonthSortByAwbNumberASC(Integer month, Pageable pageable);

    @Query("select a from AWB a where a.month = ? order by a.awbNumber DESC")
    public Page<AWB> findMonthSortByAwbNumberDESC(Integer month, Pageable pageable);

    @Query("select a from AWB a where a.reconStatus like ? order by a.awbNumber ASC")
    public Page<AWB> findReconStatusSortByAwbNumberASC(String status, Pageable pageable);

    @Query("select a from AWB a where a.reconStatus like ? order by a.awbNumber DESC")
    public Page<AWB> findReconStatusSortByAwbNumberDESC(String status, Pageable pageable);

    @Query("select a from AWB a where a.year= ? order by a.awbNumber ASC")
    public Page<AWB> findYearSortByAwbNumberASC(Integer year, Pageable pageable);

    @Query("select a from AWB a where a.year= ? order by a.awbNumber DESC")
    public Page<AWB> findYearSortByAwbNumberDESC(Integer year, Pageable pageable);

    @Query("select a from AWB a where a.logisticName like ? order by a.awbNumber ASC")
    public Page<AWB> findLogisticSortByAwbNumberASC(String logistic, Pageable pageable);

    @Query("select a from AWB a where a.logisticName like ? order by a.awbNumber DESC")
    public Page<AWB> findLogisticSortByAwbNumberDESC(String logistic, Pageable pageable);

    @Query("select a from AWB a where a.merchantCode like ? order by a.awbNumber ASC")
    public Page<AWB> findMerchantCodeSortByAwbNumberASC(String merchantCode, Pageable pageable);

    @Query("select a from AWB a where a.merchantCode like ? order by a.awbNumber DESC")
    public Page<AWB> findMerchantCodeSortByAwbNumberDESC(String merchantCode, Pageable pageable);

    @Query("select a from AWB a where a.awbNumber like ? order by a.awbNumber ASC")
    public List<AWB> findAwbNumberSortByAwbNumberASC(String awbNumber);

    @Query("select a from AWB a where a.awbNumber like ? order by a.awbNumber DESC")
    public List<AWB> findAwbNumberSortByAwbNumberDESC(String awbNumber);

    @Query("select a from AWB a where a.gdnRef like ? order by a.awbNumber ASC")
    public Page<AWB> findGdnRefSortByAwbNumberASC(String gdnRef, Pageable pageable);

    @Query("select a from AWB a where a.gdnRef like ? order by a.awbNumber DESC")
    public Page<AWB> findGdnRefSortByAwbNumberDESC(String gdnRef, Pageable pageable);

    @Query("select a from AWB a where a.month = ? AND a.year= ? AND a.logisticName like ? AND a.awbNumber like ? AND a.reconStatus like ? AND a.merchantCode like ? AND a.gdnRef like ? order by a.awbNumber ASC")
    public Page<AWB> filterAllSortByAwbNumberASC(Integer month, Integer year, String logisticName, String AwbNumber, String reconStatus, String merchantCode, String gdnRef, Pageable pageable);

    @Query("select a from AWB a where a.month = ? AND a.year= ? AND a.logisticName like ? AND a.awbNumber like ? AND a.reconStatus like ? AND a.merchantCode like ? AND a.gdnRef like ? order by a.awbNumber DESC")
    public Page<AWB> filterAllSortByAwbNumberDESC(Integer month, Integer year, String logisticName, String AwbNumber, String reconStatus, String merchantCode, String gdnRef, Pageable pageable);

    @Query("select a from AWB a where a.month = ? AND a.year= ? AND a.logisticName like ? AND a.awbNumber like ? AND a.merchantCode like ? AND a.gdnRef like ? order by a.awbNumber ASC")
    public Page<AWB> filterAllExceptStatusSortByAwbNumberASC(Integer month, Integer year, String logisticName, String AwbNumber, String merchantCode, String gdnRef, Pageable pageable);

    @Query("select a from AWB a where a.month = ? AND a.year= ? AND a.logisticName like ? AND a.awbNumber like ? AND a.merchantCode like ? AND a.gdnRef like ? order by a.awbNumber DESC")
    public Page<AWB> filterAllExceptStatusSortByAwbNumberDESC(Integer month, Integer year, String logisticName, String AwbNumber, String merchantCode, String gdnRef, Pageable pageable);

    @Query("select a from AWB a where a.month = ? AND a.year= ? AND a.logisticName like ? order by a.awbNumber ASC")
    public Page<AWB> filterByInvoiceSortByAwbNumberASC(Integer month, Integer year, String logisticName, Pageable pageable);

    @Query("select a from AWB a where a.month = ? AND a.year= ? AND a.logisticName like ? order by a.awbNumber DESC")
    public Page<AWB> filterByInvoiceSortByAwbNumberDESC(Integer month, Integer year, String logisticName, Pageable pageable);
    
    
    //sorting by reconStatus
    
    @Query("select a from AWB a order by a.reconStatus ASC")
    public Page<AWB> findAllSortByReconStatusASC(Pageable pageable);
    
    @Query("select a from AWB a order by a.reconStatus DESC")
    public Page<AWB> findAllSortByReconStatusDESC(Pageable pageable);
    
    
    @Query("select a from AWB a where a.month = ? order by a.reconStatus ASC")
    public Page<AWB> findMonthSortByReconStatusASC(Integer month, Pageable pageable);
    
    @Query("select a from AWB a where a.month = ? order by a.reconStatus DESC")
    public Page<AWB> findMonthSortByReconStatusDESC(Integer month, Pageable pageable);
    
    
    @Query("select a from AWB a where a.reconStatus like ? order by a.reconStatus ASC")
    public Page<AWB> findReconStatusSortByReconStatusASC(String status, Pageable pageable);
    
    @Query("select a from AWB a where a.reconStatus like ? order by a.reconStatus DESC")
    public Page<AWB> findReconStatusSortByReconStatusDESC(String status, Pageable pageable);
    
    @Query("select a from AWB a where a.year= ? order by a.reconStatus ASC")
    public Page<AWB> findYearSortByReconStatusASC(Integer year, Pageable pageable);
    
    @Query("select a from AWB a where a.year= ? order by a.reconStatus DESC")
    public Page<AWB> findYearSortByReconStatusDESC(Integer year, Pageable pageable);
    
    @Query("select a from AWB a where a.logisticName like ? order by a.reconStatus ASC")
    public Page<AWB> findLogisticSortByReconStatusASC(String logistic, Pageable pageable);
    
    @Query("select a from AWB a where a.logisticName like ? order by a.reconStatus DESC")
    public Page<AWB> findLogisticSortByReconStatusDESC(String logistic, Pageable pageable);
    
    @Query("select a from AWB a where a.merchantCode like ? order by a.reconStatus ASC")
    public Page<AWB> findMerchantCodeSortByReconStatusASC(String merchantCode, Pageable pageable);
    
    @Query("select a from AWB a where a.merchantCode like ? order by a.reconStatus DESC")
    public Page<AWB> findMerchantCodeSortByReconStatusDESC(String merchantCode, Pageable pageable);
    
    @Query("select a from AWB a where a.awbNumber like ? order by a.reconStatus ASC")
    public List<AWB> findAwbNumberSortByReconStatusASC(String awbNumber);
    
    @Query("select a from AWB a where a.awbNumber like ? order by a.reconStatus DESC")
    public List<AWB> findAwbNumberSortByReconStatusDESC(String awbNumber);
    
    @Query("select a from AWB a where a.gdnRef like ? order by a.reconStatus ASC")
    public Page<AWB> findGdnRefSortByReconStatusASC(String gdnRef, Pageable pageable);
    
    @Query("select a from AWB a where a.gdnRef like ? order by a.reconStatus DESC")
    public Page<AWB> findGdnRefSortByReconStatusDESC(String gdnRef, Pageable pageable);
    
    @Query("select a from AWB a where a.month = ? AND a.year= ? AND a.logisticName like ? AND a.awbNumber like ? AND a.reconStatus like ? AND a.merchantCode like ? AND a.gdnRef like ? order by a.reconStatus ASC")
    public Page<AWB> filterAllSortByReconStatusASC(Integer month, Integer year, String logisticName, String AwbNumber, String reconStatus, String merchantCode, String gdnRef,Pageable pageable);

    @Query("select a from AWB a where a.month = ? AND a.year= ? AND a.logisticName like ? AND a.awbNumber like ? AND a.reconStatus like ? AND a.merchantCode like ? AND a.gdnRef like ? order by a.reconStatus DESC")
    public Page<AWB> filterAllSortByReconStatusDESC(Integer month, Integer year, String logisticName, String AwbNumber, String reconStatus, String merchantCode, String gdnRef,Pageable pageable);
    
    @Query("select a from AWB a where a.month = ? AND a.year= ? AND a.logisticName like ? AND a.awbNumber like ? AND a.merchantCode like ? AND a.gdnRef like ? order by a.reconStatus ASC")
    public Page<AWB> filterAllExceptStatusSortByReconStatusASC(Integer month, Integer year, String logisticName, String AwbNumber, String merchantCode, String gdnRef,Pageable pageable);
    
    @Query("select a from AWB a where a.month = ? AND a.year= ? AND a.logisticName like ? AND a.awbNumber like ? AND a.merchantCode like ? AND a.gdnRef like ? order by a.reconStatus DESC")
    public Page<AWB> filterAllExceptStatusSortByReconStatusDESC(Integer month, Integer year, String logisticName, String AwbNumber, String merchantCode, String gdnRef,Pageable pageable);
    
    @Query("select a from AWB a where a.month = ? AND a.year= ? AND a.logisticName like ? order by a.reconStatus ASC")
    public Page<AWB> filterByInvoiceSortByReconStatusASC(Integer month, Integer year, String logisticName,Pageable pageable);
    
    @Query("select a from AWB a where a.month = ? AND a.year= ? AND a.logisticName like ? order by a.reconStatus DESC")
    public Page<AWB> filterByInvoiceSortByReconStatusDESC(Integer month, Integer year, String logisticName,Pageable pageable);
    
    
    //sorting by GDN Ref
    @Query("select a from AWB a order by a.gdnRef ASC")
    public Page<AWB> findAllSortByGdnRefASC(Pageable pageable);
    
    @Query("select a from AWB a order by a.gdnRef DESC")
    public Page<AWB> findAllSortByGdnRefDESC(Pageable pageable);

    @Query("select a from AWB a where a.month = ? order by a.gdnRef ASC")
    public Page<AWB> findMonthSortByGdnRefASC(Integer month, Pageable pageable);

    @Query("select a from AWB a where a.month = ? order by a.gdnRef DESC")
    public Page<AWB> findMonthSortByGdnRefDESC(Integer month, Pageable pageable);

    @Query("select a from AWB a where a.reconStatus like ? order by a.gdnRef ASC")
    public Page<AWB> findReconStatusSortByGdnRefASC(String status, Pageable pageable);

    @Query("select a from AWB a where a.reconStatus like ? order by a.gdnRef DESC")
    public Page<AWB> findReconStatusSortByGdnRefDESC(String status, Pageable pageable);

    @Query("select a from AWB a where a.year= ? order by a.gdnRef ASC")
    public Page<AWB> findYearSortByGdnRefASC(Integer year, Pageable pageable);

    @Query("select a from AWB a where a.year= ? order by a.gdnRef DESC")
    public Page<AWB> findYearSortByGdnRefDESC(Integer year, Pageable pageable);

    @Query("select a from AWB a where a.logisticName like ? order by a.gdnRef ASC")
    public Page<AWB> findLogisticSortByGdnRefASC(String logistic, Pageable pageable);

    @Query("select a from AWB a where a.logisticName like ? order by a.gdnRef DESC")
    public Page<AWB> findLogisticSortByGdnRefDESC(String logistic, Pageable pageable);

    @Query("select a from AWB a where a.merchantCode like ? order by a.gdnRef ASC")
    public Page<AWB> findMerchantCodeSortByGdnRefASC(String merchantCode, Pageable pageable);

    @Query("select a from AWB a where a.merchantCode like ? order by a.gdnRef DESC")
    public Page<AWB> findMerchantCodeSortByGdnRefDESC(String merchantCode, Pageable pageable);

    @Query("select a from AWB a where a.gdnRef like ? order by a.gdnRef ASC")
    public List<AWB> findGdnRefSortByGdnRefASC(String gdnRef);

    @Query("select a from AWB a where a.gdnRef like ? order by a.gdnRef DESC")
    public List<AWB> findGdnRefSortByGdnRefDESC(String gdnRef);

    @Query("select a from AWB a where a.gdnRef like ? order by a.gdnRef ASC")
    public Page<AWB> findGdnRefSortByGdnRefASC(String gdnRef, Pageable pageable);

    @Query("select a from AWB a where a.gdnRef like ? order by a.gdnRef DESC")
    public Page<AWB> findGdnRefSortByGdnRefDESC(String gdnRef, Pageable pageable);

    @Query("select a from AWB a where a.month = ? AND a.year= ? AND a.logisticName like ? AND a.gdnRef like ? AND a.reconStatus like ? AND a.merchantCode like ? AND a.gdnRef like ? order by a.gdnRef ASC")
    public Page<AWB> filterAllSortByGdnRefASC(Integer month, Integer year, String logisticName, String GdnRef, String reconStatus, String merchantCode, String gdnRef, Pageable pageable);

    @Query("select a from AWB a where a.month = ? AND a.year= ? AND a.logisticName like ? AND a.gdnRef like ? AND a.reconStatus like ? AND a.merchantCode like ? AND a.gdnRef like ? order by a.gdnRef DESC")
    public Page<AWB> filterAllSortByGdnRefDESC(Integer month, Integer year, String logisticName, String GdnRef, String reconStatus, String merchantCode, String gdnRef, Pageable pageable);

    @Query("select a from AWB a where a.month = ? AND a.year= ? AND a.logisticName like ? AND a.gdnRef like ? AND a.merchantCode like ? AND a.gdnRef like ? order by a.gdnRef ASC")
    public Page<AWB> filterAllExceptStatusSortByGdnRefASC(Integer month, Integer year, String logisticName, String GdnRef, String merchantCode, String gdnRef, Pageable pageable);

    @Query("select a from AWB a where a.month = ? AND a.year= ? AND a.logisticName like ? AND a.gdnRef like ? AND a.merchantCode like ? AND a.gdnRef like ? order by a.gdnRef DESC")
    public Page<AWB> filterAllExceptStatusSortByGdnRefDESC(Integer month, Integer year, String logisticName, String GdnRef, String merchantCode, String gdnRef, Pageable pageable);

    @Query("select a from AWB a where a.month = ? AND a.year= ? AND a.logisticName like ? order by a.gdnRef ASC")
    public Page<AWB> filterByInvoiceSortByGdnRefASC(Integer month, Integer year, String logisticName, Pageable pageable);

    @Query("select a from AWB a where a.month = ? AND a.year= ? AND a.logisticName like ? order by a.gdnRef DESC")
    public Page<AWB> filterByInvoiceSortByGdnRefDESC(Integer month, Integer year, String logisticName, Pageable pageable);
    
}
