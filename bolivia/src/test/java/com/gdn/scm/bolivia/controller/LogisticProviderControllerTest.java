/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.controller;

import com.gdn.scm.bolivia.entity.LogisticProvider;
import com.gdn.scm.bolivia.request.LogisticProviderRequest;
import com.gdn.scm.bolivia.services.LogisticProviderService;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import static org.mockito.Matchers.anyInt;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * 
 *
 * @author sofri
 */
@RunWith(MockitoJUnitRunner.class)
public class LogisticProviderControllerTest {
    
    //dia manggil logisticproviderservice.getall
    //jd kita mock si logisticproviderservice (mock = palsuin/duplikat/replika)
    @Mock
    LogisticProviderService mockObject; 
    
    @InjectMocks
    LogisticProviderController instance ;
    //ga usah di new LogsisticProviderController()
    
    //ini SKENARO klo database return 3 data
    @Test
    public void testListlogistikDgnResult3Data() {
       
        //tapi listlogistik() manggil method getAll()
        //jd kita harus kasih tau, sementara, getall() bakal return apa
        //kita return list tmpData
        List<LogisticProvider> tmpData = new ArrayList<LogisticProvider>();
        tmpData.add(new LogisticProvider());
        tmpData.add(new LogisticProvider());
        tmpData.add(new LogisticProvider());
        //ini di siapin dlu kan buat data mock nya//krna pk mockinto jd ga usa hehe
        //klo after itu, klo abis method d panggil mau d simpen k Log misalnya..
        //di tes jg simpen k lognya jalan ato ngga
        //d cek baris lognya berubah ato ngga cara tes d assertEquals nya hehehe
        //ga harus ada datanya
        //bisa aja ekspektasinya null/exception
        
       //kasih tau sementara getall return apa
       //pada saat getAll di panggil, maka kembalikan tmpData
       //padahal kan getAll normalnya return data di database
        when(mockObject.getAll()).thenReturn(tmpData);//ini juga artinya before, sblm tes kan ini hrs d siapin dlu
        
        //dia manggil listlogistik (method yang bakal di tes)
        List<LogisticProvider> result = instance.listlogistik();
        
        //klo yang dia return ukurannya 3, berarti uda sesuai dgn ekspektasi 
        assertEquals(3, result.size());
      
    }

    //ini SKENARIO kalo database returnnya null
    @Test
    public void testListlogistikDgnResultNull() {
       
        //tapi listlogistik() manggil method getAll()
        //jd kita harus kasih tau, sementara, getall() bakal return apa
        //kita return list tmpData
        List<LogisticProvider> tmpData = null;// TMPDATA NULL YA harus banget caps ko wkwkwk
        //ini di siapin dlu kan buat data mock nya//krna pk mockinto jd ga usa hehe
        //klo after itu, klo abis method d panggil mau d simpen k Log misalnya..
        //di tes jg simpen k lognya jalan ato ngga
        //d cek baris lognya berubah ato ngga cara tes d assertEquals nya hehehe
        //ga harus ada datanya
        //bisa aja ekspektasinya null/exception
        
       //kasih tau sementara getall return apa
       //pada saat getAll di panggil, maka kembalikan null
       //padahal kan getAll normalnya return data di database
        when(mockObject.getAll()).thenReturn(tmpData);//ini juga artinya before, sblm tes kan ini hrs d siapin dlu
        //lihat yang ini RETURN NULL si getallnya
        
        //dia manggil listlogistik (method yang bakal di tes)
        List<LogisticProvider> result = instance.listlogistik();
        
        //klo yang dia return ukurannya 3, berarti uda sesuai dgn ekspektasi 
        assertEquals("Ekspektasi null, ",null, result);
      
    }
    /**
     * Test of sortLogistik method, of class LogisticProviderController.
     */
    @Test
    public void testSortLogistik() {
        System.out.println("sortLogistik");
        String status = "";
        LogisticProviderController instance = new LogisticProviderController();
        List<LogisticProvider> expResult = null;
        List<LogisticProvider> result = instance.sortLogistik(status);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createLogistic method, of class LogisticProviderController.
     */
    @Test
    public void testCreateLogistic() {
        System.out.println("createLogistic");
        LogisticProviderRequest request = null;
        LogisticProviderController instance = new LogisticProviderController();
        instance.createLogistic(request);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        //test ini pasti return fail karena ada method fail di atas
    }

    /**
     * Test of getAllLogistic method, of class LogisticProviderController.
     */
    @Test
    public void testGetAllLogistic() {
        System.out.println("getAllLogistic");
        LogisticProviderController instance = new LogisticProviderController();
        List<String> expResult = null;
        List<String> result = instance.getAllLogistic();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inactivateLogistic method, of class LogisticProviderController.
     */
    @Test
    public void testInactivateLogistic() {
        System.out.println("inactivateLogistic");
        Integer id = null;
        LogisticProviderController instance = new LogisticProviderController();
        instance.inactivateLogistic(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of activateLogistic method, of class LogisticProviderController.
     */
    
    //berharap dapet exception null pointer
    @Test(expected = NullPointerException.class)
    public void testActivateLogisticNull() {
        System.out.println("activateLogistic");
        Integer id = null;
        //kita mock setstatusactive(parameter integer id)
        //klo parameter string, anyString() ok
        //ini karena void jd bingung,
        //biasa kan klo set status, nti ada respons berhasil/ngga, true or false kan..
        //void not allowed here
        //ngga bisa di cek sama atau ngga nya??
        //sama apanya?
        //jadi pas uda di set di cek status nya sama ngga sama yg idmau<<
        //buat pertanyaan yang ^^^, kan kita cuma tes method ActiveLogistic
        //klo mau tes statusnya berubah ato ngga, tesnya berarti di method
        //yang ada ubah datanya hehehe
      //oo
        //kin? dpt data statusnya berarti kan dari database ya..hmm
        //dia bakal return true kalo method setStatusActive d panggil dgn
        //parameter integer apapun (-999 - 999) dst..
        
        //kita kan cuma mau tes, apakah method ActiveLogistic berjalan sesuai 
        //atau tidak//junit cuma tes 1 method aja ga berurutan gt, jd terpisah gt hehe
        //ngerti kan? iya, yang ini kita do Throw aja
        
        
        //klo kepanggil, dia bakal return null pointer exception
        //bagusnya exceptionyan kamu bkin classnya lg, tp krna males
        //jd aku pk null pointer exception
        Mockito.doThrow(new NullPointerException())
        .when(mockObject).setStatusActive(anyInt());
        LogisticProviderController instance = new LogisticProviderController();
        instance.activateLogistic(id);
    }
    
    @Test
    public void testActivateLogistic() {
        System.out.println("activateLogistic");
        Integer id = null;
        Mockito.doThrow(new NullPointerException())
        .when(mockObject).setStatusActive(anyInt());
        LogisticProviderController instance = new LogisticProviderController();
        instance.activateLogistic(id);
    }

    /**
     * Test of findActiveNameLogistic method, of class LogisticProviderController.
     */
    @Test
    public void testFindActiveNameLogistic() {
        System.out.println("findActiveNameLogistic");
        LogisticProviderController instance = new LogisticProviderController();
        List<String> expResult = null;
        List<String> result = instance.findActiveNameLogistic();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
