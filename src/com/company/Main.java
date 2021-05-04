package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver=true;
        int score=800;
        int levelCompleted=5;
        int bonus=100;

    int highscore= calculatescore(true,800,5,100);
        System.out.println("your final score was" + highscore);
    score=10000;
    levelCompleted=8;
    bonus=200;

    highscore= calculatescore(true,10000,8,200);
        System.out.println("your final score was" + highscore);

    }
    public static int calculatescore(boolean gameOver, int score, int levelCompleted,int bonus){

        if (gameOver==true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore +=2000;

            return finalScore;
        }
        return -1;
        // creating a change
    }


    }

    

