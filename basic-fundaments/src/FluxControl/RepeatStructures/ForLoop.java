package FluxControl.RepeatStructures;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("The index of i is: " + i);
        }

        System.out.println("--------------------------------");

        String students[] = { "Ed", "John", "Joanna", "Marcus" };

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println("--------------------------------");
        // Reduced version for/each iteration
        for (String student : students) {
            System.out.println(student);
        }
    }
}
