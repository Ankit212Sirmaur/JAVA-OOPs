package Part1.oops;
//single level inheritance

public class inheritance {
    public static void main(String[] args) {
        AddSub obj = new AddSub();
        obj.num1 = 2;
        obj.num2 = 5;
        obj.sum();
        obj.sub();
    }
}
class Add{
    int num1, num2, result = 0;
    public void sum(){
        result = num1 + num2;
        System.out.println(result + " Add");
    }
}
class AddSub extends Add{
    public void sub(){
        result = num1 - num2;
        System.out.println(result + " sub");
    }
}
