// Problem Statement :  Java program to find factorial using recursion

class Factorial {

    
    static int factorial(int h) {
        if (h == 0)
            return 1;
        else
            return (h * factorial(h - 1));
    }

    
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of " + num + " is " + factorial(num));
    }
}
