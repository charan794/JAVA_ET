package org.example.Day05;

class MyAdd{
    public int a;
    public int b;
    public MyAdd(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public void add(){
        System.out.println((this.a+this.b));
    }
    public void sub(){
        System.out.println((this.a+-this.b));
    }
}
public class BasicDump {
    public static void main(String[] args){
        MyAdd add=new MyAdd(10,20);
        add.add();
        add.sub();
    }
}