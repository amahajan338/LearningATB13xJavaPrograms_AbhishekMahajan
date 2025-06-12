package ex_06_Ternary_Operator;

public class day_12_task_3 {
    public static void main(String[] args) {
        /*
        Grade Calculation Using Nested Ternary
        Description: Marks 90 = A+, 75 = A, 60 = B, 40 = C, below 40 Fail.
        */

        int marks = 60;

        String grade = (marks >= 90) ? "A+" : (marks >= 75) ? "A" : (marks >= 60) ? "B" : (marks >= 40) ? "C" : "Fail";

        System.out.printf("The marks of the student Abhishek is %d & the grade as per marks are %s",marks,grade);
    }
}
