package com.mycompany.propertymanagement.exception;

import lombok.Getter;
import lombok.Setter;

public class ErrorModel {
    @Getter
    @Setter
    private String code;
    private  String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
