public class String_Compresion {
    public static String Compress(String str) {
        String newstr = "";
        Integer count = 1;
        for (int i = 0; i < str.length(); i++) {
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newstr += str.charAt(i);
            if (count > 1) {
                newstr += count.toString();
            }
            count = 1; // Reset count for the next character

        }
        return newstr;
    }

    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(Compress(str));
    }
}
