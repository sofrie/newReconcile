/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.controller;


import com.gdn.scm.bolivia.services.ProcessService;
import com.gdn.scm.bolivia.entity.Process;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sofrie.zumaytis
 */
@RestController
@RequestMapping("/proccess")
public class ProcessController {
	@Autowired
	ProcessService processService;
	
	@RequestMapping(method= RequestMethod.POST)
	public Process process(@RequestBody Process process)
	{
           // return process;
		return processService.requestProcess(process);
	}
}
