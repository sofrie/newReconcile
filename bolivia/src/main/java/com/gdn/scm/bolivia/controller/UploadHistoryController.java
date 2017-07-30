/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.controller;

import com.gdn.scm.bolivia.entity.AWB;
import com.gdn.scm.bolivia.entity.UploadHistory;
import com.gdn.scm.bolivia.request.LogisticProviderRequest;
import com.gdn.scm.bolivia.request.UploadHistoryRequest;
import com.gdn.scm.bolivia.services.UploadHistoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.io.File;
import java.io.FileInputStream;
import org.codehaus.plexus.util.FileUtils;

/**
 *
 * @author sofrie.zumaytis
 */
@RestController
public class UploadHistoryController {

    @Autowired
    UploadHistoryService uploadHistoryService;

    @CrossOrigin
    @RequestMapping(value = "/api/uploadHistory", method = RequestMethod.POST)
    public void createUploadHistory(@RequestBody UploadHistoryRequest request) {
        uploadHistoryService.addUploadHistory(request);
        //return logistic;
    }

    @CrossOrigin
    @RequestMapping(value = "/api/uploadHistory", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UploadHistory> getAllUploadHistory() {
        return uploadHistoryService.getAll();
        //return logistic;
    }

    @CrossOrigin
    @RequestMapping(value = "/api/uploadHistory/month/{month}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UploadHistory> filterByMonth(@PathVariable("month") Integer month) {
        return uploadHistoryService.getByMonth(month);
    }

    @CrossOrigin
    @RequestMapping(value = "/api/uploadHistory/year/{year}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UploadHistory> filterByYear(@PathVariable("year") Integer year) {
        return uploadHistoryService.getByYear(year);
    }

    @CrossOrigin
    @RequestMapping(value = "/api/uploadHistory/logistic/{logistic}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UploadHistory> filterByLogistic(@PathVariable("logistic") String logistic) {
        return uploadHistoryService.getByLogisticName(logistic);
    }

    //select list in invoice
    @CrossOrigin
    @RequestMapping(value = "/api/uploadHistory/list/month", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> getAllMonth() {
        return uploadHistoryService.getAllMonth();
    }

    @CrossOrigin
    @RequestMapping(value = "/api/uploadHistory/list/year", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> getAllYear() {
        return uploadHistoryService.getAllYear();
    }

    @CrossOrigin
    @RequestMapping(value = "/api/uploadHistory/update", method = RequestMethod.POST)
    public void updateUploadHistory(@RequestBody UploadHistoryRequest request) {
        uploadHistoryService.updateUploadHistory(request);
        //return logistic;
    }

    @CrossOrigin
    @RequestMapping(value = "/api/uploadHistory/download/{idUpload}", method = RequestMethod.GET)
    public void downloadUploadHistory(@PathVariable("idUpload") Integer idUpload) {
        try {
            UploadHistory history= uploadHistoryService.getById(idUpload);
            
            
            String sourceFileName = history.getNamaFile();
            File source = new File(sourceFileName);
            String destFileName = "D:\\Invoice_"+history.getLogistic()+"_"+history.getMonth().toString()+"_"+history.getYear().toString()+"_"+history.getStatus()+".xlsx";
            File dest = new File(destFileName);
            FileUtils.copyFile(source, dest);

        } catch (Exception e) {
            e.printStackTrace();
        }
        //return logistic;
    }
    
    @CrossOrigin
    @RequestMapping(value = "/api/uploadHistory/{invoice}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UploadHistory> filterByInvoice(@PathVariable("invoice") String invoice) {
        List<UploadHistory> list=uploadHistoryService.getByInvoice(invoice);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getMonth());
        }
        return uploadHistoryService.getByInvoice(invoice);
    }
}
