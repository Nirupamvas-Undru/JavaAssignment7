package Question2;

abstract class Cycle{
    public abstract void balance();
};
class Unicycle extends Cycle{
    public void balance(){
        System.out.println("The cost of Unicycle start with RS 2500. ");
    }
};
class Bicycle extends Cycle{
    public void balance(){
        System.out.println("The cost of Bicycle start with Rs 3000. ");
    }
};
abstract  class Tricycle extends Cycle{
    //we are getting error because we are extending a abstract class, according to that
    //inherited class should implement all the abstract methods are make it self as abstract
};
public class MainClass{
    public static void main(String[] args) {
        Cycle[] obj = new Cycle[3];
        obj[0] = new Unicycle();
        obj[0].balance();
        obj[1] = new Bicycle();
        obj[1].balance();
        //obj[2] = new Tricycle();
        //obj[2].balance();
    }
}