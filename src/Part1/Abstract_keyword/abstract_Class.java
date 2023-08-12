package Part1.Abstract_keyword;

public class abstract_Class {
    public static void main(String[] args) {
        MaheshPhone m = new mohan();
        m.cook();
        m.call();
        m.move();
        m.dance();
// mahesh want some features in its phone but the problem is =>
// he only to implement call method and rest other features don't know to add
    }
}

abstract class MaheshPhone{         // abstract class
    public void call(){          //    defining methods
        System.out.println("calling methods by Mahesh");
    }
    //    declaring methods -> using abstract
    public abstract void move();
    public abstract void dance();
    public abstract void cook();
}
abstract class Rohan extends MaheshPhone{    // abstract class
    public void move(){
        System.out.println("move added");
    }
    public void dance(){
        System.out.println("dance added");
    }

}
class mohan extends Rohan{    // => concrete class
    public void cook(){
        System.out.println("cooking is now added by mohan");
    }
}