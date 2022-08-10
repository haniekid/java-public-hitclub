package exercise3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        isPrime a = new isPrime();

        System.out.println(a.isPrime(7));
        System.out.println(a.isPrime(100000));
        System.out.println(a.isPrime(2.3));
        System.out.println(a.isPrime(4.5));

    }
}
