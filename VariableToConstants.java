public class VariableToConstants {
    public static void main(String[] args) {
        // Regular variable
        int myVariable = 100;
        System.out.println("Initial Value of myVariable: " + myVariable);

        // Convert the variable into a constant
        final int MY_CONSTANT = myVariable;
        System.out.println("Value of MY_CONSTANT: " + MY_CONSTANT);
    }
}
