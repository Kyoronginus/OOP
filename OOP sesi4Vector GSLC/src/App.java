import java.util.Vector;


public class App {
    public static void main(String[] args) throws Exception {

        Vector<String> x = new Vector<String>(); //create a vector object
        x.add("Ohio");
        x.add("Final");
        x.add("Boss");
        System.out.print(x); // [Ohio,Final,Boss]
        System.out.println(x.size());//3
        
        //insert an element
        x.add(1,"Skibidi");
        System.out.print(x); // [Ohio,Skibidi,Final,Boss]
        System.out.println(x.size());//4
        //retrieve an element using index
        System.out.println(x.get(0)); // Ohio

        //remove an element using index
        x.remove(2);
        System.out.println(x); // [Ohio,Skibidi,Boss]

        //remove an element using it's name
        x.remove("Skibidi");
        System.out.println(x); // [Ohio,Boss]
        System.out.println(x.size());//2



    }
}
