class Test00_11_21_32_42 {
    public static void main (String[] args) {
        int x = 0;
        int y = 0;
        while (x < 5) {
            y = x - y;
            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
    }
}