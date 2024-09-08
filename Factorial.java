public class Factorial {
    
    public static int factorial(int n) {
        if(n==0)
        {
            return 1;
        }
        System.out.println(n);
        return n* factorial (n - 1);
    }
    public static void main(String[] args) {
        System.out.println("facrtorial of number: " +factorial(4));
        
    }
}
