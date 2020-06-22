package com.qin.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

public interface FileHandleService {
    /**
     *
     * @param file 上传的文件
     * @param savePath 保存的路径
     * @return
     */
    Map upload(MultipartFile file, String savePath) throws IOException;
}
