import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Float c;
        // Float a = 3.14f;
        // Float b = new Float(1.5f);
        // c = a *b;
        // System.out.println(c);
        // System.out.println(c.equals(b));
        // System.out.println(c.doubleValue());

        // String a = "5.78";
        // int b = 99;
        // Double c,d;
        // c = Double.parseDouble(a); // string to Double
        // d = Double.valueOf(b);
        // System.out.println(c + d);

        // String msg = new String("Welcome to Java");
        // String message = "Welcome to Binus";
        // System.out.println(msg);
        // System.out.println(message);
        // System.out.println(msg == message); //sebaiknya jangan pake operators, karena agak buggy
        // System.out.println(msg.equals(message));
        // System.out.println(msg.compareTo(message));


        Scanner input = new Scanner(System.in);
        String[] code = new String[3];
        String inputText = "";
        System.out.println("Enter your dataa:");
        inputText = input.next();
        code = inputText.split(";");
        for(String code1 : code){
            System.out.println(code1);
        }

        // Scanner input = new Scanner(System.in);
        // int a = 8;
        // int b = input.nextInt();
        // int c = a/b;
        // System.out.println(c);


    }
}
