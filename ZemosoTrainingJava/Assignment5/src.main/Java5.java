package src.main;

/*Create main class, create object of first class and call both the methods 
to print the values. Create object of second class using static method and 
then call the other method to print the String.*/

public class Java5 {
    public static void main(String[] args) {
        //Data object
        Data d = new Data();
        d.num = 5;
        d.ch = 'a';
        d.printInt();
        d.printChar();
        d.printLocal();
        
        //Singleton object
        Singleton s = new Singleton();
        s = s.setString("abc");
        s.printString();
    }
}

/*Create class singleton containing a non static String member variable.0
Add a static method that takes String as parameter and initialize the member 
variable and then return object of that class. Add a non static method to print the String.*/

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

/* Create a class data containing an int and a char member 
variables that are not initialized, add a method to print 
these variables. Add another method in the same class with 
two local variables and print their values without initializing them.*/

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
        //System.out.println(i);
        //System.out.println(j);
        
        /*Variable i,j might not have been initialized.
        Default Constructor can only initialize data members
        It can't deal with local variables defined separately.*/
    }
}
