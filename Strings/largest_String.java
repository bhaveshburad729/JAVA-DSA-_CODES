public class largest_String {

    public static void main(String[] args) {
        String fruit[] = { "Apple", "Banana", "Cherry", "Date", "Elderberry","z" };
        String largest = fruit[0];
        for (int i = 0; i < fruit.length; i++) {
            if (largest.compareTo(fruit[i]) < 0) {
                largest = fruit[i];
            }

        }
        System.out.println("Largest String is: " + largest);
    }
}
