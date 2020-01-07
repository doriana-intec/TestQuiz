package jp.ekata.question_interface.implementations;

import jp.ekata.question_interface.QuizQuestions;

import java.util.Random;

public class AdditionQuestions implements QuizQuestions {

    private int firstNumber;
    private int secondNumber;

    public AdditionQuestions() {
        firstNumber = new Random().nextInt(50) + 1;
        secondNumber = new Random().nextInt(50);
    }

    @Override
    public String getQuestion() {
        return "What is " + firstNumber + " + " + secondNumber + "?";
    }

    @Override
    public int getCorrectAnswer() {
        return firstNumber + secondNumber;
    }
}
