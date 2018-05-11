package com.letcome.model;

/**
 * Created by TESZ-RD-07 on 2018/5/11.
 */
public class Greeting {
    private  final long id;
    private  final  String content;

    public  Greeting(long id, String content){
        this.id = id;
        this.content = content;
    }

    public long getId(){
        return  id;
    }

    public String getContent(){
        return  content;
    }
}
