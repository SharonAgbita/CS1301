/*
 * GradeCalculator.java
 * Author: Sharon Agbita 
 * Submission Date: 
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 *
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance with
 * the University of Georgia's Academic Honesty Policy and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the Department of Computer
 * Science at the University of Georgia. Any publishing 
 * or posting of source code for this assignment is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.
 * 
 */ 
import java.util.Scanner;
public class GradeCalculator {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		//declared variables to store weights of 
		double examOneWeight = 0;
		double examTwoWeight = 0;
		double finalExamWeight = 0;
		double labsWeight = 0;
		double projectsWeight = 0;
		double participationWeight = 0;
		double quizzesWeight = 0;
		
		//declared variables to store the scores
		double examOneScore = 0;
		double examTwoScore = 0;
		double finalExamScore = 0;
		double labGrade = 0;
		double projectGrade = 0;
		double participationGrade = 0;
		double quizGrade = 0;

		
		
		//prints for grading scale
		System.out.println("Grading Scale:");
		System.out.println("A     90 - 100");
		System.out.println("B     80 - 89");
		System.out.println("C     70 - 79");
		System.out.println("D     60 - 69");
		System.out.println("F     below 60 ");
		
		//input for desired grade user
		System.out.printf("What letter grade do you want to achieve for the course?");
		char wantedGrade = keyboard.next().charAt(0);
		wantedGrade = Character.toUpperCase(wantedGrade); //user inputs here the grade they want
		
		if (!(wantedGrade == 'A' || wantedGrade == 'B' || wantedGrade == 'C' || wantedGrade == 'D' || wantedGrade == 'F')) {
            System.out.println("The input is invalid.");
            System.exit(0);
		}
		
		//prints that help the user input different weight percentages
				System.out.println("Enter percentage weights below.");
				System.out.print("Exam 1: \t");
				examOneWeight = keyboard.nextDouble();
				System.out.print("Exam 2: \t");
				examTwoWeight = keyboard.nextDouble();
				System.out.print("Final Exam: \t");
				finalExamWeight = keyboard.nextDouble();
				System.out.print("Labs: \t\t");
				labsWeight = keyboard.nextDouble();
				System.out.print("Projects: \t");
				projectsWeight = keyboard.nextDouble();
				System.out.print("Participation: \t");
				participationWeight = keyboard.nextDouble();
				System.out.print("Quizzes: \t");
				quizzesWeight = keyboard.nextDouble();
				
		// sum of weights of grading items with known scores
		double totalKnownGradeWeight = examOneWeight + examTwoWeight + finalExamWeight + labsWeight + projectsWeight + participationWeight + quizzesWeight;
		//what the program will display based on it adding up to 100
		if (totalKnownGradeWeight != 100) {
			System.out.println("Weights don’t add up to 100, program exiting...");
			keyboard.close();
            return;
		}
		
		 double currentTotal = 0;
	     double knownWeight = 0;

		
		//user response to knowing their scores for each item
		keyboard.nextLine();
		System.out.print("Do you know your exam 1 score?");
		String userAnswersExamOne = keyboard.nextLine();
		if (userAnswersExamOne.equalsIgnoreCase("y") || userAnswersExamOne.equalsIgnoreCase("yes")) {{
			System.out.print("Score recieved on exam 1:");
			examOneScore = keyboard.nextDouble();
			currentTotal += examOneWeight * examOneScore;
            knownWeight += examOneWeight;
			keyboard.nextLine();
		}		if (examOneScore >= 0 && examOneScore <= 100); {
			System.out.print("Do you know your exam 2 score?");
			String userAnswersExamTwo = keyboard.nextLine();
			if (userAnswersExamTwo.equalsIgnoreCase("y") || userAnswersExamTwo.equalsIgnoreCase("yes")) {{
				System.out.print("Score recieved on exam 2:");
				examTwoScore = keyboard.nextDouble();
				currentTotal += examTwoWeight * examTwoScore;
	            knownWeight += examTwoWeight;
				keyboard.nextLine();
			}
		}
		if (examTwoScore >= 0 && examTwoScore <= 100); {
			System.out.print("Do you know your final exam score?");
			String userAnswersFinalExam = keyboard.nextLine();
			if (userAnswersFinalExam.equalsIgnoreCase("y") || userAnswersFinalExam.equalsIgnoreCase("yes")) {
				System.out.print("Score recieved final exam:");
				finalExamScore = keyboard.nextDouble();
				currentTotal += finalExamWeight * finalExamScore;
	            knownWeight += finalExamWeight;
				keyboard.nextLine();
			}}
			}
		}
		if (finalExamScore >= 0 && finalExamScore <= 100); {
			System.out.print("Do you know your lab average?");
			String userAnswersLab = keyboard.nextLine();
			if (userAnswersLab.equalsIgnoreCase("y") || userAnswersLab.equalsIgnoreCase("yes")) {
				System.out.print("Average lab grade:");
				labGrade = keyboard.nextDouble();
				currentTotal += labsWeight * labGrade;
	            knownWeight += labsWeight;
				keyboard.nextLine();
			}
		}
		if (labGrade >= 0 && labGrade <= 100); {
			System.out.print("Do you know your project average?");
			String userAnswersProject = keyboard.nextLine();
			if (userAnswersProject.equalsIgnoreCase("y") || userAnswersProject.equalsIgnoreCase("yes")) {
				System.out.print("Average project grade:");
				projectGrade = keyboard.nextDouble();
				currentTotal += projectsWeight * projectGrade;
	            knownWeight += projectsWeight;
				keyboard.nextLine();
			}
		}
		if (projectGrade >= 0 && projectGrade <= 100); {
			System.out.print("Do you know your participation average?");
			String userAnswersParticipation = keyboard.nextLine();
			if (userAnswersParticipation.equalsIgnoreCase("y") || userAnswersParticipation.equalsIgnoreCase("yes")) {
				System.out.print("Average participation grade:");
				participationGrade = keyboard.nextDouble();
				currentTotal += participationWeight * participationGrade;
	            knownWeight += participationWeight;
				keyboard.nextLine();
			}
		}
		if (participationGrade >= 0 && participationGrade <= 100); {
			System.out.print("Do you know your quiz average?");
			String userAnswersQuiz = keyboard.nextLine();
			if (userAnswersQuiz.equalsIgnoreCase("y") || userAnswersQuiz.equalsIgnoreCase("yes")) {
				System.out.print("Average quiz grade:");
				quizGrade = keyboard.nextDouble();
				currentTotal += quizzesWeight * quizGrade;
	            knownWeight += quizzesWeight;
				keyboard.nextLine();
			}
		}
		
		// Calculate current grade score
        double currentGradeScore = currentTotal / knownWeight;
        System.out.printf("Current grade score: %.2f\n", currentGradeScore);

        // Determine the minimum score needed for the desired grade
        double finalOverallScore = 0;
        switch (wantedGrade) {
            case 'A':
                finalOverallScore = 90;
                break;
            case 'B':
                finalOverallScore = 80;
                break;
            case 'C':
                finalOverallScore = 70;
                break;
            case 'D':
                finalOverallScore = 60;
                break;
            case 'F':
                finalOverallScore = 0;
                break;
        }

        // Determine the current letter grade
        char currentLetterGrade;
        if (currentGradeScore >= 90) {
            currentLetterGrade = 'A';
        } else if (currentGradeScore >= 80) {
            currentLetterGrade = 'B';
        } else if (currentGradeScore >= 70) {
            currentLetterGrade = 'C';
        } else if (currentGradeScore >= 60) {
            currentLetterGrade = 'D';
        } else {
            currentLetterGrade = 'F';
        }

        System.out.printf("Your current letter grade: %c\n", currentLetterGrade);

        // helps the user know if they can get the score that they want
     // Determine the averages needed for user to get their desired letter grade
        double avgToFinalLetterGrade = ((100 * finalOverallScore) - currentTotal) / (100 - knownWeight);


if (currentLetterGrade == wantedGrade) {
            System.out.println("Congratulations! You received the " + wantedGrade + " that you wanted!");
        } else if (avgToFinalLetterGrade <= 0) {
            System.out.printf("You will receive at least a grade of %c.\n", wantedGrade);
        } else if (avgToFinalLetterGrade > 100) {
            System.out.println("Unfortunately, a grade of " + wantedGrade + " is not possible.");
        } else {
            System.out.printf("In order to receive a grade of %c, you need to score an average greater than or equal to %.2f in the rest of the grade items.\n",
                    wantedGrade, avgToFinalLetterGrade);
        }

        keyboard.close();
    }
}
		