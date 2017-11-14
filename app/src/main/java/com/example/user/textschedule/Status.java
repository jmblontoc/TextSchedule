package com.example.user.textschedule;

import java.util.ArrayList;

/**
 * Created by Manlapaz on 11/14/2017.
 */

public class Status {

    public static final String TABLE_NAME = "Status";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_MESSAGE = "message";
    public static final String COLUMN_RECIPIENTS = "recipients";
    public static final String COLUMN_ACTIVE = "active";

    public long id;
    public String name;
    public String message;
    public ArrayList<String> recipients;
    public boolean active;

    public Status(String name, String message, ArrayList<String> recipients) {
        this.name = name;
        this.message = message;
        this.recipients = recipients;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ArrayList<String> getRecipients() {
        return recipients;
    }

    public void setRecipients(ArrayList<String> recipients) {
        this.recipients = recipients;
    }
}
