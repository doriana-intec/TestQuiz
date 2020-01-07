package jp.ekata.question_interface.implementations;

import jp.ekata.question_interface.QuizQuestions;

import java.util.Random;

public class SubtractionQuestions implements QuizQuestions {

    private int firstNumber;
    private int secondNumber;

    public SubtractionQuestions() {
        firstNumber = new Random().nextInt(50) + 1;
        secondNumber = new Random().nextInt(50);
       swap();
    }

    private void swap(){
        if (secondNumber > firstNumber) {
            int temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }
    }

    @Override
    public String getQuestion() {
        return "What is " + firstNumber + " - " + secondNumber + "?";
    }

    @Override
    public int getCorrectAnswer() {
        return firstNumber - secondNumber;
    }
}
