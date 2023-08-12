package Part1.oops;

public class creation_Inheritance {
    public static void main(String[] args) {
//        child c1 = new child(2);
        parent p1 = new child(5);
    }
}
class parent{
    parent(){
        System.out.println("Default const of parent");
    }
    parent(int i){
        System.out.println("para const of parent");
    }
}
class child extends parent{
    child(){
        System.out.println("Default const of child");
    }
    child(int y){
        System.out.println("para const of child");
    }
}
