package com.londonappbrewery.destini;

public class Stories {

    private int Stories;
    private int Answer1;
    private int Answer2;

    public Stories(int stories, int answer1, int answer2) {
        Stories = stories;
        Answer1 = answer1;
        Answer2 = answer2;
    }

    public int getStories() {
        return Stories;
    }

    public void setStories(int stories) {
        Stories = stories;
    }

    public int getAnswer1() {
        return Answer1;
    }

    public void setAnswer1(int answer1) {
        Answer1 = answer1;
    }

    public int getAnswer2() {
        return Answer2;
    }

    public void setAnswer2(int answer2) {
        Answer2 = answer2;
    }
}
