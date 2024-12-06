import java.util.Scanner;

public class functions2 {
    public static int sum(int a, int b) { //formal parameters
        int add = a + b;
        return add;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The value of A : ");
        int a = sc.nextInt();
        System.out.print("Enter The value of B : ");
        int b = sc.nextInt();
        System.out.println("Sum of A and B is : " + sum(a, b));//arguments or actual parameters
        sc.close();
    }
}
