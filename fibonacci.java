1] fibonacci series using recursive and non recursive funtion

 public class FibonacciSeriesRecursive {
    public static void main(String[] args) {
        int n = 10;
        System.out.print("Fibonacci Series of "+n+" terms:");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}