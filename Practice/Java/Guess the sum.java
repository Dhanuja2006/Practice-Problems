/**
Write the program that simulates a dice rolling game. The user has to guess the tota sum of the dice rolled
by the computer. The computer will randomly select two integers, each between 1 and 6(inclusive), representing
the dice rolls. The user will be given 5 attempts to guess the correct sum.

1 <= dice_roll_val <= 6
2 <= guess_val <= 12
**/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int a = rd.nextInt(6) + 1;
		int b = rd.nextInt(6) + 1;
		int sum = a+b;
		
		boolean won = false;
		int chance_no = 0;
		int guess_val = -1;
		
		while(chance_no < 5){
		    guess_val = sc.nextInt();
		    
		    if(guess_val < 2 || guess_val > 6){
		        System.out.println("Invalid");
		        continue;
		    }
		    if(guess_val == sum){
		        System.out.println("Correct");
		        won = true;
		        break;
		    }else if(guess_val < sum){
		        System.out.println("Too Low");
		    }else if(guess_val > sum){
		        System.out.println("Too High");
		    }
		}
		
		if(!won){
		    System.out.println("Failed: Out of Attempts");
		}
		sc.close();
	}
}
