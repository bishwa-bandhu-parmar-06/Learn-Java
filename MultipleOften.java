import java.util.Scanner;

public class MultipleOften {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            int num = sc.nextInt();
            if (num % 10 == 0) {
                System.out.println("Given Number is :" + num);
                break;
            }

        } while (true);
        sc.close();
    }
}
