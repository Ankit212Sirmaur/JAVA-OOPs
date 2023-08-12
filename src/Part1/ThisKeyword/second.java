package Part1.ThisKeyword;

public class second {
    public static void main(String[] args) {
        A1 obj = new A1(9);
        obj.show();
    }
}
class A1{
    private int x;
    public A1(int x){
        this.x = x;
    }
    public void show(){
        System.out.println(x);
    }
}