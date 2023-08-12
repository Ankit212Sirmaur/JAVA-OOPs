package Part1.oops;

class Abc{
    int i;
    public void show(){
        System.out.println("it is called by object");
    }
    public static void print(){
        System.out.println("it is called by class");
    }
}
public class staticDemo {
    public static void main(String[] args) {
        Abc oj = new Abc();
        oj.show();
        Abc.print();
    }
}
