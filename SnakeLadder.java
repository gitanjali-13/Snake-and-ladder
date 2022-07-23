package com.bridgelabz.snakeLadder.game;

public class SnakeLadder {
	static  int START_POSITION=0;
    static int NO_PLAY =0;
    static int IF_LADDER =1;
    static int IF_SNAKE =2;
    static int Playerposition=0;
    
	
	
	public static void main(String[] args) {
		
        System.out.println("Welcome to Snake and ladder game");
        int dice = (int) (Math.random()*10)%6 +1;
        int option = (int)(Math.random()*10)%3;
	
	    	
        if (option==IF_LADDER){
            System.out.println("Ladder!!");
             Playerposition+= dice;

        }
        else if(option==IF_SNAKE){
            System.out.println("snake!!");
            Playerposition-=dice;


        }else {
            System.out.println("N0 play");
        }

            }                              


	
}
