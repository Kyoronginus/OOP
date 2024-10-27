import sesi6.*;

public class Main {
    
    public static void main(String[] args){
        Human studentA = new Human("Tohru",10);
        // studentA.setName("Tohru");
        System.out.println(studentA.getName());
        studentA.birthday();
        System.out.println(studentA.getAge());
        
    }
}
