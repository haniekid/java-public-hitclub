package buoi2;
import java.util.Scanner;
public class Exercise1 {
        public static float TBC(int a[], int n){
            int count1 = 0;
            int sum = 0;
            for(int i = 0; i < n; i++){
                if((a[i] % 2 != 0) && ((i + 1) % 2 == 0)){
                    sum += a[i];
                    count1++;
                }
            }
            float tbc = sum / count1;
            return tbc;
        }

        public static int Min(int a[], int n){
            int min = 0;
            int i;
            for(i = 0; i < n; i++){
                if(a[i] < a[min]){
                    min = i;
                }
            }
            return min;
        }

        public static boolean isPerfectSquare(double n){
            int i = (int) Math.sqrt(n);
            if(i*i != n){
                return false;
            }
            return true;
        }

        public static void displayPerfectSquare(int a[], int n){
            int count2 = 0;
            for(int i = 0; i < n; i++){
                if(isPerfectSquare(a[i])) {
                    System.out.println(a[i] + " ");
                    count2++;
                }
            }
            if(count2 == 0){
                System.out.println("Mang khong co so chinh phuong");
            }
        }

        public static boolean isPrime(int n){
            if(n == 2) return true;
            else if(n < 2)  return false;
            else {
                for(int i = 2; i * i <= n; i++){
                    if(n % i == 0){
                        return false;
                    }
                }
            }
            return true;
        }

        public static void displayPrime(int a[], int n){
            for(int i : a) {
                if(isPrime(a[i])){
                    System.out.println(a[i] + " ");
                }else{
                    System.out.println("Mang khong co so nguyen to");
                }
            }
        }

        public static void sortAsc(int a[], int n){
            for(int i = 0; i < n; i++){
                for(int j = i + 1; j < n; j++){
                    if(a[i] > a[j]){
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("n = ");
            int n = sc.nextInt();

            int a[] = new int[n];
            System.out.println("\nInput an array: ");
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            System.out.println("1. TBC so le o vi tri chan: " + TBC(a, n) );

            System.out.println("2. Vi tri so nho nhat trong mang: " + Min(a, n));

            System.out.println("3. Cac so chinh phuong trong mang: ");
            displayPerfectSquare(a, n);

            System.out.println("4. Cac so nguyen to trong mang: ");
            displayPrime(a, n);

            System.out.println("5. Mang sau khi sap xep tang dan: ");
            sortAsc(a, n);
            System.out.println("Array: ");
            for(int i = 0; i < n; i++){
                System.out.println(a[i] + " ");
            }
        }
    }
}
