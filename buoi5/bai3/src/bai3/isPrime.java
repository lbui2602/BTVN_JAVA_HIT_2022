package bai3;

public class isPrime {

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isPrime(long n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isPrime(float n) {
        if (Math.ceil(n) == Math.floor(n)) {
            return false;
        }else if (n < 2) {
            return false;
        }else {
            for (int i = 2; i <n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isPrime(double n) {
        if (Math.ceil(n) == Math.floor(n)) {
            return false;
        }else if (n < 2) {
            return false;
        }else {
            for (int i = 2; i< n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(3));
        System.out.println(isPrime(211));
        System.out.println(isPrime(25.0f));
        System.out.println(isPrime(573.3)); 
    }
}
