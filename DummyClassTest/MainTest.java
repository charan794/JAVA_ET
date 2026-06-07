package org.example.DummyClassTest;

abstract  class vehicle{
    void testRide(){
        System.out.println("vehicle ride");
    }
    abstract void buy();
    abstract void price();
}
class car extends vehicle{
    void buy(){
        System.out.println("this is car ride");
    }
    void price(){
        System.out.println("this is car ride");
    }

}

public class MainTest {
    public static void main(String[] args) {
        car c=new car();
        c.buy();
    }
}
