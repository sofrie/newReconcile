/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.controller;

import com.gdn.scm.bolivia.entity.UploadHistory;
import com.gdn.scm.bolivia.services.UploadHistoryService;
import java.io.File;
import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sofrie.zumaytis
 */
@RestController
public class MailController {
    @Autowired
	JavaMailSender javaMailSender;
    
    @Autowired
    UploadHistoryService uploadHistoryService; 

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	String GetAllUsers() {
		return "Anda mencari data semua user";
	}
	
	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
	String GetUser(@PathVariable("id") long id) {
		return "Anda mencari data user dengan id : " + id;
	}
	
	@RequestMapping(value = "/users/sendmail", method = RequestMethod.GET)
	String SendEmail() {
		try {
			MimeMessage mail = javaMailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(mail, true);
                        helper.setFrom("bliblibolivia@outlook.com");
			helper.setTo("sofriesilero.zumaytis@gmail.com");
			helper.setSubject("Percobaan aja");
			helper.setText("Halo ini tes email", false);
			FileSystemResource file = new FileSystemResource(new File("D:/Invoice.xlsx"));
			helper.addAttachment("percobaan.xlsx", file);
			javaMailSender.send(mail);
			System.out.println("Done");
			return "Anda berhasil mengirim email";

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return "Mungkin terjadi kesalahan";
	}
        
        
        @RequestMapping(value = "/users/sendmail/{idUpload}", method = RequestMethod.GET)
	String SendEmailData(@PathVariable("idUpload") Integer idUpload) {
		try {
                        UploadHistory history=uploadHistoryService.getById(idUpload);
                    
			MimeMessage mail = javaMailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(mail, true);
                        helper.setFrom("bliblibolivia@outlook.com");
			helper.setTo("sofriesilero.zumaytis@gmail.com");
			helper.setSubject("Percobaan aja");
			helper.setText("Halo ini tes email", false);
			FileSystemResource file = new FileSystemResource(new File(history.getNamaFile()));
                        String fileNameSend=history.getLogistic()+"_" +history.getMonth().toString()+"_"+history.getYear().toString()+".xlsx";
			helper.addAttachment(fileNameSend, file);
			javaMailSender.send(mail);
			System.out.println("Done");
			return "Anda berhasil mengirim email";

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return "Mungkin terjadi kesalahan"; 
	}
}
