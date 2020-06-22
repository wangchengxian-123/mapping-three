package com.qin.util;



import com.alibaba.druid.util.StringUtils;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

import java.io.IOException;
import java.io.InputStream;

public class FtpUtil {
    /**
     * 文件上传的方法
     * @param host 主机名
     * @param port 端口号
     * @param userName 用户名
     * @param passWord 密码
     * @param basePath 根路径
     * @param filePath 自定义路径
     * @param fileName 文件名字
     * @param inputStream 文件流
     * @return
     */
    public static boolean uploadFile(String host, int port, String userName, String passWord, String basePath, String filePath, String fileName, InputStream inputStream) throws IOException {
        FTPClient ftpClient=new FTPClient();
        //1.连接ftp服务器
        ftpClient.connect(host,port);
        //2.登陆服务器
        ftpClient.login(userName,passWord);
        //3.判断是否登陆成功
        int replyCode = ftpClient.getReplyCode();
        if(!FTPReply.isPositiveCompletion(replyCode)){
            //关闭连接
            ftpClient.disconnect();
            return false; //返回false
        }
        //4.拼装上传目录并且判断目录是否存在，如果不存在创建目录
        //   basePath= /home/ftp/  filePath=news/images/
        //    /home/ftp/   goods/images/
        String storePath=basePath+filePath;
        //如果切换不成功，说明路径不存在  判断目录是否存在
        if(!ftpClient.changeWorkingDirectory(storePath)){
            //bashPaht 一定存在
            // filePath可能不存在   filePathArray  [news,images,""]
            String[] filePathArray = filePath.split("/");
            String tempPath = basePath; ///home/ftp/
            for (String dir : filePathArray) {
                if (StringUtils.isEmpty(dir)) {
                    continue;
                }
                tempPath += "/" + dir; //第一次循环 /home/ftp/news  第二次循环 /home/ftp/news/images  ...
                if (!ftpClient.changeWorkingDirectory(tempPath)) {
                    //判断创建不成功
                    if (!ftpClient.makeDirectory(tempPath)) {
                        return false;
                    }
                }
            }
        }
        //5.设置上传方式
        ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
        //6 上传
        if (!ftpClient.storeFile(fileName, inputStream))
            return false;
        //7 关闭打开的资源
        //关闭流
        inputStream.close();
        //关闭连接
        ftpClient.disconnect();
        return true;
    }
}
