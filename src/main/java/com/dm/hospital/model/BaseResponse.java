package com.dm.hospital.model;

import lombok.Data;

@Data
public class BaseResponse<T> {

    private T data;
    private String errorCode;

    public BaseResponse(T data, String errorCode) {
        this.data = data;
        this.errorCode = errorCode;
    }

    public BaseResponse(T data) {
        this.data = data;
    }

    public BaseResponse(String errorCode) {
        this.errorCode = errorCode;
    }
}
