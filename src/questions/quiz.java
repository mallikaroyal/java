package questions;


import java.util.Random;
import java.util.Scanner;

class Question {
	private String questionText;
	private String[] options;
	private int correctAnswer;
	
	
	public Question(String questionText,String[] options, int correctAnswer) {
		this.questionText = questionText;
		this.options = options;
		this.correctAnswer = correctAnswer;
	}


	public String getQuestionText() {
		return questionText;
	}


	public String[] getOptions() {
		return options;
	}


	public int getCorrectAnswer() {
		return correctAnswer;
	}
	
	
}

public class quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Question[] questions = new Question[2];
		questions[0] = new Question("What is the JVM ?",new String[] {"1.Java virtual Machine ","2. Java vrtual machine", "3. java varsion macjine","4. java virtual machines"},0);
		questions[1] = new Question("What is the leading programming Language ?",new String[] {"1.Java  ","2. Python", "3. Sql","4. HTML"},0);
		
		int score = 0;
		int lifelinesUsed = 0;
		
		// Loop through questions
        for (Question question : questions) {
        	
        	
        		
            System.out.println(question.getQuestionText());
            for (String option : question.getOptions()) {
                System.out.println(option);
            }
            System.out.print("Enter your answer (1-4): ");
            int answer = sc.nextInt();

            if (answer - 1 == question.getCorrectAnswer()) {
                score++;
                System.out.println("Correct!\n");
            } else {
                System.out.println("Wrong. The correct answer is " + (question.getCorrectAnswer() + 1) + ".\n");
                if (lifelinesUsed < 2) {
                    System.out.println("Would you like to use a lifeline?");
                    System.out.println("1. 50-50");
                    System.out.println("2. Live Line");
                    System.out.println("3. No, continue to next question");
                    int lifelineChoice = sc.nextInt();

                    if (lifelineChoice == 1) {
                        lifelinesUsed++;
                        use5050Lifeline(question);
                    } else if (lifelineChoice == 2) {
                        lifelinesUsed++;
                        useLiveLineLifeline(question);
                    }
                }
            }
        }
            
        
     // Display final score
        System.out.println("You scored " + score + " out of " + questions.length + "!");
        sc.close();
				
		// TODO Auto-generated method stub

	}


private static void use5050Lifeline(Question question) {
    String[] options = question.getOptions();
    int correctAnswerIndex = question.getCorrectAnswer();
    int[] remainingOptions = new int[2];
    remainingOptions[0] = correctAnswerIndex;

    // Find one incorrect option
    int incorrectOptionIndex;
    do {
        incorrectOptionIndex = (int) (Math.random() * options.length);
    } while (incorrectOptionIndex == correctAnswerIndex);
    remainingOptions[1] = incorrectOptionIndex;

    System.out.println("50-50 Lifeline used. Here are your remaining options:");
    for (int index : remainingOptions) {
        System.out.println(options[index]);
    }
}
private static void useLiveLineLifeline(Question question) {
    int correctAnswerIndex = question.getCorrectAnswer();
    System.out.println("Live Line Lifeline used. Here's a hint:");
    // Provide a simple hint by showing the correct answer
    System.out.println("The correct answer is option " + (correctAnswerIndex + 1));
}
}


