package oopdemo;

import oopdemo.Student;
import oopdemo.Faculty;

public class MainClass {
    public static void main(String[] args){
        Student tohru = new Student(null, 0, null);
        Student kyoro = new Student(null, 0, null);
        Faculty dany = new Faculty(null, 0, null);
        
        Student.setAttend(1);
        //attendance tohru dan kyoro akan sama2 menjadi 1, karena static keyword
        
        tohru.setName("Tohru");
        dany.setAge(20);
        tohru.setNim("2702303330");
        dany.setCode("D7777");

        System.out.println(tohru.getName());
        System.out.println(tohru.nim);
    }
}
