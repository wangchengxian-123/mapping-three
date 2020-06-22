package com.qin.service.impl;

import com.qin.service.FileHandleService;
import com.qin.util.FtpUtil;
import com.qin.util.ftp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
@Service
public class FileHandleServiceImpl implements FileHandleService {
    @Autowired
    private com.qin.util.ftp ftp;
    @Override
    public Map upload(MultipartFile file, String savePath) throws IOException {
//获取原文件名称   a.b.nginx.png     aaafdf.dfd.doc  ....
        String originalFilename = file.getOriginalFilename();
        //获取后缀  "nginx.png".substring(开始位置)    lastIndexOf(".")  最后一个.的位置开始
        String suffix =   originalFilename.substring(originalFilename.lastIndexOf("."));//.png  .doc  ....
        // 根据源文件后缀拼装新文件名称    UUID.randomUUID() 36位的字符串
        String fileName= UUID.randomUUID()+suffix;
        if(FtpUtil.uploadFile(ftp.getHost(),ftp.getPort(),ftp.getUsername(),ftp.getPassword(),ftp.getBasePath(),savePath,fileName,file.getInputStream())){
            Map returnMap=new HashMap();
            returnMap.put("originalFilename",originalFilename);
            returnMap.put("filePath","http://"+ftp.getHost()+"/"+savePath+"/"+fileName);
            return returnMap;
        }
        return null;
    }
}
