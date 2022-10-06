package imd.model;

import java.util.Calendar;

/**
 * Instance
 */
public class Entity {
    private int id;
    private String name;
    private boolean bool;
    private Calendar release;

    public Entity() {
        this.id = 1;
        this.bool = true;
        this.name = "Default Entity";
        this.release = Calendar.getInstance();
    }

    public Entity(int number, boolean bool, String sentence, Calendar release) {
        this.id = number;
        this.bool = bool;
        this.name = sentence;
        this.release = release;
    }

    public int getNumber() {
        return id;
    }
    public void setNumber(int number) {
        this.id = number;
    }
    public boolean isBool() {
        return bool;
    }
    public void setBool(boolean bool) {
        this.bool = bool;
    }
    public String getSentence() {
        return name;
    }
    public void setSentence(String sentence) {
        this.name = sentence;
    }
    public Calendar getRelease() {
        return release;
    }
    public void setRelease(Calendar release) {
        this.release = release;
    }

    public void listAtributes() {
        System.out.println("Number: " + id +
                " - Bool: " + bool +
                " - Sentence: " + name +
                " - Release: " + release.get(Calendar.DAY_OF_MONTH) +
                "/" + release.get(Calendar.MONTH) +
                "/" + release.get(Calendar.YEAR) +
                ";");
    }
}