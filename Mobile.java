package Inheritance.Has_a_rel;

class SmartPhone {

    String model;
    int ram;
    int memmory;
    String scrrenType;

    public void calling(String model) {
        System.out.println("Calling with "+model);
    }

    public void multiMedia(String model) {
        System.out.println("Audio/Video is playing in "+model);
    }

    public void gaming(String model) {
        System.out.println("Get ready to play the action in "+model);
    }

    SmartPhone(String model, int ram, int memmory, String scrrenType) {
        this.model = model;
        this.ram = ram;
        this.memmory = memmory;
        this.scrrenType = scrrenType;
    }

    public void displaySmartphone() {
        System.out.println("Model: " + model);
        System.out.println("RAM size: " + ram);
        System.out.println("Meemory Capacity: " + memmory);
        System.out.println("Screen Type: " + scrrenType);

    }
}

class Samsung extends SmartPhone {
    String os;

    public Samsung(String model, int ram, int memmory, String scrrenType, String os) {
        super(model, ram, memmory, scrrenType);
        System.out.println("Welcome to the Samsung 'Do What You Cannot'");
        this.os = os;
        this.calling(model);
        this.gaming(model);
        this.multiMedia(model);
        displaySmartphone();
        System.out.println("-----------------------------");

    }

}

class Apple extends SmartPhone {
    String os;
    Samsung smg;  // refrence to the samsung
    public Apple(String model,int ram, int memmory,String screenType,String os,Samsung smg){
        super(model, ram, memmory, screenType);
        System.out.println("Welcome to the Apple 'Think Different' ");
        this.os = os;
        this.calling(model);
        this.gaming(model);
        this.multiMedia(model);
        displaySmartphone();
        System.out.println("-----------------------------");


    }
 

}

public class Mobile {

    public static void main(String[] args) {
        Samsung phone1 = new Samsung("S24",8,512,"OLED","Android");
        new Apple("iPhone15", 8, 256,phone1.scrrenType, "iOS",phone1);
        new Apple("iPhone14", 6, 512,phone1.scrrenType, "iOS12",phone1);
    }

}
