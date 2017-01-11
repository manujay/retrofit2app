package com.restapp.jayman.retrofit2app;

/**
 * Created by jayman on 1/11/2017.
 */

public class BaseModel {

    int status;
    String message;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
