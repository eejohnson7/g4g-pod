public class Factorial {
    int factorial(int n) {
        int factorial = 1;
        
        int i = 2;
        while (i <= n) {
            factorial = factorial * i;
            i++;
        }
        
        return factorial;
    }
}
