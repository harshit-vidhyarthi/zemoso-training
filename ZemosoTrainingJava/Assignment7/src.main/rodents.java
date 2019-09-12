package src.main;

abstract class Rodent {
    public abstract void move();
    public abstract void eat();
}

class Mouse extends Rodent {
    Mouse() {
        System.out.println(this+".construct()");
    }
    public void move() {
        System.out.println(this+".move()");
    }
    public void eat() {
        System.out.println(this+".eat()");
    }
    public String toString(){
        return "Mouse";
    }
}

class Gerbil extends Rodent {
    Gerbil() {
        System.out.println(this+".construct()");
    }
    public void move() {
        System.out.println(this+".move()");
    }
    public void eat() {
        System.out.println(this+".eat()");
    }
    public String toString(){
        return "Gerbil";
    }
}

class Hamster extends Rodent {
    Hamster() {
        System.out.println(this+".construct()");
    }
    public void move() {
        System.out.println(this+".move()");
    }
    public void eat() {
        System.out.println(this+".eat()");
    }
    public String toString(){
        return "Hamster";
    }
}

public class rodents {
    public static void main(String[] args){
        Rodent[] arr = { new Mouse(), new Gerbil(), new Hamster() };
        for(Rodent r : arr){
            r.move();
            r.eat();
        }
    }
}