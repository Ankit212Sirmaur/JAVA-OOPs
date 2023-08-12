package Part1.oops;

class check{
    int num;
    static int num2;
    public void show( int i , int j){
        num2 = i;
        System.out.println("static variable inside non-static method  " + num2);
        num = j;
        System.out.println("non-static variable inside non-static method  " + num);
    }
}
public class static_variable {
    public static void main(String[] args) {
        check obj = new check();
        obj.show(6,10);
    }
}
