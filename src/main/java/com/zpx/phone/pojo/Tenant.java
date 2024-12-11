package com.zpx.phone.pojo;

import lombok.Data;

@Data
public class Tenant {
    private String type;
    private String id;
    private String companyTenantId;
    private String tenantId;
    private String factoryId;
    private String tenantUsername;
    private String tenantName;
    private String tenantNickName;
    private String tenantCode;
    private String price;
    private String frozenPrice;
    private String agencyPrice;
    private int bindState;
    private String invitee;
    private String invitationCode;
    private String bindTime;
    private String description;
    private boolean directDeduction;
    private String tenantType;
    private String tenantLevel;
    private int uploadPicture;
    private String creditAmount;
}
