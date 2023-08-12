package Part1.Abstract_keyword;

public class another_abstract {
    public static void main(String[] args) {
    iphone ip = new iphone();
    samsung sm = new samsung();
    showConfig(sm);
    }
    public static void showConfig(phone sm){
//        => passing object of superclass and reference of subclass
        sm.show();
    }
}
abstract class phone{
    public abstract void show();
//    in abstract class we have normal methods also , it is not necessary to do abstract method
//    but for abstract method necessary to make abstract class

}
class iphone extends phone{
    public void show(){
        System.out.println(" 2,  ios" );
    }
}
class samsung extends phone{
    public void show(){
        System.out.println("4 , loolipop");
    }
}