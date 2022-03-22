package Question5;

class FirstOuter{
    FirstOuter(){
        System.out.println("FirstOuter class constructor is running.");
    }
    class Firstinner{
        Firstinner( int a,int b){
            System.out.println("The value of a is " +a);
            System.out.println("FirstInner class constructor is running.");
        }
    }
};

class SecondOuter extends FirstOuter{
    SecondOuter(){
        System.out.println("SecondOuter class constructor is running.");
    }
    class SecondInner{
        SecondInner(int a){
            System.out.println("The value of a is " +a);
            System.out.println("SecondInner class constructor is running.");
        }
    }
};

public class MainClass{
    public static void main(String[] args){
        SecondOuter.SecondInner obj = new SecondOuter().new SecondInner(5);
    }

}