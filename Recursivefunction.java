public class Recursivefunction {
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        System.out.println(n);
        return n * factorial(n - 1); // Corrected the recursive call
    }

    public static void main(String[] args) {
        System.out.println("Factorial: " + factorial(5));
    }
}

