package OOPS;

public class student {
    int age;
    String name;
    public void Intro_yourSelf(){
        System.out.println("My name is "+ this.name + " and age is "+this.age);
    }
    public void sayHey(String name){
        System.out.println(name + "  say hey " + this.name);
    }
}
