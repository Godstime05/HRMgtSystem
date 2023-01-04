package com.godstime.HRMgtSystem.base.utilities.results;

public class Result {
    private final boolean success;
    private String message;
    public boolean isSuccess() {
        return success;
    }

    public Result(final boolean success){
        this.success = success;
    }
    public Result(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
