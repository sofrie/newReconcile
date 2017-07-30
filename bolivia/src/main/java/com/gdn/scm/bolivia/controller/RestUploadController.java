/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.controller;

import com.gdn.scm.bolivia.entity.UploadModel;
import com.gdn.scm.bolivia.entity.Compare;
import com.gdn.scm.bolivia.entity.UploadHistory;
import com.gdn.scm.bolivia.repository.UploadHistoryRepository;
import com.gdn.scm.bolivia.services.UploadHistoryService;
import java.io.File;
import java.io.FileInputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 *
 * @author sofrie.zumaytis
 */
@RestController
public class RestUploadController {

    @Autowired
    Compare compare;

    @Autowired
    UploadHistoryService uploadHistoryService;

    private final Logger logger = LoggerFactory.getLogger(RestUploadController.class);

    //Save the uploaded file to this folder
    private static String UPLOADED_FOLDER = "D://temp//";

    // 3.1.1 Single file upload
    @PostMapping("/api/upload")
    // If not @RestController, uncomment this
    //@ResponseBody
    @CrossOrigin
    public ResponseEntity<?> uploadFile(@RequestParam MultipartFile invoiceFile) {

        logger.debug("Single file upload!");

        if (invoiceFile.isEmpty()) {
            return new ResponseEntity("please select a file!", HttpStatus.OK);
        }
        try {
            saveUploadedFiles(Arrays.asList(invoiceFile));
        } catch (IOException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity("Successfully uploaded - "
                + invoiceFile.getOriginalFilename(), new HttpHeaders(), HttpStatus.OK);

    }

    // 3.1.2 Multiple file upload
    @PostMapping("/api/upload/multi")
    public ResponseEntity<?> uploadFileMulti(
            @RequestParam("extraField") String extraField,
            @RequestParam("files") MultipartFile[] uploadfiles) {

        logger.debug("Multiple file upload!");

        // Get file name
        String uploadedFileName = Arrays.stream(uploadfiles).map(x -> x.getOriginalFilename())
                .filter(x -> !StringUtils.isEmpty(x)).collect(Collectors.joining(" , "));

        if (StringUtils.isEmpty(uploadedFileName)) {
            return new ResponseEntity("please select a file!", HttpStatus.OK);
        }

        try {

            saveUploadedFiles(Arrays.asList(uploadfiles));

        } catch (IOException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity("Successfully uploaded - "
                + uploadedFileName, HttpStatus.OK);

    }

    // 3.1.3 maps html form to a Model
    @PostMapping("/api/upload/multi/model")
    public ResponseEntity<?> multiUploadFileModel(@ModelAttribute UploadModel model) {

        logger.debug("Multiple file upload! With UploadModel");

        try {

            saveUploadedFiles(Arrays.asList(model.getFiles()));

        } catch (IOException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity("Successfully uploaded!", HttpStatus.OK);

    }

    //save file
    private void saveUploadedFiles(List<MultipartFile> files) throws IOException {

        try {
            for (MultipartFile file : files) {

                if (file.isEmpty()) {
                    continue; //next pls
                }
                
                UploadHistory upload;
                Thread.sleep(5000);
                upload=uploadHistoryService.findTop1ByOrderByIdDesc();
                while(upload==null)
                {
                    Thread.sleep(5000);
                    upload=uploadHistoryService.findTop1ByOrderByIdDesc();
                }
                System.out.println("upload history "+upload.getId());
                System.out.println("upload history ");
                
                byte[] bytes = file.getBytes();
                Date today = new Date();
                SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yy:HH:mm:SS");
                String date = DATE_FORMAT.format(today);
                System.out.println("==================");
                String tmp = file.getOriginalFilename().replace(".xlsx", "_") + date.replace(":", "_") + ".xlsx";
                Path path = Paths.get(UPLOADED_FOLDER + tmp);
                System.out.println(path);
                System.out.println("==================");
                Files.write(path, bytes);

                upload.setNamaFile(path.toString());
                
                uploadHistoryService.addUploadHistory(upload);
                
                FileInputStream excellFile1 = new FileInputStream(new File(path.toString()));
                XSSFWorkbook workbook1 = new XSSFWorkbook(excellFile1);
                XSSFSheet sheet1 = workbook1.getSheetAt(0);

                Integer compareCounter = compare.counter;
                while (compareCounter > 0) {
                    System.out.println("tungguuuuuuuuuuuuuu-------------------------------------------------- " + compare.counter);
                    Thread.sleep(5000);
                    compareCounter = compare.counter;
                }
                compare.Send(sheet1);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
