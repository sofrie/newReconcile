/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.services;

import com.gdn.scm.bolivia.entity.Invoice;
import com.gdn.scm.bolivia.entity.UploadHistory;
import com.gdn.scm.bolivia.repository.UploadHistoryRepository;
import com.gdn.scm.bolivia.request.UploadHistoryRequest;
import static com.oracle.jrockit.jfr.ContentType.Timestamp;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Date;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sofrie.zumaytis
 */
@Service
public class UploadHistoryServiceImpl implements UploadHistoryService {

    @Autowired
    UploadHistoryRepository uploadHistoryRepository;
    
    @Autowired
    InvoiceService invoiceService;

    @Override
    public void addUploadHistory(UploadHistoryRequest a) {
        UploadHistory upload = new UploadHistory();
        BeanUtils.copyProperties(a, upload);
        
        Date today = new Date();
        //SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss");
        Timestamp timestamp=new Timestamp(today.getTime());
        String date = timestamp.toString();
        System.out.println("Today in dd-MM-yyyy format : " + date);
       
        try {
            //SET UPLOAD
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(UploadHistoryServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        Invoice ada = invoiceService.findByMonthAndYearAndLogisticName(a.getMonth(), a.getYear(), a.getLogistic());
        //Invoice invoiceA=invoiceService.findTop1ByOrderByLastModifiedDesc();
        System.out.println("invoice --- "+ ada.getId());
        upload.setInvoice(ada);
        upload.setOk("-");
        upload.setProblemExist("-");
        upload.setJumlahTagihan(new BigDecimal(0));
        upload.setStatus("Uploaded");
        upload.setLast_modified(date);
        //UploadHistory tmp=new UploadHistory("3", "June", "2017", "300", "3", "Rp.xxxx.xxx", "A Logistic", "Uploaded", date.toString());
        //System.out.println("IDDDDDDDD "+upload.getId());
        try {
            uploadHistoryRepository.save(upload);
        }
        catch (Exception e)
        {
            System.out.println("GAGAL---------");
            e.printStackTrace();
        }
    }

    @Override
    public List<UploadHistory> getAll() {
        return uploadHistoryRepository.findAll();
    }

    @Override
    public List<UploadHistory> getByStatus(String status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UploadHistory> getByYear(Integer year) {
        return uploadHistoryRepository.findByYear(year);
    }

    @Override
    public List<UploadHistory> getByLogisticName(String logisticName) {
        return uploadHistoryRepository.findByLogistic(logisticName);
    }

    @Override
    public List<UploadHistory> getByMonth(Integer month) {
        return uploadHistoryRepository.findByMonth(month);
    }

    @Override
    public List<UploadHistory> filterAll(Integer month, Integer year, String logisticName, String AwbNumber, String reconStatus, String merchantCode, String gdnRef) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateUploadHistory(UploadHistoryRequest a) {
        UploadHistory upload= uploadHistoryRepository.findOne(a.getId());
        System.out.println("id upload "+ a.getId());
        System.out.println("status upload "+a.getStatus());
        upload.setStatus(a.getStatus());
        uploadHistoryRepository.save(upload);
    }

    @Override
    public void deleteUploadHistory(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UploadHistory getById(Integer ID) {
        return uploadHistoryRepository.findOne(ID);
    }

    @Override
    public void addUploadHistory(UploadHistory a) {
        uploadHistoryRepository.save(a);
    }
    
    @Override
    public UploadHistory findTop1ByOrderByIdDesc() {
        return uploadHistoryRepository.findTop1ByOrderByIdDesc();
    }

    @Override
    public UploadHistory selectLastUploadHistory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<String> getAllMonth() {
        return uploadHistoryRepository.getAllMonth();
    }
    @Override
    public List<String> getAllYear() {
        return uploadHistoryRepository.getAllYear();
    }

    @Override
    public List<UploadHistory> getByInvoice(String invoice){
        Invoice i=invoiceService.findById(invoice);
        System.out.println(i.getId());
        return uploadHistoryRepository.findByInvoice(i);
    }
}
