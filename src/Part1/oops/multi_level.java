package Part1.oops;

public class multi_level {
    public static void main(String[] args) {
        mul m = new mul();
        m.num1 = 4;
        m.num2 = 2;
        m.sum();
        m.sub();
        m.mulitply();
    }
}
class Add1{
    int num1, num2, result = 0;
    public void sum(){
        result = num1 + num2;
        System.out.println(result + " Add");
    }
}
class AddSub1 extends Add1{
    public void sub(){
        result = num1 - num2;
        System.out.println(result + " sub");
    }
}
class mul extends AddSub1{
    public void mulitply(){
        result = num1 * num2;
        System.out.println(result + " multi");
    }
}
