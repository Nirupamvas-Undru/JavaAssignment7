package Question3;
import java.util.Scanner;
interface First{
    public void getF();
    public void dispF();
}
interface Second{
    public void getS();
    public void dispS();
}
interface Third{
    public void getT();
    public void dispT();

}
interface Fourth extends First, Second, Third{
    public void getD();

}
class FirstClass implements Fourth{
    public void getF(){
        System.out.println("interface First get method");
    }
    public void dispF(){
        System.out.println("interface First disp method");
    }
    public void getS(){
        System.out.println("interface Second get method");
    }
    public void dispS(){
        System.out.println("interface Second disp method");
    }
    public void getT(){
        System.out.println("interface Third get method");
    }
    public void dispT(){
        System.out.println("interface Third disp method");
    }
    public void getD(){
        System.out.println("interface Fourth get mehtod ");
    }
};

class MainClass {

    static void method1(interfcaec i) {
    };
    static void method2(Interface2 i) {
    };
    static void method3(Interface3 i) {
    };
    static void method4(Newinterface i) {
    };

    public static void main(String[] args) {
        FirstClass s = new FirstClass();
        String st;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of the interface");
        st = in.nextLine();
        s.method1(st);
        s.method2(st);
        s.method3(st);
        s.method4(st);

    }
}
