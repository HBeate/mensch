package com.company;

public class Athlete extends Human {
private String category;
private String level;

    public Athlete(String firstName, String lastName, String dateOfBirth, String nativeLanguage, float weight,
                   float height, String category, String level) {
        super(firstName, lastName, dateOfBirth, nativeLanguage, weight, height);
        this.category = category;
        this.level = level;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

}
