import java.lang.reflect.Array;

public class Method {
    public static void main(String[] args) {
        sayHelloWorld();
        pertambahan(5,3);
        sayHello("Aimar","Rizki");

       var result = perkalian(2,3);
        System.out.println(result);
    }

    static void sayHelloWorld (){
        System.out.println("Hello World");
    }

    static void pertambahan (int a, int b){
        int value;
        value = a + b;
        System.out.println(value);
    }

    static void sayHello (String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }

    static int perkalian (int a, int b){
        var result = a*b;
        return result;
    }
}
