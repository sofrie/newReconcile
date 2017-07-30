/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.services;

import com.gdn.scm.bolivia.entity.AWB;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 *
 * @author sofrie.zumaytis
 */
public interface AWBPagingService {
    Page<AWB> listAllByPage(Pageable pageable);
    Page<AWB> listAllByPageOrderByawbNumberDesc(Pageable pageable);
}
