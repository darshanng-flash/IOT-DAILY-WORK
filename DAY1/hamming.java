class Main {
    public static void main(String[] args) {
        int n = 3;
        int count = 0;

        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1; // always shift
        }

        System.out.println(count);
    }
}