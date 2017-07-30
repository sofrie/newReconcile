/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.services;

import com.gdn.scm.bolivia.entity.AWB;
import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author sofrie.zumaytis
 */
public class AWBClientServiceImplFeign {

    private static final String URI_AWB = "http://localhost:8090";
    
    public AWB getAWBSystem(String awbnumber) throws Exception {
        AWBClientService AWBResource = Feign.builder().encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder()).target(AWBClientService.class, URI_AWB);
        return AWBResource.getAWBSystem(awbnumber);
    }

}
