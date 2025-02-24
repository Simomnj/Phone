package com.zpx.phone.service;

import org.springframework.web.multipart.MultipartFile;

public interface TestService {
    String savePng(MultipartFile file);
}
