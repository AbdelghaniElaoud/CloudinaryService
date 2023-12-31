package com.cloudinarytest.cloudinaryservicetest.controller;


import com.cloudinarytest.cloudinaryservicetest.service.FileUpload;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@RequiredArgsConstructor
public class UploadController {
    private final FileUpload fileUpload;

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("image") MultipartFile multipartFile) throws IOException {
        String imageURL = fileUpload.uploadFile(multipartFile);

        return new ResponseEntity<>("File uploaded successfully", HttpStatus.OK);
    }
}
