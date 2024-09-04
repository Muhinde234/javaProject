public class Recursive {
    public static void main(String[] args) {
        displayNumbers(1);
    }

    public static void displayNumbers(int n) {
        
        if (n > 100) {
            return; // This stops the function from calling itself again.
        }

        
        System.out.println(n);

        // Recursive case: call the function with the next number
        displayNumbers(n + 1);
    }
}

