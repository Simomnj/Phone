package com.zpx.phone.pojo;

import lombok.Data;

@Data
public class Token {

    private String access_token ="f06ba443-3a1d-48d8-9d8d-4fd101930d80";
    private String token_type = "bearer";
    private Integer expires_in = 3600;
    private String scope ="all";
    private String soft_scope ="latu,latupige,taotu";

}
