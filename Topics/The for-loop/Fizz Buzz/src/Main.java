import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 0;
        System.out.println(a);
        for(int i = a; i < b; i++){
            c = i;
            if(c % 3 == 0 && c % 5 == 0){
                System.out.println("FizzBuzz");
            } else if(c % 3 == 0){
                System.out.println("Fizz");
            } else if(c % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(c);
            }
        }
        System.out.println(b);
    }
}