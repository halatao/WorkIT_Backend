package com.portal.WorkIT.Api;

import com.portal.WorkIT.Entity.Offer;
import com.portal.WorkIT.Entity.User;

public class ResponseDto {
    private long id;
    private String reply;
    private String cv;

    public ResponseDto(long id, String reply, String cv) {
        this.id = id;
        this.reply = reply;
        this.cv = cv;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }
}
