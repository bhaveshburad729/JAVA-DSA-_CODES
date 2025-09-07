  import java.util.*;
class Conditions{
    // AGE CONDITION ***********************************

    // public static void main(String[] args){

    //     Scanner sc = new Scanner (System.in);
    //     int a = sc.nextInt();
    //     if (a >= 18){
    //         System.out.println("Congrats You are a Adult AT age - " + a);

    //     }
    //     else{
    //         System.out.println("You are not an Adult at age - " + a);
    //     }
    // }
    // ODD EVEN CONDITION ********************************** 

    // public static void main(String[] args){
        
    //     Scanner sc = new Scanner (System.in);
    //     System.out.println("Enetr First no - ");
    //     int a = sc.nextInt();
    //     System.out.println("Enetr Second no - ");
    //     int b = sc.nextInt();
    //     if (a == b ){
    //         System.out.println("Both no are equal - " + a);
    //     }
    //     else if (a > b){
    //         System.out.println("First no is greater than second no - " + a);
    //     }
    //     else{
    //         System.out.println("Second no is greater than first no - " + b);
    //     }

    // }
    // LANGUAGE CONDITION **********************************

//     public static void main (String [] args ){
//         Scanner sc = new Scanner (System.in);
//         System.out.println("Enetr the no from 1 to 3 - ");
//         int a = sc.nextInt();
//         if ( a == 1 ){
//             System.out.println("Hello");
//         }
//         else if ( a == 2 ){
// System.out.println("Namste");
//         }
//         else if( a == 3 ){
//             System.out.println("Bonjour");
//         }
//         else {
//             System.out.println("Invalid Input");
//         }
//     }
// Switch Case Condition **********************************

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the no from 1 to 3 - ");
    //     int a = sc.nextInt();
    //     switch (a) {
    //         case 1:
    //             System.out.println("Hello");
    //             break;
    //         case 2:
    //             System.out.println("Namaste");
    //             break;
    //         case 3:
    //             System.out.println("Bonjour");
    //             break;
    //         default:
    //             System.out.println("Invalid Input");
    //     }
    // }
    // calculator Condition **********************************

    public static void main (String args [] ){
        Scanner sc = new Scanner (System.in);
        System.out.println("Eneter the first no - ");
        int a = sc.nextInt();
        System.out.println("Eneter the second no - ");  
        int b = sc.nextInt();
        System.out.println("Eneter the operator choice  - ");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");
            System.out.println("Enter the operator - ");
        int op = sc.nextInt() ;
        switch(op) {
            case 1:
                System.out.println("The sum is - " + (a + b));
                break;
            case 2:
                System.out.println("The difference is - " + (a - b));       
                break;
            case 3 : 
                System.out.println("The product is - " + (a * b));
                break;
            case 4  :
                if (b != 0) {
                    System.out.println("The division is - " + (a / b));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator");      
        }
        sc.close();
    }
}