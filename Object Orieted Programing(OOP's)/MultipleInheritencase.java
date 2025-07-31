public class MultipleInheritencase {
    public static void main(String[] args) {
        multipleinheritances m = new multipleinheritances();
        m.vegiterian();
        m.non_vegiterian();
    }
}

 interface Herbivore {
    void vegiterian();
 }
 interface Carnivore {
   void non_vegiterian();
 }

 class multipleinheritances implements Herbivore , Carnivore {
    public void vegiterian(){
        System.out.println("eats grass");
    }
    public  void non_vegiterian(){
        System.out.println("Eats Meat - just like :Luffy");
    }
 }