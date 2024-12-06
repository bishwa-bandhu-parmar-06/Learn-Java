import java.util.Scanner;

public class Calculator {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Opernation Number : ");
        System.out.println("1 : for Addition");
        System.out.println("2 : for Substraction.");
        System.out.println("3 : for Multiplication.");
        System.out.println("4 : for Division.");
        int num = sc.nextInt();
        System.out.println("Enter The value of A : ");
        int a = sc.nextInt();
        System.out.println("Enter The value of B : ");
        int b = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("Sum of A and B is : " + (a + b));
                break;
            case 2:
                System.out.println("Substraction of A and B is : " + (a - b));
                break;
            case 3:
                System.out.println("Multiplication of A and B is : " + (a * b));
                break;
            case 4:
                System.out.println("Division of A and B is : " + (a / b));
                break;
            default:
                System.out.println("Invalid Keyword");
                break;
        }

        sc.close();
    }
}
