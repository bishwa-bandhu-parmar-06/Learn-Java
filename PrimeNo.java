import java.util.*;

public class PrimeNo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to chack it  is Prime Number or Not.");
        int Num = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= Num; i++) {
            if (Num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(Num + ": is Prime Number.");
        } else {
            System.out.println(Num + ": is not a Prime Number.");
        }
        sc.close();
    }
}