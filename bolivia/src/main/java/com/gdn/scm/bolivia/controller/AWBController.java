/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.controller;

import com.gdn.scm.bolivia.entity.AWB;
import com.gdn.scm.bolivia.entity.MailSender;
import com.gdn.scm.bolivia.entity.PageClass;
import com.gdn.scm.bolivia.services.AWBPagingService;
import com.gdn.scm.bolivia.services.AWBService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sofrie.zumaytis
 */
@RestController
public class AWBController {

    @Autowired
    AWBService awbService;

    @Autowired
    AWBPagingService awbPagingService;


    @Autowired
    MailSender mail;

    public Page<AWB> awbs;
    PageClass pageClass;

    @CrossOrigin
    @RequestMapping(value = "/api/awb/{awb}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AWB> listAWBOne(@PathVariable("awb") String awb) {
        return awbService.getByAwbNumber(awb);
    }

    @CrossOrigin
    @RequestMapping(value = "/api/awb", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AWB> listAWB() {
        return awbService.getAll();
    }

    //filter By month
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filtermonth/{month}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Page<AWB> filterAWBByMonth(@PathVariable("month") Integer month, Pageable pageable) {
        awbs = awbService.findByMonth(month, pageable);
        pageClass = new PageClass();
        pageClass.setTotal_page(awbs.getTotalPages());
        pageClass.setItem_page(awbs.getSize());
        pageClass.setPage(awbs.getNumber());
        return awbs;
    }

    //filter By status
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filterstatus/{status}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Page<AWB> filterAWBByStatus(@PathVariable("status") String status, Pageable pageable) {
        awbs = awbService.findByStatus(status, pageable);
        pageClass = new PageClass();
        pageClass.setTotal_page(awbs.getTotalPages());
        pageClass.setItem_page(awbs.getSize());
        pageClass.setPage(awbs.getNumber());
        return awbs;
    }

    //filter By year
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filteryear/{year}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Page<AWB> filterAWBByYear(@PathVariable("year") Integer year, Pageable pageable) {
        awbs = awbService.findByYear(year, pageable);
        pageClass = new PageClass();
        pageClass.setTotal_page(awbs.getTotalPages());
        pageClass.setItem_page(awbs.getSize());
        pageClass.setPage(awbs.getNumber());
        return awbs;
    }

    //filter By logisticName
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filterlogisticName/{logisticName}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Page<AWB> filterAWBByLogisticName(@PathVariable("logisticName") String logisticName, Pageable pageable) {
        awbs = awbService.findByLogisticName(logisticName, pageable);
        pageClass = new PageClass();
        pageClass.setTotal_page(awbs.getTotalPages());
        pageClass.setItem_page(awbs.getSize());
        pageClass.setPage(awbs.getNumber());
        return awbs;
    }

    //filter By awbNumber
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filterAwbNumber/{AwbNumber}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AWB> filterAWBByAwbNumber(@PathVariable("AwbNumber") String AwbNumber) {
        return awbService.getByAwbNumber(AwbNumber);
    }

    //filter By merchantCode
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filterMerchantCode/{merchantCode}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Page<AWB> filterMerchantCode(@PathVariable("merchantCode") String merchantCode, Pageable pageable) {
        return awbService.getByMerchantCode(merchantCode, pageable);
    }

    //filter By gdnRef
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filterGdnRef/{gdnRef}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Page<AWB> filterGdnRef(@PathVariable("gdnRef") String gdnRef, Pageable pageable) {
        return awbService.getByGdnRef(gdnRef,pageable);
    }

    //filter all
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filter/{month}/{year}/{logisticName}/{awbNumber}/{reconStatus}/{merchantCode}/{gdnRef}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Page<AWB> filterAll(@PathVariable("month") Integer month, @PathVariable("year") Integer year, @PathVariable("logisticName") String logisticName, @PathVariable("awbNumber") String awbNumber, @PathVariable("reconStatus") String reconStatus, @PathVariable("merchantCode") String merchantCode, @PathVariable("gdnRef") String gdnRef, Pageable pageable) {
        return awbService.filterAll(month, year, logisticName, awbNumber, reconStatus, merchantCode, gdnRef,pageable);
    }

    //get all year
    @CrossOrigin
    @RequestMapping(value = "/api/awb/status", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> getAllYear() {
        return awbService.selectAllYear();
    }

    @CrossOrigin
    @RequestMapping(value = "/api/awb/awbs", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    Page<AWB> listAWBPage(Pageable pageable) {
        awbs = awbService.findAll(pageable);
        pageClass = new PageClass();
        pageClass.setTotal_page(awbs.getTotalPages());
        pageClass.setItem_page(awbs.getSize());
        pageClass.setPage(awbs.getNumber());
        return awbs;
    }

    @CrossOrigin
    @RequestMapping(value = "/api/awb/awbnumbers", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    PageClass listAWBPageByAWBNumber() {
        System.out.println("Total page " + pageClass.getTotal_page());
        System.out.println("page " + pageClass.getPage());
        System.out.println("Item page " + pageClass.getItem_page());
        return pageClass;
    }

    @CrossOrigin
    @RequestMapping(value = "/email", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    void sendMail() {

        try {
            mail.sendMail("sofrie.zumaytis@gdn-commerce.com", "sofriesilero.zumaytis@gmail.com", "tes", "coba kirim email");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @CrossOrigin
    @RequestMapping(value = "/api/awb/asc", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Page<AWB> sortByAWBNumberAsc(Pageable pageable) {
        awbs=awbService.sortByAWBNumberAsc(pageable);
        return awbs;
    }
    
    
    //sorting by awb
    @CrossOrigin
    @RequestMapping(value = "/api/awb/sort/awb/{order}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    Page<AWB> findAllSortAwbNumber(@PathVariable("order") String order,Pageable pageable) {
        if(order.toLowerCase().equals("asc")){
            awbs = awbService.findAllSortByAwbNumberASC(pageable);
        }
        else if(order.toLowerCase().equals("desc")){
            awbs = awbService.findAllSortByAwbNumberDESC(pageable);
        }
        pageClass = new PageClass();
        pageClass.setTotal_page(awbs.getTotalPages());
        pageClass.setItem_page(awbs.getSize());
        pageClass.setPage(awbs.getNumber());
        return awbs;
    }
    
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filtermonth/{month}/sort/awb/{order}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    Page<AWB> findMonthSortAwbNumber(@PathVariable("order") String order, @PathVariable("month") Integer month,Pageable pageable) {
        if(order.toLowerCase().equals("asc")){
            awbs = awbService.findMonthSortByAwbNumberASC(month,pageable);
        }
        else if(order.toLowerCase().equals("desc")){
            awbs = awbService.findMonthSortByAwbNumberDESC(month,pageable);
        }
        pageClass = new PageClass();
        pageClass.setTotal_page(awbs.getTotalPages());
        pageClass.setItem_page(awbs.getSize());
        pageClass.setPage(awbs.getNumber());
        return awbs;
    }
    
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filteryear/{year}/sort/{order}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    Page<AWB> findYearSortAwbNumber(@PathVariable("order") String order, @PathVariable("year") Integer year,Pageable pageable) {
        if(order.toLowerCase().equals("asc")){
            awbs = awbService.findYearSortByAwbNumberASC(year,pageable);
        }
        else if(order.toLowerCase().equals("desc")){
            awbs = awbService.findYearSortByAwbNumberDESC(year,pageable);
        }
        pageClass = new PageClass();
        pageClass.setTotal_page(awbs.getTotalPages());
        pageClass.setItem_page(awbs.getSize());
        pageClass.setPage(awbs.getNumber());
        return awbs;
    }
    
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filterlogistic/{logistic}/sort/{order}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    Page<AWB> findLogisticSortAwbNumber(@PathVariable("order") String order, @PathVariable("logistic") String logistic,Pageable pageable) {
        if(order.toLowerCase().equals("asc")){
            awbs = awbService.findLogisticSortByAwbNumberASC(logistic,pageable);
        }
        else if(order.toLowerCase().equals("desc")){
            awbs = awbService.findLogisticSortByAwbNumberDESC(logistic,pageable);
        }
        pageClass = new PageClass();
        pageClass.setTotal_page(awbs.getTotalPages());
        pageClass.setItem_page(awbs.getSize());
        pageClass.setPage(awbs.getNumber());
        return awbs;
    }
    
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filterstatus/{status}/sort/{order}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    Page<AWB> findStatusSortAwbNumber(@PathVariable("order") String order, @PathVariable("status") String status,Pageable pageable) {
        if(order.toLowerCase().equals("asc")){
            awbs = awbService.findStatusSortByAwbNumberASC(status,pageable);
        }
        else if(order.toLowerCase().equals("desc")){
            awbs = awbService.findStatusSortByAwbNumberDESC(status,pageable);
        }
        pageClass = new PageClass();
        pageClass.setTotal_page(awbs.getTotalPages());
        pageClass.setItem_page(awbs.getSize());
        pageClass.setPage(awbs.getNumber());
        return awbs;
    }
    
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filterawb/{awb}/sort/{order}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    List<AWB> findAwbNumberSortAwbNumber(@PathVariable("order") String order, @PathVariable("awb") String awb) {
        List<AWB> result=new ArrayList<AWB>();
        if(order.toLowerCase().equals("asc")){
            result= awbService.findAwbNumberSortByAwbNumberASC(awb);
        }
        else if(order.toLowerCase().equals("desc")){
            result= awbService.findAwbNumberSortByAwbNumberDESC(awb);
        }
        return result;
    }
    
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filtermerchant/{merchantCode}/sort/{order}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    Page<AWB> findMerchantCodeSortAwbNumber(@PathVariable("order") String order, @PathVariable("merchantCode") String merchantCode,Pageable pageable) {
        if(order.toLowerCase().equals("asc")){
            awbs = awbService.findMerchantCodeSortByAwbNumberASC(merchantCode,pageable);
        }
        else if(order.toLowerCase().equals("desc")){
            awbs = awbService.findMerchantCodeSortByAwbNumberDESC(merchantCode,pageable);
        }
        pageClass = new PageClass();
        pageClass.setTotal_page(awbs.getTotalPages());
        pageClass.setItem_page(awbs.getSize());
        pageClass.setPage(awbs.getNumber());
        return awbs;
    }
    
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filterGdnRef/{gdnRef}/sort/{order}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    Page<AWB> findGdnRefSortAwbNumber(@PathVariable("order") String order, @PathVariable("gdnRef") String gdnRef,Pageable pageable) {
        if(order.toLowerCase().equals("asc")){
            awbs = awbService.findGdnRefSortByAwbNumberASC(gdnRef,pageable);
        }
        else if(order.toLowerCase().equals("desc")){
            awbs = awbService.findGdnRefSortByAwbNumberDESC(gdnRef,pageable);
        }
        pageClass = new PageClass();
        pageClass.setTotal_page(awbs.getTotalPages());
        pageClass.setItem_page(awbs.getSize());
        pageClass.setPage(awbs.getNumber());
        return awbs;
    }
    
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filter/{month}/{year}/{logisticName}/{awbNumber}/{reconStatus}/{merchantCode}/{gdnRef}/sort/{order}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Page<AWB> filterAllSortByAwbNumber(@PathVariable("month") Integer  month, @PathVariable("year") Integer year, @PathVariable("logisticName") String logisticName, @PathVariable("awbNumber") String awbNumber, @PathVariable("reconStatus") String reconStatus, @PathVariable("merchantCode") String merchantCode, @PathVariable("gdnRef") String gdnRef, @PathVariable("order") String order, Pageable pageable) {
        if(order.toLowerCase().equals("asc")){
            awbs = awbService.filterAllSortByAwbNumberASC(month, year, logisticName, awbNumber, reconStatus, merchantCode, gdnRef,pageable);
        }
        else if(order.toLowerCase().equals("desc")){
            awbs = awbService.filterAllSortByAwbNumberDESC(month, year, logisticName, awbNumber, reconStatus, merchantCode, gdnRef,pageable);
        }
        pageClass = new PageClass();
        pageClass.setTotal_page(awbs.getTotalPages());
        pageClass.setItem_page(awbs.getSize());
        pageClass.setPage(awbs.getNumber());
        return awbs;
    }
    
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filterinvoice/{month}/{year}/{logisticName}/sort/awb/{order}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Page<AWB> filterByInvoiceSortByAwbNumber(@PathVariable("month") Integer  month, @PathVariable("year") Integer year, @PathVariable("logisticName") String logisticName,@PathVariable("order") String order,Pageable pageable) {
        
        if(order.toLowerCase().equals("asc")){
            awbs = awbService.filterByInvoiceSortByAwbNumberASC(month, year, logisticName,pageable);
        }
        else if(order.toLowerCase().equals("desc")){
            awbs = awbService.filterByInvoiceSortByAwbNumberDESC(month, year, logisticName,pageable);
        }
        pageClass = new PageClass();
        pageClass.setTotal_page(awbs.getTotalPages());
        pageClass.setItem_page(awbs.getSize());
        pageClass.setPage(awbs.getNumber());
        return awbs;
    }
    
    
    //sorting by status
    @CrossOrigin
    @RequestMapping(value = "/api/awb/sort/status/{order}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    Page<AWB> findAllSortStatus(@PathVariable("order") String order,Pageable pageable) {
        if(order.toLowerCase().equals("asc")){
            awbs = awbService.findAllSortByStatusASC(pageable);
        }
        else if(order.toLowerCase().equals("desc")){
            awbs = awbService.findAllSortByStatusDESC(pageable);
        }
        pageClass = new PageClass();
        pageClass.setTotal_page(awbs.getTotalPages());
        pageClass.setItem_page(awbs.getSize());
        pageClass.setPage(awbs.getNumber());
        return awbs;
    }
    
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filtermonth/{month}/sort/status/{order}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    Page<AWB> findMonthSortStatus(@PathVariable("order") String order, @PathVariable("month") Integer  month,Pageable pageable) {
        if(order.toLowerCase().equals("asc")){
            awbs = awbService.findMonthSortByStatusASC(month,pageable);
        }
        else if(order.toLowerCase().equals("desc")){
            awbs = awbService.findMonthSortByStatusDESC(month,pageable);
        }
        pageClass = new PageClass();
        pageClass.setTotal_page(awbs.getTotalPages());
        pageClass.setItem_page(awbs.getSize());
        pageClass.setPage(awbs.getNumber());
        return awbs;
    }
    
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filteryear/{year}/sort/status/{order}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    Page<AWB> findYearSortStatus(@PathVariable("order") String order, @PathVariable("year") Integer year,Pageable pageable) {
        if(order.toLowerCase().equals("asc")){
            awbs = awbService.findYearSortByStatusASC(year,pageable);
        }
        else if(order.toLowerCase().equals("desc")){
            awbs = awbService.findYearSortByStatusDESC(year,pageable);
        }
        pageClass = new PageClass();
        pageClass.setTotal_page(awbs.getTotalPages());
        pageClass.setItem_page(awbs.getSize());
        pageClass.setPage(awbs.getNumber());
        return awbs;
    }
    
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filterlogistic/{logistic}/sort/status/{order}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    Page<AWB> findLogisticSortStatus(@PathVariable("order") String order, @PathVariable("logistic") String logistic,Pageable pageable) {
        if(order.toLowerCase().equals("asc")){
            awbs = awbService.findLogisticSortByStatusASC(logistic,pageable);
        }
        else if(order.toLowerCase().equals("desc")){
            awbs = awbService.findLogisticSortByStatusDESC(logistic,pageable);
        }
        pageClass = new PageClass();
        pageClass.setTotal_page(awbs.getTotalPages());
        pageClass.setItem_page(awbs.getSize());
        pageClass.setPage(awbs.getNumber());
        return awbs;
    }
    
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filterstatus/{status}/sort/status/{order}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    Page<AWB> findStatusSortStatus(@PathVariable("order") String order, @PathVariable("status") String status,Pageable pageable) {
        if(order.toLowerCase().equals("asc")){
            awbs = awbService.findStatusSortByStatusASC(status,pageable);
        }
        else if(order.toLowerCase().equals("desc")){
            awbs = awbService.findStatusSortByStatusDESC(status,pageable);
        }
        pageClass = new PageClass();
        pageClass.setTotal_page(awbs.getTotalPages());
        pageClass.setItem_page(awbs.getSize());
        pageClass.setPage(awbs.getNumber());
        return awbs;
    }
    
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filterawb/{awb}/sort/status/{order}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    List<AWB> findAwbNumberSortStatus(@PathVariable("order") String order, @PathVariable("awb") String awb) {
        List<AWB> result=new ArrayList<AWB>();
        if(order.toLowerCase().equals("asc")){
            result= awbService.findAwbNumberSortByStatusASC(awb);
        }
        else if(order.toLowerCase().equals("desc")){
            result= awbService.findAwbNumberSortByStatusDESC(awb);
        }
        return result;
    }
    
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filtermerchant/{merchantCode}/sort/status/{order}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    Page<AWB> findMerchantCodeSortStatus(@PathVariable("order") String order, @PathVariable("merchantCode") String merchantCode,Pageable pageable) {
        if(order.toLowerCase().equals("asc")){
            awbs = awbService.findMerchantCodeSortByStatusASC(merchantCode,pageable);
        }
        else if(order.toLowerCase().equals("desc")){
            awbs = awbService.findMerchantCodeSortByStatusDESC(merchantCode,pageable);
        }
        pageClass = new PageClass();
        pageClass.setTotal_page(awbs.getTotalPages());
        pageClass.setItem_page(awbs.getSize());
        pageClass.setPage(awbs.getNumber());
        return awbs;
    }
    
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filterGdnRef/{gdnRef}/sort/status/{order}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    Page<AWB> findGdnRefSortStatus(@PathVariable("order") String order, @PathVariable("gdnRef") String gdnRef,Pageable pageable) {
        if(order.toLowerCase().equals("asc")){
            awbs = awbService.findGdnRefSortByStatusASC(gdnRef,pageable);
        }
        else if(order.toLowerCase().equals("desc")){
            awbs = awbService.findGdnRefSortByStatusDESC(gdnRef,pageable);
        }
        pageClass = new PageClass();
        pageClass.setTotal_page(awbs.getTotalPages());
        pageClass.setItem_page(awbs.getSize());
        pageClass.setPage(awbs.getNumber());
        return awbs;
    }
    
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filter/{month}/{year}/{logisticName}/{awbNumber}/{reconStatus}/{merchantCode}/{gdnRef}/sort/status/{order}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Page<AWB> filterAllSortByStatus(@PathVariable("month") Integer  month, @PathVariable("year") Integer year, @PathVariable("logisticName") String logisticName, @PathVariable("awbNumber") String awbNumber, @PathVariable("reconStatus") String reconStatus, @PathVariable("merchantCode") String merchantCode, @PathVariable("gdnRef") String gdnRef, @PathVariable("order") String order, Pageable pageable) {
        if(order.toLowerCase().equals("asc")){
            awbs = awbService.filterAllSortByStatusASC(month, year, logisticName, awbNumber, reconStatus, merchantCode, gdnRef,pageable);
        }
        else if(order.toLowerCase().equals("desc")){
            awbs = awbService.filterAllSortByStatusDESC(month, year, logisticName, awbNumber, reconStatus, merchantCode, gdnRef,pageable);
        }
        pageClass = new PageClass();
        pageClass.setTotal_page(awbs.getTotalPages());
        pageClass.setItem_page(awbs.getSize());
        pageClass.setPage(awbs.getNumber());
        return awbs;
    }
    
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filterinvoice/{month}/{year}/{logisticName}/sort/status/{order}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Page<AWB> filterByInvoiceSortByStatus(@PathVariable("month") Integer  month, @PathVariable("year") Integer year, @PathVariable("logisticName") String logisticName,@PathVariable("order") String order,Pageable pageable) {
        
        if(order.toLowerCase().equals("asc")){
            awbs = awbService.filterByInvoiceSortByStatusASC(month, year, logisticName,pageable);
        }
        else if(order.toLowerCase().equals("desc")){
            awbs = awbService.filterByInvoiceSortByStatusDESC(month, year, logisticName,pageable);
        }
        pageClass = new PageClass();
        pageClass.setTotal_page(awbs.getTotalPages());
        pageClass.setItem_page(awbs.getSize());
        pageClass.setPage(awbs.getNumber());
        return awbs;
    }
    
    
    //sorting by GDN REF
    @CrossOrigin
    @RequestMapping(value = "/api/awb/sort/gdnref/{order}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    Page<AWB> findAllSortGdnRef(@PathVariable("order") String order,Pageable pageable) {
        if(order.toLowerCase().equals("asc")){
            awbs = awbService.findAllSortByGdnRefASC(pageable);
        }
        else if(order.toLowerCase().equals("desc")){
            awbs = awbService.findAllSortByGdnRefDESC(pageable);
        }
        pageClass = new PageClass();
        pageClass.setTotal_page(awbs.getTotalPages());
        pageClass.setItem_page(awbs.getSize());
        pageClass.setPage(awbs.getNumber());
        return awbs;
    }
    
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filtermonth/{month}/sort/gdnref/{order}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    Page<AWB> findMonthSortGdnRef(@PathVariable("order") String order, @PathVariable("month") Integer  month,Pageable pageable) {
        if(order.toLowerCase().equals("asc")){
            awbs = awbService.findMonthSortByGdnRefASC(month,pageable);
        }
        else if(order.toLowerCase().equals("desc")){
            awbs = awbService.findMonthSortByGdnRefDESC(month,pageable);
        }
        pageClass = new PageClass();
        pageClass.setTotal_page(awbs.getTotalPages());
        pageClass.setItem_page(awbs.getSize());
        pageClass.setPage(awbs.getNumber());
        return awbs;
    }
    
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filteryear/{year}/sort/gdnref/{order}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    Page<AWB> findYearSortGdnRef(@PathVariable("order") String order, @PathVariable("year") Integer year,Pageable pageable) {
        if(order.toLowerCase().equals("asc")){
            awbs = awbService.findYearSortByGdnRefASC(year,pageable);
        }
        else if(order.toLowerCase().equals("desc")){
            awbs = awbService.findYearSortByGdnRefDESC(year,pageable);
        }
        pageClass = new PageClass();
        pageClass.setTotal_page(awbs.getTotalPages());
        pageClass.setItem_page(awbs.getSize());
        pageClass.setPage(awbs.getNumber());
        return awbs;
    }
    
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filterlogistic/{logistic}/sort/gdnref/{order}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    Page<AWB> findLogisticSortGdnRef(@PathVariable("order") String order, @PathVariable("logistic") String logistic,Pageable pageable) {
        if(order.toLowerCase().equals("asc")){
            awbs = awbService.findLogisticSortByGdnRefASC(logistic,pageable);
        }
        else if(order.toLowerCase().equals("desc")){
            awbs = awbService.findLogisticSortByGdnRefDESC(logistic,pageable);
        }
        pageClass = new PageClass();
        pageClass.setTotal_page(awbs.getTotalPages());
        pageClass.setItem_page(awbs.getSize());
        pageClass.setPage(awbs.getNumber());
        return awbs;
    }
    
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filterstatus/{status}/sort/gdnref/{order}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    Page<AWB> findStatusSortGdnRef(@PathVariable("order") String order, @PathVariable("status") String status,Pageable pageable) {
        if(order.toLowerCase().equals("asc")){
            awbs = awbService.findGdnRefSortByGdnRefASC(status,pageable);
        }
        else if(order.toLowerCase().equals("desc")){
            awbs = awbService.findGdnRefSortByGdnRefDESC(status,pageable);
        }
        pageClass = new PageClass();
        pageClass.setTotal_page(awbs.getTotalPages());
        pageClass.setItem_page(awbs.getSize());
        pageClass.setPage(awbs.getNumber());
        return awbs;
    }
    
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filterawb/{awb}/sort/gdnref/{order}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    List<AWB> findAwbNumberSortGdnRef(@PathVariable("order") String order, @PathVariable("awb") String awb) {
        List<AWB> result=new ArrayList<AWB>();
        if(order.toLowerCase().equals("asc")){
            result= awbService.findAwbNumberSortByGdnRefASC(awb);
        }
        else if(order.toLowerCase().equals("desc")){
            result= awbService.findAwbNumberSortByGdnRefDESC(awb);
        }
        return result;
    }
    
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filtermerchant/{merchantCode}/sort/gdnref/{order}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    Page<AWB> findMerchantCodeSortGdnRef(@PathVariable("order") String order, @PathVariable("merchantCode") String merchantCode,Pageable pageable) {
        if(order.toLowerCase().equals("asc")){
            awbs = awbService.findMerchantCodeSortByGdnRefASC(merchantCode,pageable);
        }
        else if(order.toLowerCase().equals("desc")){
            awbs = awbService.findMerchantCodeSortByGdnRefDESC(merchantCode,pageable);
        }
        pageClass = new PageClass();
        pageClass.setTotal_page(awbs.getTotalPages());
        pageClass.setItem_page(awbs.getSize());
        pageClass.setPage(awbs.getNumber());
        return awbs;
    }
    
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filterGdnRef/{gdnRef}/sort/gdnref/{order}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    Page<AWB> findGdnRefSortGdnRef(@PathVariable("order") String order, @PathVariable("gdnRef") String gdnRef,Pageable pageable) {
        if(order.toLowerCase().equals("asc")){
            awbs = awbService.findGdnRefSortByGdnRefASC(gdnRef,pageable);
        }
        else if(order.toLowerCase().equals("desc")){
            awbs = awbService.findGdnRefSortByGdnRefDESC(gdnRef,pageable);
        }
        pageClass = new PageClass();
        pageClass.setTotal_page(awbs.getTotalPages());
        pageClass.setItem_page(awbs.getSize());
        pageClass.setPage(awbs.getNumber());
        return awbs;
    }
    
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filter/{month}/{year}/{logisticName}/{awbNumber}/{reconGdnRef}/{merchantCode}/{gdnRef}/sort/gdnref/{order}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Page<AWB> filterAllSortByGdnRef(@PathVariable("month") Integer  month, @PathVariable("year") Integer year, @PathVariable("logisticName") String logisticName, @PathVariable("awbNumber") String awbNumber, @PathVariable("reconStatus") String reconStatus, @PathVariable("merchantCode") String merchantCode, @PathVariable("gdnRef") String gdnRef, @PathVariable("order") String order, Pageable pageable) {
        if(order.toLowerCase().equals("asc")){
            awbs = awbService.filterAllSortByGdnRefASC(month, year, logisticName, awbNumber, reconStatus, merchantCode, gdnRef,pageable);
        }
        else if(order.toLowerCase().equals("desc")){
            awbs = awbService.filterAllSortByGdnRefDESC(month, year, logisticName, awbNumber, reconStatus, merchantCode, gdnRef,pageable);
        }
        pageClass = new PageClass();
        pageClass.setTotal_page(awbs.getTotalPages());
        pageClass.setItem_page(awbs.getSize());
        pageClass.setPage(awbs.getNumber());
        return awbs;
    }
    
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filterinvoice/{month}/{year}/{logisticName}/sort/gdnref/{order}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Page<AWB> filterByInvoiceSortByGdnRef(@PathVariable("month") Integer  month, @PathVariable("year") Integer year, @PathVariable("logisticName") String logisticName,@PathVariable("order") String order,Pageable pageable) {
        
        if(order.toLowerCase().equals("asc")){
            awbs = awbService.filterByInvoiceSortByGdnRefASC(month, year, logisticName,pageable);
        }
        else if(order.toLowerCase().equals("desc")){
            awbs = awbService.filterByInvoiceSortByGdnRefDESC(month, year, logisticName,pageable);
        }
        pageClass = new PageClass();
        pageClass.setTotal_page(awbs.getTotalPages());
        pageClass.setItem_page(awbs.getSize());
        pageClass.setPage(awbs.getNumber());
        return awbs;
    }
    
    
    @CrossOrigin
    @RequestMapping(value = "/api/awb/filterinvoice/{month}/{year}/{logisticName}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Page<AWB> filterByInvoice(@PathVariable("month") Integer month, @PathVariable("year") Integer year, @PathVariable("logisticName") String logisticName,Pageable pageable) {
        awbs = awbService.filterByInvoice(month, year, logisticName,pageable);
        pageClass = new PageClass();
        pageClass.setTotal_page(awbs.getTotalPages());
        pageClass.setItem_page(awbs.getSize());
        pageClass.setPage(awbs.getNumber());
        return awbs;
    }
}
