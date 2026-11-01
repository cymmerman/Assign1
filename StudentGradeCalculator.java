/**
 * StudentGradeCalculator
 * Assignment 1: Java Fundamentals and Console Programming
 *
 * Displays a student's information, calculates the average of three
 * assignment grades, and reports whether the student passed.
 */
public class StudentGradeCalculator {

    // Program entry point: the JVM starts running here
    public static void main(String[] args) {

        // Student information stored in String variables
        String studentName = "Marcus Reyes";
        String major = "Information Systems";
        String course = "CMPS 360 - Object-Oriented Programming";

        // Three assignment grades stored as doubles so decimals are supported
        double grade1 = 78.5;
        double grade2 = 66;
        double grade3 = 83.25;

        // Passing threshold stored in a variable so it is easy to change
        double passingScore = 70;

        // Add the grades, then divide by 3 to get the average
        double average = (grade1 + grade2 + grade3) / 3;

        // Print the student information
        System.out.println("=== Student Information ===");
        System.out.println("Student: " + studentName);
        System.out.println("Major: " + major);
        System.out.println("Course: " + course);
        System.out.println();

        // Print each individual grade
        System.out.println("=== Assignment Grades ===");
        System.out.println("Assignment 1: " + grade1);
        System.out.println("Assignment 2: " + grade2);
        System.out.println("Assignment 3: " + grade3);
        System.out.println();

        // Print the average rounded to two decimal places
        System.out.println("=== Results ===");
        System.out.printf("Average: %.2f%n", average);

        // if/else decides pass or fail based on the passing threshold
        if (average >= passingScore) {
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Failed");
        }
    }
}
