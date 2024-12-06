// A
// B C
// D E F
// G H I J 
// K L M N O

import java.util.Scanner;

public class CharacterPattern4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of Rows : ");
        int rows = sc.nextInt();
        char ch = 'A';
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }
}
