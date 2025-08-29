public class binaryString {
    public static void binaryStrings(int n , int lastplace , String str){
        if(n == 0){
          
            System.out.println(str);
            return;
        }
        if(lastplace == 0){
            binaryStrings(n-1,0, str+"0");
            binaryStrings(n-1,1, str+"1");
        } else{
            binaryStrings(n-1,0, str+"0");
        }
    }
    public static void main (String[]args){
        binaryStrings(3, 0, "");
    }
}
