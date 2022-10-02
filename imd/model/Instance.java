package imd.model;

import java.util.Calendar;

/**
 * Instance
 */
public class Instance {
    private int number;
    private boolean bool;
    private String sentence;
    private Calendar release;

    public Instance(int number, boolean bool, String sentence, Calendar release) {
        this.number = number;
        this.bool = bool;
        this.sentence = sentence;
        this.release = release;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public boolean isBool() {
        return bool;
    }
    public void setBool(boolean bool) {
        this.bool = bool;
    }
    public String getSentence() {
        return sentence;
    }
    public void setSentence(String sentence) {
        this.sentence = sentence;
    }
    public Calendar getRelease() {
        return release;
    }
    public void setRelease(Calendar release) {
        this.release = release;
    }

    public void listAtributes() {
        System.out.println("Number: " + number +
                " - Bool: " + bool +
                " - Sentence: " + sentence +
                " - Release: " + release.get(Calendar.DAY_OF_MONTH) +
                "/" + release.get(Calendar.MONTH) +
                "/" + release.get(Calendar.YEAR) +
                ";");
    }
}