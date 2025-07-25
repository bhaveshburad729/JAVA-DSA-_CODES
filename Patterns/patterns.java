class patterns {
    public static void Hollow_Pattern(int row, int col) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

    }

    public static void inverted_pyramid(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }

    public static void inverted_pyramind_no(int row) {

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }

    public static void floyds_Triangle(int row) {
        int chars = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(chars);
                chars++;
            }
            // for(int j = 1;j<= row -i ; j++){
            // System.out.print(" ");
            // }
            System.out.println(" ");
        }
    }

    public static void zero_one_Triangle(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println(" ");
        }
    }

    public static void Butterfly(int row) {
        // 1st half
        for (int i = 1; i <= row; i++) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 1; j <= 2 * (row - i); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        // 2nd half
        for (int i = row; i > 1; i--) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 1; j <= 2 * (row - i); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void Solid_Rohmbus(int row) {
        for (int i = 1; i <= row; i++) {
            // spaces
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= row; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void Hollow_Rohmbus(int row) {
        for (int i = 1; i <= row; i++) {
            // spaces
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= row; j++) {
                if (i == 1 || i == row || j == 1 || j == row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
    public static void Diamond(int row) {
        // upper half
        for (int i = 1; i <= row; i++) {
            // spaces
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= 2 *( i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for (int i = row ; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= 2 * (i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
    //     Hollow_Pattern(4, 5);
    //     inverted_pyramid(10);
    //     inverted_pyramind_no(5);
    //     floyds_Triangle(5);
    //     zero_one_Triangle(5);
    //      Butterfly(15);
    //     Solid_Rohmbus(5);
    //    Hollow_Rohmbus(5);
    //     Diamond(5);
    }
}