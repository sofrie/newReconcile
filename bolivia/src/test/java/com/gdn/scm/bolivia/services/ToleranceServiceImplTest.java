/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.services;

import com.gdn.scm.bolivia.entity.Tolerance;
import com.gdn.scm.bolivia.repository.LogisticProviderRepository;
import com.gdn.scm.bolivia.repository.ToleranceRepository;
import com.gdn.scm.bolivia.request.ToleranceRequest;
import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import static org.mockito.Matchers.anyString;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.BeanUtils;

/**
 *
 * @author sofri
 */
@RunWith(MockitoJUnitRunner.class)
public class ToleranceServiceImplTest {

    @Mock
    ToleranceRepository toleranceRepositoryMock;

    @InjectMocks
    ToleranceServiceImpl instance;

    /**
     * Test of addTolerance method, of class ToleranceServiceImpl.
     */
    @Test
    public void testAddTolerance() {
        System.out.println("addTolerance");
        BigDecimal decimal = new BigDecimal(10);
        ToleranceRequest request = new ToleranceRequest(decimal, decimal, decimal, decimal, decimal, decimal, decimal, decimal, decimal, decimal, decimal, decimal);
        Tolerance expResult = new Tolerance();
        BeanUtils.copyProperties(request, expResult);

        Tolerance tolerance = new Tolerance(decimal, decimal, decimal, decimal, decimal, decimal, decimal, decimal, decimal, decimal, decimal, decimal);
        tolerance.setId("1");

        when(toleranceRepositoryMock.save(tolerance)).thenReturn(tolerance);
        Tolerance result = instance.addTolerance(request);
        System.out.println("expResult "+expResult.getId());
        System.out.println("result "+result.getId());

        assertEquals(tolerance ,result);
       
    }

    /**
     * Test of updateTolerance method, of class ToleranceServiceImpl.
     */
    @Test
    public void testUpdateTolerance() {
        System.out.println("updateTolerance");
         BigDecimal decimal = new BigDecimal(10);
         Tolerance tolerance = new Tolerance(decimal, decimal, decimal, decimal, decimal, decimal, decimal, decimal, decimal, decimal, decimal, decimal);
        tolerance.setId("1");
        toleranceRepositoryMock.save(tolerance);
        
        decimal = new BigDecimal(1);
        ToleranceRequest request = new ToleranceRequest("1",decimal, decimal, decimal, decimal, decimal, decimal, decimal, decimal, decimal, decimal, decimal, decimal);

        Tolerance tolerance2 = new Tolerance(decimal, decimal, decimal, decimal, decimal, decimal, decimal, decimal, decimal, decimal, decimal, decimal);
        tolerance.setId("1");
        System.out.println("tolerance 2 "+tolerance.getGiftWrapChargeAmount());
        when(toleranceRepositoryMock.findOne(anyString())).thenReturn(tolerance);
//        when(toleranceRepositoryMock.save(tolerance2)).thenReturn(tolerance2);
        Tolerance result=instance.updateTolerance(request);
        
        System.out.println("tolerance "+tolerance.getId());
        System.out.println("result "+result.getId());
        assertEquals(tolerance2, result);
    }

    /**
     * Test of getTolerance method, of class ToleranceServiceImpl.
     */
    @Test
    public void testGetTolerance() {
        System.out.println("getTolerance");
        BigDecimal decimal = new BigDecimal(10);
        Tolerance tolerance = new Tolerance(decimal, decimal, decimal, decimal, decimal, decimal, decimal, decimal, decimal, decimal, decimal, decimal);
        tolerance.setId("1");
        toleranceRepositoryMock.save(tolerance);
                
        when(toleranceRepositoryMock.findOne(anyString())).thenReturn(tolerance);
        Tolerance result = instance.getTolerance();
        assertEquals(tolerance, result);
    }

}
