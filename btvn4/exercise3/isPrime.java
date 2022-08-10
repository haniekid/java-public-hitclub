package exercise3;

public class isPrime {
    public boolean isPrime(int n) {
        if(n < 2) return false;
        else {
            for(int i = 2; i*i <= n; i++) {
                if(n % i == 0) return false;
            }
        }
        return true;
    }

    public boolean isPrime(long n) {
        if(n < 2) return false;
        else {
            for(int i = 2; i*i <= n; i++) {
                if(n % i == 0) return false;
            }
        }
        return true;
    }

    public  boolean isPrime(float n) {
        return false;
    }

    public boolean isPrime(double n) {
        if(n < 2) return false;
        else {
            for(int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i == 0) return false;
            }
        }
        return true;
    }
}
