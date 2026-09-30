interface RemoteControl {
    void turnOn();
    void turnOff();
}

abstract class Appliance {
    abstract void displayAppliance();
}

class SmartTV extends Appliance implements RemoteControl {

    @Override
    public void displayAppliance() {
        System.out.println("Appliance: Smart TV");
    }

    @Override
    public void turnOn() {
        System.out.println("Smart TV is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart TV is turned off");
    }
}

public class Main {
    public static void main(String[] args) {

        Appliance a = new SmartTV();

        // Dynamic method dispatch
        a.displayAppliance();

        // Accessing interface methods
        RemoteControl r = (SmartTV) a;

        r.turnOn();
        r.turnOff();
    }
}