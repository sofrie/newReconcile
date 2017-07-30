/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.services;

import com.gdn.scm.bolivia.entity.AWB;
import com.gdn.scm.bolivia.entity.PageClass;
import com.gdn.scm.bolivia.repository.AWBPagingRepository;
import com.gdn.scm.bolivia.repository.AWBRepository;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

/**
 *
 * @author sofrie.zumaytis
 */
@Service
@Transactional
public class AWBPagingServiceImpl implements AWBPagingService 
{
    @Autowired
    AWBPagingRepository aWBPagingRepository;
    
    @Autowired
    AWBRepository aWBRepository;

    @Override
    public Page<AWB> listAllByPage(Pageable pageable) {
        return aWBPagingRepository.findAll(pageable);
    }

    @Override
    public Page<AWB> listAllByPageOrderByawbNumberDesc(Pageable pageable) {         
         Page<AWB> awbPage= aWBPagingRepository.findAll(pageable);
         PageClass pageClass=new PageClass();
         pageClass.setTotal_page(awbPage.getTotalPages());
         return awbPage;
    }    
}
