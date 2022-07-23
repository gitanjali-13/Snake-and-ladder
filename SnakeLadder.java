package com.bridgelabz.snakeLadder.game;

public class SnakeLadder {
	static final int START_POSITION =0;
    static final int NO_PLAY =0;
    static final int IF_LADDER =1;
    static final int IF_SNAKE =2;
    static int CurrentPosition=0;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and ladder game");
        while(CurrentPosition<100) {
            int dice = (int) (Math.random() * 10) % 6 + 1;
            int option = (int) (Math.random() * 10) % 3;

            if (option == IF_LADDER) {
                System.out.println("ladder!!");
                CurrentPosition +=dice;

            } else if (option == IF_SNAKE) {
                System.out.println("snake!!");
                CurrentPosition -=dice;


            } else {
                System.out.println("N0 play");
               
            }
            if(CurrentPosition<START_POSITION){
                CurrentPosition=START_POSITION;
            }
            
            System.out.println("currentposition: "+CurrentPosition);
        }


    }

	
}
