public class Superkeyword {
    public static void main(String[] args) {
        horse h = new horse();
        System.out.println(h.color);
    }
}

class Animal{
    String color;
    Animal( ){
        System.out.println("Animal class constructor is called ");
    }
}
class horse extends Animal{
    
    horse(){
       super.color = "Blue";
        System.out.println("Horse class constructor is called");
    }
}
