package com.example.jenkins;

public class MessageSource {
    private String message="Hi from the message source.";

    public String getMessage() {
        return message;
    }
    public String thisIsABug(){
        String str=null;
        return str.toUpperCase();
    }

}
