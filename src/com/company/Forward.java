package com.company;

public class Forward extends SoccerPlayer {
    private int goalsShot;
    private int goalsMissed;

    public Forward(String firstName, String lastName, String dateOfBirth, String nativeLanguage, float weight,
                   float height, String category, String level, String position, int playerNumber, int goalsShot, int goalsMissed) {
        super(firstName, lastName, dateOfBirth, nativeLanguage, weight, height, category, level, position, playerNumber);
        this.goalsShot = goalsShot;
        this.goalsMissed = goalsMissed;
    }

    public int getGoalsShot() {
        return goalsShot;
    }

    public void setGoalsShot(int goalsShot) {
        this.goalsShot = goalsShot;
    }

    public int getGoalsMissed() {
        return goalsMissed;
    }

    public void setGoalsMissed(int goalsMissed) {
        this.goalsMissed = goalsMissed;
    }
}
