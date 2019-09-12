package src.main;

interface Cycle {
    void balance();
}

interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {
    public void balance() {
        System.out.println("Unicycle.balance()");
    }
    public String toString(){
        return "Unicycle";
    }
}

class Bicycle implements Cycle {
    public void balance() {
        System.out.println("Bicycle.balance()");
    }
    public String toString(){
        return "Bicycle";
    }
}

class Tricycle implements Cycle {
    public void balance() {
        System.out.println("Tricycle.balance()");
    }
    public String toString(){
        return "Tricycle";
    }
}

class UnicycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Unicycle();
    }
}

class BicycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Bicycle();
    }
}

class TricycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Tricycle();
    }
}

public class factory {
    public static void createCycle(CycleFactory factory) {
        Cycle c = factory.getCycle();
        c.balance();
    }
    public static void main(String[] args){
        createCycle(new UnicycleFactory());
        createCycle(new BicycleFactory());
        createCycle(new TricycleFactory());
    }
}