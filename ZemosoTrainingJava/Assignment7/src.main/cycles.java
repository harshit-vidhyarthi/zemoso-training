package src.main;

class Cycle2 {
    public String toString(){
        return "Cycle";
    }
}

class Unicycle2 extends Cycle2 {
    public void balance() {
        System.out.println(this+".balance()");
    }
    public String toString(){
        return "Unicyle";
    }
}

class Bicycle2 extends Cycle2 {
    public void balance() {
        System.out.println(this+".balance()");
    }
    public String toString(){
        return "Bicycle";
    }
}

class Tricycle2 extends Cycle2 {
    public String toString(){
        return "Tricycle";
    }
}

public class cycles {
    public static void main(String[] args){
        Cycle2[] c = new Cycle2[3];
        c[0] = new Unicycle2();
        c[1] = new Bicycle2();
        c[2] = new Tricycle2();
        // Cycle does not have balance method.
        //!c[0].balance();
        //!c[1].balance();
        //!c[2].balance();
        ((Unicycle2)c[0]).balance();
        ((Bicycle2)c[1]).balance();
        // Tricycle does not have balance method.
        //!((Tricycle)c[2]).balance();
    }
}