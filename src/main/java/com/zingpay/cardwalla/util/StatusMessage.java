package com.zingpay.cardwalla.util;

import org.springframework.http.HttpStatus;


/**
 * @author Bilal Hassan on 23-Feb-21
 * @project cardwalla-microservice
 */


public enum StatusMessage {
    FAILURE(0,"FAILURE", HttpStatus.NOT_FOUND),
    SUCCESS(1,"SUCCESS", HttpStatus.OK),
    REQUEST_RECEIVED_FOR_SUBSCRIBE_BUNDLE(30001,"Your request to subscribe bundle is received successfully", HttpStatus.OK)
    ;

    private StatusMessage(int id, String description, HttpStatus statusCode) {
        this.id = id;
        this.description = description;
        this.statusCode = statusCode;
    }
    private int id;
    private String description;
    private HttpStatus statusCode;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public HttpStatus getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(HttpStatus statusCode) {
        this.statusCode = statusCode;
    }
}
