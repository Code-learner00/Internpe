import java.util.Scanner;

public class OnlineQuiz {

    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Declare variables to store quiz details
        String[] questions = {
                "What is the capital of India?",
                "What is the largest animal in the world?",
                "What is the smallest planet in the solar system?",
                "Who is the author of Harry Potter series?",
                "What is the square root of 64?"
        };
        String[][] options = {
                {"A) Delhi", "B) Mumbai", "C) Kolkata", "D) Chennai"},
                {"A) Elephant", "B) Whale", "C) Giraffe", "D) Crocodile"},
                {"A) Mercury", "B) Venus", "C) Mars", "D) Pluto"},
                {"A) J.R.R. Tolkien", "B) George R.R. Martin", "C) J.K. Rowling", "D) Stephen King"},
                {"A) 6", "B) 7", "C) 8", "D) 9"}
        };
        char[] answers = {'A', 'B', 'A', 'C', 'C'};
        int score = 0;

        // Loop through the questions and get user answers
        for (int i = 0; i < questions.length; i++) {
            // Display the question and the options
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }
            // Get the user answer
            System.out.println("Enter your answer (A, B, C or D):");
            char answer = sc.next().toUpperCase().charAt(0);
            // Check if the answer is correct and update the score
            if (answer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is " + answers[i]);
            }
            // Display a blank line
            System.out.println();
        }

        // Display the final score
        System.out.println("You have completed the quiz!");
        System.out.println("Your score is " + score + " out of " + questions.length);
    }
}
