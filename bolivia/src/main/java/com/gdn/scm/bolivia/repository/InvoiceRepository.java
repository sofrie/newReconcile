/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.repository;

import com.gdn.scm.bolivia.entity.AWB;
import com.gdn.scm.bolivia.entity.Invoice;
import com.gdn.scm.bolivia.entity.UploadHistory;
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
public interface InvoiceRepository extends JpaRepository<Invoice, String> {

    public Invoice findByMonthAndYearAndLogisticName(Integer month, Integer year, String logisticName);

    public List<Invoice> findByMonth(Integer month);
    
    public List<Invoice> findByYear(Integer year);
    
    public Invoice findTop1ByOrderByLastModifiedDesc();
    
    public List<Invoice> findByLogisticName(String logisticName);
    
    public List<Invoice> findByStatusInvoice(String statusInvoice);
    
    public List<Invoice> findByStatusInvoiceAndLogisticName(String statusInvoice,String logisticName);
    
    
    @Query("select a from Invoice a order by a.year asc, a.month asc")
    public List<Invoice> findAllOrderByYearAndMonth();
    
    @Query("select a from Invoice a order by a.year asc, a.month asc")
    public Page<Invoice> findAllOrderByYearAndMonth(Pageable pageable);
//    public Page<Invoice> findByStatusInvoice(String statusInvoice, Pageable pageable);
//    
//    public Page<Invoice> findByLogisticName(String logisticName, Pageable pageable);
   
}
