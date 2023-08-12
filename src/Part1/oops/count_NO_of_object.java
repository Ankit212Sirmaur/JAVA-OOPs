package Part1.oops;

class A{
    static int i = 0;
    A(){
        i++;
    }
    void show(){
        System.out.println(i);
    }
}
public class count_NO_of_object {
    public static void main(String[] args) {
        A obj1 = new A();
        A obj2 = new A();
        A obj3 = new A();
        A obj4 = new A();
        obj4.show();
    }
}
