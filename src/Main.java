import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введіть n і m:");

        double n= console.nextDouble();
        double m = console.nextDouble();

        double div1 = (n+1)/(m+2);
        double div2 = 5/(n-m);
        double sum = div1 + div2;
        double sum2 = Math.pow(sum, 2)*n*m;

        System.out.println("Результат: " +sum2);
    }
    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть n:");

        int n = scanner.nextInt();
        if (n>300)
            n=300;
        int nums[] = new int[n];

    }
}
