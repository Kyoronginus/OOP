package oopdemo;

public class Student extends Person{
    String nim;
    private static int attend;

    public Student(String name, int age, String nim) {
        super(name, age);
        this.nim = nim;
        Student.attend = 0;
    }

    //nilai attend akan sama untuk setiap object student
    public static int setAttend(int state){
        return Student.attend = state;
    }
    
    public void setNim(String nim){
        this.nim = nim;
    }

    public String getnim(){
        return this.nim;
    }
    
}
