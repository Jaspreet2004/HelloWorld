public class HelloWorld {
    static void printHelloWorld(int n) {
        if (n <= 0) {
            return;
        } else {
            System.out.println("Hello World");
            printHelloWorld(n - 1); // Recursive call with n-1
        }
    }

    public static void main(String[] args) {
        int n = 5; // Example: Print "Hello World" 5 times
        printHelloWorld(n);
    }
}