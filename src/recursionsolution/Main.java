package recursionsolution;

/**
 *
 * @author TrongPs
 */
public class Main {

    //1
    static int sum(int n) {
        if (n <= 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    //2
    static int findMin(int a[], int n) {
        if (n == 1) {
            return a[0];
        }
        if (a[0] > a[n - 1]) {
            a[0] = a[n - 1];
        }
        return findMin(a, n - 1);
    }

    //3
    static int findSum(int a[], int n) {
        if (n <= 0) {
            return 0;
        }
        return a[n - 1] + findSum(a, n - 1);
    }

    //4  
    static boolean isPalindrome(char a[], int n) {
        if (n == 1) {
            return true;
        }
        int m = a.length;
        if (a[m - n] != a[n - 1]) {
            return false;
        } else {
            return isPalindrome(a, n - 1);
        }
    }

    //5
    static int bSearch(int a[], int target, int left, int right) {
        int mid = (left + right) / 2;
        if (right < left) {
            return -1;
        } // not found
        if (target == a[mid]) {
            return mid;
        }
        if (target < a[mid]) {
            return bSearch(a, target, left, mid - 1);
        }
        if (target > a[mid]) {
            return bSearch(a, target, mid + 1, right);
        }
        return -1;
    }

    //6
    public static int gcd(int n1, int n2) {
        if (n2 != 0) {
            return gcd(n2, n1 % n2);
        } else {
            return n1;
        }
    }

    //7
    static double power(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * power(x, n - 1);
        }
    }

    //8
    static int fact(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    //9
    static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    //10
    static double addReciprocals(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }

        if (n == 0) {
            return 0.0;
        }

        return addReciprocals(n - 1) + 1.0 / n;
    }

    public static void main(String[] args) {
        System.out.println(sum(8)); //36
        int[] a = {15, 12, 13, 8, 10, 21};
        System.out.println(findMin(a, a.length)); //8
        int[] b = {1, 2, 3, 4, 5, 6};
        System.out.println(findSum(b, b.length)); //21
        System.out.println(gcd(6, 80));
        System.out.println(bSearch(b, 5, 0, b.length)); //4
        char[] c = "dad".toCharArray();
        System.out.println(isPalindrome(c, c.length)); //1
        System.out.println(power(2, 3)); //8
        System.out.println(fact(5));
        System.out.println(fib(10));
        System.out.println(addReciprocals(8));
    }
}
