import java.util.Arrays;

public class Que4 {
    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";

        // Convert both strings to lowercase to make the comparison case-insensitive
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // First check: if the lengths are different, they can't be anagrams
        if (str1.length() == str2.length()) {

            // Convert both strings to character arrays
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();
            
            // Sort the character arrays
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            // Compare the sorted arrays
            boolean result = Arrays.equals(str1charArray, str2charArray);

            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
            }

        } else {
            // If lengths differ, strings can't be anagrams
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
        }
    }
}
