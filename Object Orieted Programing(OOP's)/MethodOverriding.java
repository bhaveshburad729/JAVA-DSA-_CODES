public class MethodOverriding {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();// yaha pe jo class ko call kiya ja raha hai woh hi class ka output aayega 
        //  this is method overloading ;;;;;
    }
}
class Animal {
    void eat (){
        System.out.println("Animals eats");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("Dog eats ");
    }
}
