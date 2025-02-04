/**
A jar can have maximum of N no of candies. The jar must have minimum of k number of candies. Input the number of candies to sell & output the no of candies sold & and the no of candies available after selling.
**/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int N = 10;
	    int k = 5;
	    
	    int no = sc.nextInt();
	    
	    if(N - no > k){
	        System.out.println("NUMBER OF CANDIES SOLD: "+ no );
	        System.out.println("NUMBER OF CANDIES AVAILABLE: " + (N - no));
	    }else{
	        System.out.println("INVALID INPUT");
	        System.out.println("NUMBER OF CANDIES AVAILABLE:" + N);
	    }
	}
}
