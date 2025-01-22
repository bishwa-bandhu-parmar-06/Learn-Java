import java.util.*;

public class DecimalToBinary{
    public static int DeciToBin(int num){
        int bin = 0;
        int power = 0;
        // if(num == 0){
        //     return bin;
        // }
        while(num > 0){
            
            int rem = num % 2;
            bin = bin +  (rem * (int) Math.pow(10, power) );
            power++;
            num /= 2;
        }
        return bin;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The decimal Number : ");
        int num = sc.nextInt();
        int dec_num = DeciToBin(num);
        System.out.println("Binary Number Of Given Decimal Is : " +dec_num);
        sc.close();
    }
}