package com.example.damio.fantasybaseball;

public class Sessions {

    public int getTotalScore3() {
        return totalScore3 + totalScore4;
    }
    public void setTotalScore3(int totalScore3) {
        this.totalScore3 = totalScore3;
    }

    public int totalScore3 = 0;
    public int totalScore4 = 0;



    public static Sessions sessions;

    public static Sessions getInstance() {
        if (sessions == null) {
            synchronized (Sessions.class) {
                sessions = new Sessions();
            }
        }
        return sessions;
    }
}
