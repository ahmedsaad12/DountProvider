package com.apps.dount_provider.model;

import java.io.Serializable;

public class StatusResponse implements Serializable {
    protected int code;
    protected String msg;

    public int getStatus() {
        return code;
    }

    public String getMessage() {
        return msg;
    }
}
