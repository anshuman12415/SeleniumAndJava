package javaProgram;

public class StaticUse {
    // Static variable
    static int staticVar = 10;

    // Static method
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    public static void main(String[] args) {
        // Accessing static variable
        System.out.println("Static Variable: " + StaticUse.staticVar);

        // Calling static method
        StaticUse.staticMethod();
    }
}
