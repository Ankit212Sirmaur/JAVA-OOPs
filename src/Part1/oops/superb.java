package Part1.oops;

class Parent1 extends Object{
    public Parent1(){
        System.out.println("default of A");
    }
    public Parent1(int i){
        System.out.println("parametrized of A");
    }
}
class child1 extends Parent1{
    public child1(){
//         super();  => calling by default const A
        System.out.println("default of B");
    }
    public child1(int i){
        super(i);
        System.out.println("parametrized of B");
    }
}

public class superb {
    public static void main(String[] args) {
//        child1 c = new child1(); // =>  default of A
                                // => default of B
        child1 c2 = new child1(9);  //default of A
                                        //parametrized of B
        // after calling super for parametrized

//        parametrized of A
//        parametrized of B

    }
}

