package com.example.damio.fantasybaseball;

public class Session {

    public int getTotalScore() {
        return totalScore + totalScore2;
    }
    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public int totalScore = 0;
    public int totalScore2 = 0;


    public static Session session;

    public static Session getInstance() {
        if (session == null) {
            synchronized (Session.class) { 
                session = new Session();
            }
        }
        return session;
    }
}


