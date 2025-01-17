public class LocalToGlobal {
    // Instance variable (Global variable)
    int globalVar = 10;

    public void Access() {
        // Local variable
        int localVar = 20;
        System.out.println("Local variable: " + localVar);
    }

    public static void main(String[] args) {
        LocalToGlobal ls = new LocalToGlobal();
        System.out.println("Instance variable: " + ls.globalVar);
        ls.Access();
        // Compile-time error
         System.out.println("Trying to access local variable outside method: " + localVar);
    }
}
