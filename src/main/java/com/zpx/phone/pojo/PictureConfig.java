package com.zpx.phone.pojo;

import lombok.Data;

@Data
public class PictureConfig {
    private String configName;  // 配置名称，当前为null
    private String fileName;    // 文件名称，例如 "盾牌小胖妞.ini"
    private String fileAddr;    // 文件地址，例如 "http://192.168.1.220:9000/intelligent-platform/production/config/20240927/1839611171922370562.ini"

}
