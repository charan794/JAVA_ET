package org.example.OOPS.Encapsulation;

interface MyRuleBook{
    void time();
    void Friends();
    void Study();
}
class Child implements MyRuleBook{
    public void time(){
        System.out.println("Child time");
    }
    public void Friends(){
        System.out.println("Child friends");
    }
    public void Study(){
        System.out.println("Child Study");
    }
}

public class InterfaceEx {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.time();
        ch.Friends();
        ch.Study();
    }
}
