package Inheritance.Has_a_rel;

// dog is a animal
public class Dog extends Animal{

    int num;

    Dog(){
        // System.out.println(""); error
        super(12,"dog","white");
        this.age = num;
        // super.age = num;  both are refering ot "age"
        this.eat();
        this.sound();

        System.out.println("I am a child class");
    }  

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        System.out.println(dog1);
    }
}
