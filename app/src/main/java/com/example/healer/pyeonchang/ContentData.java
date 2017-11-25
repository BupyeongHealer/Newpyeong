package com.example.healer.pyeonchang;

/**
 * Created by ssop6 on 2017-11-22.
 */

public class ContentData {
    private String userName;
    private String message;
    private String time;




    public ContentData(){}

    public ContentData(String userName, String message, String time){
        this.userName = userName;
        this.message = message;
        this.time = time;
    }

    public String getUserName(){
        return userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public String getTime(){
        return time;
    }

    public void setTime(String time){
        this.time = time;
    }
}
