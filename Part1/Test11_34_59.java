class Test11_34_59 {
    public static void main (String[] args) {
        int x = 0;
        int y = 0;
        while (x < 5) {
            x = x + 1;
            y = y + x;
            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
    }
}