package com.company;

import java.util.List;

// TODO has a Beziehung mit Athlete ? SoccerPlayer ? Goalkeeper? ??????
public class Club {
    private String name;
    private String category;
    private List<Human>humans;

    public Club(String name, String category, List<Human> humans) {
        this.name = name;
        this.category = category;
        this.humans = humans;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Human> getHumans() {
        return humans;
    }

    public void setHumans(List<Human> humans) {
        this.humans = humans;
    }
    public void addHuman (Human human){
        this.humans.add(human);
    }
    public void printHumans(){
        for(Human human: this.humans){
            System.out.println("Humans: " + human.getFirstName() +" "+ human.getLastName());
        }
    }
}
