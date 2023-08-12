package Part1.oops;

class abc{
    public abc(){
        System.out.println("default constructor called");
    }
    public abc(int i){
        System.out.println("para constructor called");
    }
    // two or more constructor are called with different parameters --> it is constructor overloading
}
public class second {
    public static void main(String[] args) {
            abc obj = new abc(4);
    }
}

