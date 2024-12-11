package com.zpx.phone.pojo;

import lombok.Data;

@Data
public class UserInfo {
    private Integer id = 70029;
    private Integer companyId = 10187;
    private String username = "zpx123";
    private String name = "123";
    private String accessToken = "06ba443-3a1d-48d8-9d8d-4fd101930d80";
    private String fullAccessToken = "Bearer f06ba443-3a1d-48d8-9d8d-4fd101930d80";
    private String userType = "FACTORY";
    private String tenantParentId;
    private String projectVersion = "1";
    private String scope;
}
