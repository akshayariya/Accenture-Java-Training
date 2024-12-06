package Inheritance.Has_a_rel;

public class Animal {
    
    int age;
    String  color;
    String type;

    public void eat(){
        System.out.println("I am eating");
    }
    public void sound(){
        System.out.println("Making sound................");
    }

    Animal(int age,String color,String type){
        this.age=age;
        this.type=type;
        this.color=color;
        System.out.println("I am a parent class");
    }
    @Override
    public String toString() {
        return "Animal [age=" + age + ", color=" + color + ", type=" + type + "]";
    }

    
}


