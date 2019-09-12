package src.main;

public class Java8 {
    public static void except(char a) throws NewExceptionA, NewExceptionB, NewExceptionC {
        switch(a){
            case 'A':throw new NewExceptionA("Type A");
            case 'B':throw new NewExceptionB("Type B");
            case 'C':throw new NewExceptionC("Type C");
        }
    }
    public static void main(String[] args) {
        try {
            //except('A');
            //except('B');
            except('C');
        } catch (NewExceptionA | NewExceptionB | NewExceptionC e) {
            e.printStackTrace(System.out);
        } finally {
            System.out.println("Running Finally!");
        }
    }
}

class NewExceptionA extends Exception {
    public NewExceptionA(String msg) {
        super(msg);
    }
    public String getMessage() {
        return "NewExceptionA "+super.getMessage();
    }
}

class NewExceptionB extends Exception {
    public NewExceptionB(String msg) {
        super(msg);
    }
    public String getMessage() {
        return "NewExceptionB "+super.getMessage();
    }
}

class NewExceptionC extends Exception {
    public NewExceptionC(String msg) {
        super(msg);
    }
    public String getMessage() {
        return "NewExceptionC "+super.getMessage();
    }
}
