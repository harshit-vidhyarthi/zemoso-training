package src.main;

public class java5 {
    public static void main(String[] args) {
        Data d = new Data();
        d.num = 5;
        d.ch = 'a';
        d.printInt();
        d.printChar();
        d.printLocal();
        Singleton s = new Singleton();
        s = s.setString("abc");
        s.printString();
    }
}

class Singleton {
    private String s;
    public static Singleton setString(String st) {
        Singleton str = new Singleton();
        str.s = st;
        return str;
    }
    public void printString(){
        System.out.println(s);
    }
}

class Data {
    public int num;
    public char ch;
    public void printInt() {
        System.out.println(num);
    }
    public void printChar() {
        System.out.println(ch);
    }
    public void printLocal() {
        int i;
        char j;
        // Variable i,j might not have been initialized.
        // Default Constructor can only initialize data members
        // It can't deal with local variables defined separately.
        //System.out.println(i);
        //System.out.println(j);
    }
}