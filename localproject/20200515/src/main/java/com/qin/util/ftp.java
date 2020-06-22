package com.qin.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component  // 控制层 @Controller  服务器层 @Service   数据访问层  @Repository 这3层之外
@PropertySource("classpath:project.properties") //指定加载文件的名称
@ConfigurationProperties(prefix = "ftp")
public class ftp {
    private String host;
    private int port;
    //ftp用户名和密码
    private String username;
    private String password;
    private String encoding;
    //连接超时时间设置
    private long connectTimeout;
    //ftpuser用户宿主目录
    private String basePath;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public long getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(long connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }
}
