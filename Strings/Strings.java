import java.util.*;

class Strings {
    public static void PrintStr(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("output is -" + name);
        String Fullname = "Bhavesh";
        String Firstname = "Burad";
        String Lastname = Fullname + " " + Firstname;
        // System.out.println(Lastname);
        System.out.println(Lastname.length());
        PrintStr(Lastname);
        sc.close();
    }

}