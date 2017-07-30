/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.services;

import static ch.qos.logback.core.util.StatusPrinter.print;
import com.gdn.scm.bolivia.entity.LogisticProvider;
import com.gdn.scm.bolivia.repository.LogisticProviderRepository;
import com.gdn.scm.bolivia.request.LogisticProviderRequest;
import java.io.Console;
import static java.lang.System.console;
import static java.lang.System.out;
import static java.time.Clock.system;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sofrie.zumaytis
 */
@Service
public class LogisticProviderServiceImpl implements LogisticProviderService {

    @Autowired
    LogisticProviderRepository logisticProviderRepository;

    @Override
    public void addLogisticProvider(LogisticProviderRequest request) {
        LogisticProvider logistic = new LogisticProvider(request.getLogisticCode(), request.getLogisticName(), request.getStatus(), request.getDiscount(), request.getVat());
        Integer count;
        count = -1;
        try {
            count = this.findLastId().getId();
            System.out.println("countt" + count.toString());
            System.out.println("countttttttttttt" + count.toString());
            if (count != -1 && count != null) {
                count = count + 1;
                System.out.println("countttttttttttt" + count.toString());
            } else {
                count = 1;
            }
        } catch (Exception e) {
            count = 1;
        }
        String number = "";
        if (count < 10) {
            number = "00" + count;
        } else if (count < 100) {
            number = "0" + count;
        }

        //logistic.setId(count);
        logistic.setLogisticCode("LogisticCode" + number);
//        System.out.print("---------");
//        System.out.print(logistic.getId());
//        System.out.print("-----------");
        logisticProviderRepository.save(logistic);
    }

    @Override
    public List<LogisticProvider> getAll() {
        return logisticProviderRepository.findAll();
    }

    @Override
    public void updateLogisticProvider(LogisticProviderRequest a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteLogisticProvider(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    @Override
//    public List<LogisticProvider> GetAllLogisticProvider(Integer merchantid) {
//        
//    }
    @Override
    public List<LogisticProvider> getByStatus(String status) {
        if (status.equals("All")) {
            return logisticProviderRepository.findAll();
        } else {
            return logisticProviderRepository.findByStatus(status);
        }
    }

    @Override
    public LogisticProvider findLastId() {
        return logisticProviderRepository.findTop1ByOrderByIdDesc();
    }
    
    @Override
    public void setStatusInactive(Integer id){
        LogisticProvider l=logisticProviderRepository.getOne(id);
        if(l!=null){
            l.setStatus("Inactive");
            logisticProviderRepository.save(l);
        }
    }
    @Override
    public void setStatusActive(Integer id){
        LogisticProvider l=logisticProviderRepository.getOne(id);
        if(l!=null){
            l.setStatus("Active");
            logisticProviderRepository.save(l);
        }
    }
    
    @Override
    public List<String> getAllLogistic() {
        return logisticProviderRepository.getAllLogistic();
    }

    @Override
    public LogisticProvider findById(Integer Id) {
        return logisticProviderRepository.findOne(Id);
    }

    @Override
    public List<String> findLogisticNameByStatus(String status) {
        return logisticProviderRepository.findLogisticNameByStatus(status);
    }

}
