import java.util.Scanner;

public class factorial {
    public static int FindFactorial(int N) {
        int fact = N;
        if (N == 1 && N == 0) {
            return 1;
        }
        if (N < 0) {
            return -1;
        }
        for (int i = 1; i <  N; i++) {
            fact *= N-i;
        }
        return fact;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number to find Factorial : ");
        int Num = sc.nextInt();
        System.out.print("Factorial Of  Given  Number is : " + FindFactorial(Num));
        sc.close();
    }
}
