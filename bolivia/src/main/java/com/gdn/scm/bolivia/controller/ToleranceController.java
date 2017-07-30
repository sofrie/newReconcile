/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.controller;

import com.gdn.scm.bolivia.entity.LogisticProvider;
import com.gdn.scm.bolivia.entity.Tolerance;
import com.gdn.scm.bolivia.request.LogisticProviderRequest;
import com.gdn.scm.bolivia.request.ToleranceRequest;
import com.gdn.scm.bolivia.services.ToleranceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sofrie.zumaytis
 */
@RestController
public class ToleranceController {

    @Autowired
    ToleranceService toleranceService;

    @CrossOrigin
    @RequestMapping(value = "/api/tolerances", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Tolerance listTolerance() {
        return toleranceService.getTolerance();
    }
    @CrossOrigin
    @RequestMapping(value = "/api/tolerances", method = RequestMethod.POST)
    public void updateTolerance(@RequestBody ToleranceRequest request) {
        toleranceService.addTolerance(request);
    }
}
