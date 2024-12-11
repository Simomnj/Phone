package com.zpx.phone.pojo;


import lombok.Data;

@Data
public class UserLogin {
    private String username;
    private String password;
    private String grant_type;
    private String client_id;
    private String client_secret;
    private String client_key;

}
