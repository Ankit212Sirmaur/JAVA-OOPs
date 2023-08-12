package Part1.oops;

//import java.util.*;
class a{    // super class
    public void show(){
        System.out.println("A class");
    }
}
class  b extends a{  // parent class
    public void show(){  // --> form this method we want to call parent method
        super.show();

        System.out.println("B class");
    }
}
 class objectSuper {
    public static void main(String[] args) {
        b obj = new b();
        obj.show();
    }
}
