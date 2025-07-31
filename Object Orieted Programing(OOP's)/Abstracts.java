public class Abstracts {
    public static void main(String[] args) {
        Dogss d =new Dogss();
        d.eat();
        d.walk();
        
    }

}
abstract class Animalss{
    void eat (){
        System.out.println("ANimals eats");
    }
    abstract void  walk ();
}
 class Dogss extends Animalss {
        void walk (){
            System.out.println("it walks on 4 legs ");
        }
    
 }