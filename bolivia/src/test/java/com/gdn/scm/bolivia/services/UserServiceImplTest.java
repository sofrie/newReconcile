/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.services;

import com.gdn.scm.bolivia.entity.User;
import com.gdn.scm.bolivia.request.UserRequest;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 *
 * @author sofri
 */
public class UserServiceImplTest {
    
    public UserServiceImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPasswordEncoder method, of class UserServiceImpl.
     */
    @Test
    public void testGetPasswordEncoder() {
        System.out.println("getPasswordEncoder");
        UserServiceImpl instance = new UserServiceImpl();
        PasswordEncoder expResult = null;
        PasswordEncoder result = instance.getPasswordEncoder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class UserServiceImpl.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        User user = null;
        UserServiceImpl instance = new UserServiceImpl();
        instance.save(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class UserServiceImpl.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        String username = "";
        UserServiceImpl instance = new UserServiceImpl();
        User expResult = null;
        User result = instance.getUser(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addUser method, of class UserServiceImpl.
     */
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        UserRequest user = null;
        UserServiceImpl instance = new UserServiceImpl();
        instance.addUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllUsers method, of class UserServiceImpl.
     */
    @Test
    public void testGetAllUsers() {
        System.out.println("getAllUsers");
        UserServiceImpl instance = new UserServiceImpl();
        List<User> expResult = null;
        List<User> result = instance.getAllUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
