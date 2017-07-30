/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.services;

import com.gdn.scm.bolivia.entity.Invoice;
import com.gdn.scm.bolivia.entity.UploadHistory;
import com.gdn.scm.bolivia.repository.InvoiceRepository;
import com.gdn.scm.bolivia.repository.LogisticProviderRepository;
import com.gdn.scm.bolivia.request.InvoiceRequest;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    InvoiceRepository invoiceRepository;

    @Autowired
    LogisticProviderRepository logisticProviderRepository;

    @Override
    public List<Invoice> findByMonth(Integer month) {
        return invoiceRepository.findByMonth(month);
    }

    @Override
    public List<Invoice> findByYear(Integer year) {
        return invoiceRepository.findByYear(year);
    }

    public Boolean isAda;
//    @Override
//    public List<String> getLogisticName(String logisticName) {
//        return invoiceRepository.getLogisticName(logisticName);
//    }

    public InvoiceServiceImpl() {
        isAda = false;
    }

    @Override
    public void addInvoice(InvoiceRequest request) {
        Invoice ada = this.findByMonthAndYearAndLogisticName(request.getMonth(), request.getYear(), request.getLogisticName());
        if (ada != null) {
            isAda = true;

        } else {
            isAda = false;
            Invoice invoice = new Invoice();
            BeanUtils.copyProperties(request, invoice);
            invoice.setId(UUID.randomUUID().toString());
            invoice.setStatusInvoice("Open");

            Date today = new Date();
            Timestamp timestamp = new Timestamp(today.getTime());
            String date = timestamp.toString();
            System.out.println("Today " + date);
            invoice.setFirstUploadDate(timestamp.toString());
            invoice.setLastModified(timestamp.toString());

            invoice.setLogisticProvider(logisticProviderRepository.findByLogisticName(invoice.getLogisticName()));
            // invoice.setFirstUploadDate(firstUploadDate);
            System.out.println("Id Invoice ----- " + invoice.getId());
            try {
                invoiceRepository.save(invoice);
            } catch (Exception e) {
                System.out.println("gagal invoice");
                e.printStackTrace();;
            }
        }
    }

    @Override
    public List<Invoice> getAll() {
//        return invoiceRepository.findAllOrderByYearAndMonth();
        return invoiceRepository.findAll();
    }

    @Override
    public Invoice findTop1ByOrderByLastModifiedDesc() {
        Invoice last = new Invoice();
        try {
            Thread.sleep(500);
            last = invoiceRepository.findTop1ByOrderByLastModifiedDesc();
            System.out.println("LAST ------ " + last.getId());
        } catch (InterruptedException ex) {
            Logger.getLogger(InvoiceServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return last;
    }

    @Override
    public Invoice findByMonthAndYearAndLogisticName(Integer month, Integer year, String logisticName) {
        return invoiceRepository.findByMonthAndYearAndLogisticName(month, year, logisticName);
    }

    @Override
    public void updateInvoice(InvoiceRequest request) {
        System.out.println("moth : " + request.getMonth());
        System.out.println("year : " + request.getYear());
        System.out.println("logistic : " + request.getLogisticName());
        System.out.println("status : " + request.getStatusInvoice());
        Invoice update = invoiceRepository.findByMonthAndYearAndLogisticName(request.getMonth(), request.getYear(), request.getLogisticName());
        System.out.println("id " + update.getId());
        update.setStatusInvoice(request.getStatusInvoice());

        //get current date
        Date today = new Date();
        Timestamp timestamp = new Timestamp(today.getTime());

        if (request.getStatusInvoice().equals("Submited")) {
            update.setSubmitedDate(timestamp.toString());
            System.out.println("submit");
        } else if (request.getStatusInvoice().equals("Checked")) {
            update.setConfirmedDate(timestamp.toString());
        } else if (request.getStatusInvoice().equals("Approved")) {
            update.setApprovedDate(timestamp.toString());
        } else {
            System.out.println("fail submit");
        }
        update.setLastModified(timestamp.toString());
        invoiceRepository.save(update);
    }

    @Override
    public void updateInvoice(Invoice invoice) {
        invoiceRepository.save(invoice);

    }

    @Override
    public List<Invoice> findByLogisticName(String logisticName) {
        return invoiceRepository.findByLogisticName(logisticName);
    }

    @Override
    public List<Invoice> findByStatusInvoice(String statusInvoice) {
        if (statusInvoice.equals("All")) {
            return invoiceRepository.findAllOrderByYearAndMonth();
        } else {
            return invoiceRepository.findByStatusInvoice(statusInvoice);
        }
    }

    @Override
    public List<Invoice> findByStatusInvoiceAndLogisticName(String statusInvoice, String logisticName) {
        return invoiceRepository.findByStatusInvoiceAndLogisticName(statusInvoice, logisticName);
    }

    @Override
    public Page<Invoice> findAllPageable(Pageable pageable) {
        return invoiceRepository.findAllOrderByYearAndMonth(pageable);
    }

    @Override
    public Invoice findById(String Id) {
        return invoiceRepository.findOne(Id);
    }

}
