public class SubString {
    public static String printSubString(String Str, int si,int ed){
        String substr = "";
        for (int i = si;i<ed;i++){
            substr += Str.charAt(i);
        }
        return substr;
    }
    public static void main (String[]args){
        String str ="HelloWorld";
   String ans =  printSubString(str, 0,5);
     System.out.println(ans);

    }
}
