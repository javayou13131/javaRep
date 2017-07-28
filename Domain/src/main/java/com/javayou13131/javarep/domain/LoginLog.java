package com.javayou13131.javarep.domain;

import java.util.Date;

public class LoginLog {
    private Integer loginLogId;

    private Integer userId;

    private String ip;

    private Date loginDatetime;

    public LoginLog(Integer loginLogId, Integer userId, String ip, Date loginDatetime) {
        this.loginLogId = loginLogId;
        this.userId = userId;
        this.ip = ip;
        this.loginDatetime = loginDatetime;
    }

    public LoginLog() {
        super();
    }

    public Integer getLoginLogId() {
        return loginLogId;
    }

    public void setLoginLogId(Integer loginLogId) {
        this.loginLogId = loginLogId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Date getLoginDatetime() {
        return loginDatetime;
    }

    public void setLoginDatetime(Date loginDatetime) {
        this.loginDatetime = loginDatetime;
    }
}