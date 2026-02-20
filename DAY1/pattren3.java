public class pattren3 {
    public static void main(String[] args) {
        int n = 15;  // number of columns (width of zig zag)

        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= n; col++) {
                if ((row + col) % 4 == 0 || (row == 2 && col % 2 == 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}