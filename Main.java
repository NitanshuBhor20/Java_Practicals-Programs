public class Main
{
    public static void main(String[] args)
    {
        //Primitive types
        int age = 30;
        float height = 5.5f;
        char grade = 'A';
        boolean isEligible = true;

        //Non-Primitive types
        int[] marks = {90,85,88};
        String name = "Alize";

        //Display values
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Height: " +height);
        System.out.println("Grade: " +grade);
        System.out.println("IsEligible: " +isEligible);
        for (int i =0; i< marks.length; i++)
        {
            System.out.println(marks[i]);
        }
    }
}