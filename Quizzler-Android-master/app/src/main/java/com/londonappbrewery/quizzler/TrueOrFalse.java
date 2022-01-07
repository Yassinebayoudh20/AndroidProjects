package com.londonappbrewery.quizzler;

public class TrueOrFalse {

    private int mQuestion;
    private boolean mAnswer;

    public TrueOrFalse(int question, boolean answer) {
        mQuestion = question;
        mAnswer = answer;
    }

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int question) {
        mQuestion = question;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }
}
