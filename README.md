# Student Grade Calculator

A Java console program that displays a student's name, major, and course, calculates the average of three assignment grades, and prints whether the student passed (average >= 70).

## Requirements

- Java Development Kit (JDK) 17 or newer
- VS Code with the "Extension Pack for Java" (optional, for running inside VS Code)

Check your install with:

```
java -version
javac -version
```

## How to Run

### In VS Code

1. Clone the repo and open the folder in VS Code.
2. Open `StudentGradeCalculator.java`.
3. Click the **Run** button above `main`, or press `Ctrl+F5`.
4. Output appears in the terminal panel.

### From the command line

```
javac StudentGradeCalculator.java
java StudentGradeCalculator
```

## Expected Output

```
=== Student Information ===
Student: Marcus Reyes
Major: Information Systems
Course: CMPS 360 - Object-Oriented Programming

=== Assignment Grades ===
Assignment 1: 78.5
Assignment 2: 66.0
Assignment 3: 83.25

=== Results ===
Average: 75.92
Status: Passed
```

## Changing the Data

Edit the variables at the top of `main` (student info and the three grades), then run it again. Try grades that average below 70 to see the "Failed" result.
