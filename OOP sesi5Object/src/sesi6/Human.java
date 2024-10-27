package sesi6;

public class Human {

    int age = 18;
    String name;
    
    //if want to create specific class constructor
    //no data type
    //class constructor is used when you want to initialize something in 
    public Human(String name, int age){
        //"this" is used as a identifier of the class itself
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void birthday(){
        this.age += 1;
    }

    public String getAge(){
        String toString = this.name + " is " + this.age;
        return toString;
    }

    public static void main(String[] args){
        System.out.println("Hello, World!");

        // Class :
        //Unique identity
        //State - data field, properties
        //Behaviour/method - set of method/function

        // new sebetulnya digunakan untuk membuat sebuat object dari class.


        //ClassName identifier = new ClassConstructor()





    }
}
