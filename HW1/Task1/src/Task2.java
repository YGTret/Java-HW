class prnum {
    public static void main(String[] args) {
        int i, j, flag;
        System.out.println("Prime numbers between 1 and 1000 are:");
        for (i = 2; i <= 1000; i++) {
            flag = 0;
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                System.out.println(i);
        }
    }
}