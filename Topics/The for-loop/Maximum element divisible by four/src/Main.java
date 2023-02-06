import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = 0;
        int c = 0;
        if (scanner.hasNext()) {
            for (int i = 0; i < a; i++) {
                c = scanner.nextInt();
                if (c % 4 == 0 && c > b) {
                    b = c;
                }
            }
        }
        System.out.println(b);
    }
}
