/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.services;

import com.gdn.scm.bolivia.BoliviaApplication;
import javafx.application.Application;
import com.gdn.scm.bolivia.entity.Process;
import com.gdn.scm.bolivia.entity.AWB;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sofrie.zumaytis
 */
@Service
public class ProcessService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public Integer counter = 0;

    public Process requestProcess(Process process) {
        System.out.println("Reques process" + process);
        rabbitTemplate.convertAndSend(BoliviaApplication.queueName, process);
        counter++;
        return process;
    }

    public AWB requestProcess(AWB awb) {
        System.out.println("Reques process" + awb.getId());
        rabbitTemplate.convertAndSend(BoliviaApplication.queueName, awb);
        counter++;
        //System.out.println("counter....................." + counter.toString());
        return awb;
    }
}
