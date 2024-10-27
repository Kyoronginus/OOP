package oopdemo;

import oopdemo.Person;

public class Faculty extends Person{
    String code;

    public Faculty(String name,int age, String code){
        super(name, age);
        this.code = code;
    }

    public void setCode(String code){
        this.code = code;
    }

    public String getCode(){
        return this.code;
    }
}
