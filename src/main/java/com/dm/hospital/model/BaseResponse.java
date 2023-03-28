package com.dm.hospital.model;

public class BaseResponse<T> {

    private T data;
    private String errorCode;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String toString() {
        return "BaseResponse{" +
                "data=" + data +
                ", errorCode='" + errorCode + '\'' +
                '}';
    }

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
