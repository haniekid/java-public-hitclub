package buoi1;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();

        int sum = 0;
        for(int  i = 1; i <= n; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        System.out.println("SUM: " + sum);
    }
}
