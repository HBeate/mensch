package com.company;

public class Goalkeeper extends SoccerPlayer {
    private int shotsSaved;
    private int shotsMissed;

    public Goalkeeper(String firstName, String lastName, String dateOfBirth, String nativeLanguage, float weight,
                      float height, String category, String level, String position, int playerNumber, int shotsSaved, int shotsMissed) {
        super(firstName, lastName, dateOfBirth, nativeLanguage, weight, height, category, level, position, playerNumber);
        this.shotsSaved = shotsSaved;
        this.shotsMissed = shotsMissed;
    }

    public int getShotsSaved() {
        return shotsSaved;
    }

    public void setShotsSaved(int shotsSaved) {
        this.shotsSaved = shotsSaved;
    }

    public int getShotsMissed() {
        return shotsMissed;
    }

    public void setShotsMissed(int shotsMissed) {
        this.shotsMissed = shotsMissed;
    }
}
