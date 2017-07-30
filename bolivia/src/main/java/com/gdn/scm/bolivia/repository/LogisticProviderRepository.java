/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.repository;

import com.gdn.scm.bolivia.entity.LogisticProvider;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sofrie.zumaytis
 */
@Repository
public interface LogisticProviderRepository extends JpaRepository<LogisticProvider, Integer> {
    public List<LogisticProvider> findByStatus(String status);
     
    public LogisticProvider findTop1ByOrderByIdDesc();
    
    public LogisticProvider findByLogisticName(String logisticName);
    
    @Query("select distinct a.logisticName from LogisticProvider a")
    public List<String> getAllLogistic();
    
    @Query("select distinct a.logisticName from LogisticProvider a where a.status = ?")
    public List<String> findLogisticNameByStatus(String status);
    
//    @Query("SELECT FROM blv_logistic_provider WHERE status = 'Active'")
//    public List<LogisticProvider> getActiveLogistic();
}
