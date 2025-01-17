public class Variables {
    // Instance variable
    int instanceVar = 50;

    // Static variable
    static int staticVar = 100;

    public void showVariables() {
        // Local variable
        int localVar = 150;

        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {
        // Create an instance of the class
        Variables example = new Variables();

        // Accessing instance and static variables
        System.out.println("Instance Variable (accessed via object): " + example.instanceVar);
        System.out.println("Static Variable (accessed via class): " + Variables.staticVar);

        // Demonstrating variables inside a method
        example.showVariables();
    }
}
