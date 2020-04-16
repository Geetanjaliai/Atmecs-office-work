package com.task.odapi.util;

public enum OD_API_CONSTANTS {
    LOG_MODULE_NAME("od-api-task");
    private String value;

    OD_API_CONSTANTS(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
