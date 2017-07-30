/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.services;

import com.gdn.scm.bolivia.entity.UploadHistory;
import com.gdn.scm.bolivia.entity.UploadHistory;
import com.gdn.scm.bolivia.request.UploadHistoryRequest;
import java.util.List;

/**
 *
 * @author sofrie.zumaytis
 */
public interface UploadHistoryService {
    void addUploadHistory(UploadHistoryRequest a);
    
     void addUploadHistory(UploadHistory a);
    
    UploadHistory getById(Integer ID);

    List<UploadHistory> getAll();

    List<UploadHistory> getByStatus(String status);
    
    List<UploadHistory> getByYear(Integer year);
    
    List<UploadHistory> getByLogisticName (String logisticName);
    
    List<UploadHistory> getByMonth(Integer month);    
   
    List<UploadHistory> filterAll(Integer month, Integer year, String logisticName, String AwbNumber, String reconStatus, String merchantCode, String gdnRef);

    void updateUploadHistory(UploadHistoryRequest a);

    void deleteUploadHistory(Integer id);
    
    UploadHistory selectLastUploadHistory();
    
    UploadHistory findTop1ByOrderByIdDesc();
    
    List<String> getAllMonth();
    List<String> getAllYear();
    
    List<UploadHistory> getByInvoice(String invoice);
}
