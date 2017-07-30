/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.services;

import com.gdn.scm.bolivia.entity.AWB;
import feign.Headers;
import feign.Param;
import feign.RequestLine;
import java.util.List;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 *
 * @author sofrie.zumaytis
 */
 
@Headers("Accept: application/json")
public interface AWBClientService {

    @RequestLine("GET /airwayBill/{awbnumber}")
     AWB getAWBSystem(@Param("awbnumber") String awbnumber);
}
