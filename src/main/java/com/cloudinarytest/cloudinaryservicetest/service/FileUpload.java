package com.cloudinarytest.cloudinaryservicetest.service;

import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileUpload {
    String uploadFile(MultipartFile multipartFile) throws IOException;
}
