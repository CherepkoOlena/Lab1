import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("Введіть номер завдання: ");
        int task = console.nextInt();
        if (task == 1)
            task1();
        else if (task == 2)
            task2();
        else if (task == 3) {
            task3();
        }
        else if (task == 4){
            task4();
        }
    }

    public static void task1() {
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
        for (int i = 0; i < n; ++i) {
            System.out.print("a["+i+"]= ");
            nums[i]=scanner.nextInt();
        }

        int sizes[] = new int[n];
        int starts[] = new int[n];
        int sequenceI = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1]-1)  {
                sizes[sequenceI] += 1;
                if(starts[sequenceI] == 0)
                    starts[sequenceI] = i;
            } else sequenceI++;
        }

        int maxSize = 0;
        int maxI = 0;
        for (int i = 0; i < sizes.length; i++) {
            if(sizes[i] > maxSize) {
                maxSize = sizes[i];
                maxI = i;
            }
        }
        for (int i = starts[maxI]; i < starts[maxI]+sizes[maxI]+1 ; i++) {
            System.out.println(nums[i]);
        }

    }
    public static void task3(){
        Scanner console = new Scanner(System.in);
        System.out.println("Введіть n:");

        int n = console.nextInt();
        if (n>20)
            n=20;
        int nums[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Введіть елемент матриці[%d, %d]: ", i, j);
                nums[i][j]=console.nextInt();
                System.out.println();
            }
        }

        int x[] = new int[n];
        for (int i = 0; i < n; i++) {
            int max = nums[i][0];
            int min = nums[i][0];

            for (int j = 0; j < n; j++) {
                if (max < nums[i][j])
                    max = nums[i][j];
                if (min > nums[i][j])
                    min = nums[i][j];
            }

            x[i] = (Math.abs(max) + Math.abs(min)) /2;
        }

        System.out.printf("Результат: %s", Arrays.toString(x));
    }

    public static void task4(){
        Scanner console = new Scanner(System.in);
        System.out.println("Введіть текст: ");

        String text = console.nextLine();
        String[] words = text.split("[ ,.;:-?!]+");

        int max = 0;
        for (int i = 0; i < words.length; i++) {
            if (max < words[i].length())
                max = words[i].length();

        }

        String result = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() != max)
                result += words[i] + " ";
        }

        System.out.println(result);
    }

}
