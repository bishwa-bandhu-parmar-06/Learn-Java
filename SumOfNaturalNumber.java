import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The value of N : ");
        int Num = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < Num; i++) {
            sum = Num * (Num + 1) / 2;
        }
        System.out.print("The sum of" + Num + "Natural Number is : " + sum);
        sc.close();
    }
}
