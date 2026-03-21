public static class mathFunctions {

    //function to calculate sum of the array of the numbers
    public static int sum(int[] numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    public static int add(int a, int b) {
        // Handle zero cases        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }   
        return a + b;
    }

    public static int subtract(int a, int b) {
        if (a < b) {
            throw new IllegalArgumentException("a must be greater than b");
        }           
        return a - b;
    }

    public static int multiply(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }
}