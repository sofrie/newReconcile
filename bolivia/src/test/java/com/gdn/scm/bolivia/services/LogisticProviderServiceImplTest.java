/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.services;

import com.gdn.scm.bolivia.entity.LogisticProvider;
import com.gdn.scm.bolivia.repository.LogisticProviderRepository;
import com.gdn.scm.bolivia.request.LogisticProviderRequest;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author sofri
 */
@RunWith(MockitoJUnitRunner.class)
public class LogisticProviderServiceImplTest {

    @Mock
    LogisticProviderRepository logisticProviderRepositoryMock;

    @InjectMocks
    LogisticProviderServiceImpl instance;
    //kita tes ini dulu ya

    LogisticProvider sampleLogistic = new LogisticProvider("a", "a", "Active", new BigDecimal(10), new BigDecimal(10));

    @Test
    public void testGetAllWith3DataList() {
        System.out.println("getAll");
        // find allnya akan ngeturn list yang kita buat sekarang
        List<LogisticProvider> tmpResult = new ArrayList<LogisticProvider>();
        tmpResult.add(new LogisticProvider());
        tmpResult.add(new LogisticProvider());
        tmpResult.add(new LogisticProvider());

        when(logisticProviderRepositoryMock.findAll()).thenReturn(tmpResult);
        //ceritanya listnya nti ngereturn 3 data

        //buat nampung result
        List<LogisticProvider> result = instance.getAll();
        assertEquals(3, result.size());
    }

    /**
     * Test of updateLogisticProvider method, of class
     * LogisticProviderServiceImpl.
     */
    @Test
    public void testUpdateLogisticProvider() {
        LogisticProvider tmpResult = new LogisticProvider("a", "a", "Active", new BigDecimal(10), new BigDecimal(10));
        tmpResult.setId(1);
        logisticProviderRepositoryMock.save(tmpResult);
        //kalau getOne d panggil, return tmpResult
        //kalau anyInt, artinya d masukin angka apa aja, returnnya tmpResult , klo isi angka 1, 
        //cuma angka 1 aja yang return tmpResult, sisanya tidak terdefinisikan
        when(logisticProviderRepositoryMock.findOne(anyInt())).thenReturn(tmpResult);
        when(logisticProviderRepositoryMock.save(tmpResult)).thenReturn(tmpResult);
        LogisticProviderRequest request = new LogisticProviderRequest(1,"abc", "a", "Active", new BigDecimal(10), new BigDecimal(10));
        instance.updateLogisticProvider(request);
        
        
        //hasil yang diharapkan
        LogisticProvider expResult = new LogisticProvider();
        expResult.setId(1);
        expResult.setLogisticCode("abc");
        expResult.setLogisticName("a");
        expResult.setDiscount(BigDecimal.TEN);
        expResult.setVat(BigDecimal.TEN);
        expResult.setStatus("Active");

        //when(logisticProviderRepositoryMock.save(tmpResult)).thenReturn(tmpResult);
        instance.setStatusInactive(1);

        //apakah hasil sblum d ubah sesuai dgn hasil harapan, kalau ya = pass
        assertEquals(expResult.getStatus(), tmpResult.getStatus());
    }

    /**
     * Test of getByStatus method, of class LogisticProviderServiceImpl.
     */
    @Test
    public void testGetByStatus() {

        System.out.println("getByStatus");
        String status = "Active";
        LogisticProvider tmpResult = new LogisticProvider("a", "a", "Active", new BigDecimal(10), new BigDecimal(10));
        logisticProviderRepositoryMock.save(tmpResult);
        LogisticProvider tmpResult2 = new LogisticProvider("b", "b", "Inactive", new BigDecimal(10), new BigDecimal(10));
        logisticProviderRepositoryMock.save(tmpResult2);
        LogisticProvider tmpResult3 = new LogisticProvider("c", "c", "Active", new BigDecimal(10), new BigDecimal(10));
        logisticProviderRepositoryMock.save(tmpResult3);

        List<LogisticProvider> expResult = new ArrayList<LogisticProvider>();
        expResult.add(tmpResult);
        expResult.add(tmpResult3);

        when(logisticProviderRepositoryMock.findByStatus(status)).thenReturn(expResult);
        List<LogisticProvider> result = instance.getByStatus(status);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of findLastId method, of class LogisticProviderServiceImpl.
     */
    @Test
    public void testFindLastId() {
        System.out.println("findLastId");
        LogisticProvider tmpResult = new LogisticProvider("a", "a", "Active", new BigDecimal(10), new BigDecimal(10));
        logisticProviderRepositoryMock.save(tmpResult);
        LogisticProvider tmpResult2 = new LogisticProvider("b", "b", "Inactive", new BigDecimal(10), new BigDecimal(10));
        logisticProviderRepositoryMock.save(tmpResult2);

        LogisticProvider expResult = tmpResult2;
        when(logisticProviderRepositoryMock.findTop1ByOrderByIdDesc()).thenReturn(tmpResult2);
        LogisticProvider result = instance.findLastId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatusInactive method, of class LogisticProviderServiceImpl.
     */
    @Test
    public void testSetStatusInactive() {
        //hasil sblum diubah
        LogisticProvider tmpResult = new LogisticProvider("a", "a", "Active", new BigDecimal(10), new BigDecimal(10));
        tmpResult.setId(1);
        //kalau getOne d panggil, return tmpResult
        //kalau anyInt, artinya d masukin angka apa aja, returnnya tmpResult , klo isi angka 1, 
        //cuma angka 1 aja yang return tmpResult, sisanya tidak terdefinisikan
        when(logisticProviderRepositoryMock.getOne(anyInt())).thenReturn(tmpResult);

        //hasil yang diharapkan
        LogisticProvider expResult = new LogisticProvider();
        expResult.setId(1);
        expResult.setLogisticCode("a");
        expResult.setLogisticName("a");
        expResult.setDiscount(BigDecimal.TEN);
        expResult.setVat(BigDecimal.TEN);
        expResult.setStatus("Inactive");

        //when(logisticProviderRepositoryMock.save(tmpResult)).thenReturn(tmpResult);
        instance.setStatusInactive(1);

        //apakah hasil sblum d ubah sesuai dgn hasil harapan, kalau ya = pass
        assertEquals(expResult.getStatus(), tmpResult.getStatus());

    }

    /**
     * Test of setStatusActive method, of class LogisticProviderServiceImpl.
     */
    @Test
    public void testSetStatusActive() {
        LogisticProvider tmpResult = new LogisticProvider("a", "a", "Inactive", new BigDecimal(10), new BigDecimal(10));
        logisticProviderRepositoryMock.save(tmpResult);
        LogisticProvider expResult = tmpResult;
        expResult.setStatus("Active");
        when(logisticProviderRepositoryMock.findOne(1)).thenReturn(tmpResult);
        when(logisticProviderRepositoryMock.save(tmpResult)).thenReturn(expResult);
        instance.setStatusInactive(1);
        LogisticProvider result = logisticProviderRepositoryMock.findOne(1);
        assertEquals("Active", result.getStatus());
    }

    /**
     * Test of getAllLogistic method, of class LogisticProviderServiceImpl.
     */
    @Test
    public void testGetAllLogistic() {
        List<String> tmpResult = new ArrayList<String>();
        tmpResult.add("A");
        tmpResult.add("B");
        tmpResult.add("C");

        when(logisticProviderRepositoryMock.getAllLogistic()).thenReturn(tmpResult);

        System.out.println("getAllLogistic");
        List<String> expResult = null;
        List<String> result = instance.getAllLogistic();
        assertEquals(3, result.size());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class LogisticProviderServiceImpl.
     */
    @Test
    public void testFindById() {

        System.out.println("findById");
        Integer Id = 1;
        LogisticProvider tmpResult = new LogisticProvider("a", "a", "Active", new BigDecimal(10), new BigDecimal(10));
        logisticProviderRepositoryMock.save(tmpResult);
        LogisticProvider expResult = tmpResult;
        when(logisticProviderRepositoryMock.findOne(Id)).thenReturn(tmpResult);
        LogisticProvider result = instance.findById(Id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of findLogisticNameByStatus method, of class
     * LogisticProviderServiceImpl.
     */
    @Test
    public void testFindLogisticNameByStatus() {
        System.out.println("findLogisticNameByStatus");
        LogisticProvider tmpResult = new LogisticProvider("a", "a", "Active", new BigDecimal(10), new BigDecimal(10));
        logisticProviderRepositoryMock.save(tmpResult);
        LogisticProvider tmpResult2 = new LogisticProvider("b", "b", "Inactive", new BigDecimal(10), new BigDecimal(10));
        logisticProviderRepositoryMock.save(tmpResult2);
        LogisticProvider tmpResult3 = new LogisticProvider("c", "c", "Active", new BigDecimal(10), new BigDecimal(10));
        logisticProviderRepositoryMock.save(tmpResult3);

        String status = "Active";
        List<String> expResult = new ArrayList<String>();
        expResult.add(tmpResult.getLogisticName());
        expResult.add(tmpResult3.getLogisticName());

        when(logisticProviderRepositoryMock.findLogisticNameByStatus(status)).thenReturn(expResult);
        List<String> result = instance.findLogisticNameByStatus(status);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

}
