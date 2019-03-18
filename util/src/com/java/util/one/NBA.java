package com.java.util.one;

public class NBA {
    private String name;
    private String nickname;
    private String score;
    private String rebound;
    private String assist;

    public NBA(String name, String nickname, String score, String rebound, String assist) {
        this.name = name;
        this.nickname = nickname;
        this.score = score;
        this.rebound = rebound;
        this.assist = assist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getRebound() {
        return rebound;
    }

    public void setRebound(String rebound) {
        this.rebound = rebound;
    }

    public String getAssist() {
        return assist;
    }

    public void setAssist(String assist) {
        this.assist = assist;
    }

    @Override
    public String toString() {
        return "NBA{" +
                "name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", score='" + score + '\'' +
                ", rebound='" + rebound + '\'' +
                ", assist='" + assist + '\'' +
                '}';
    }
}