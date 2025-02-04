import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int sum_even = 0;
	    int oddEleSum = 0;
	    
	    int n = sc.nextInt();
	    int arr[] = new int[n];
	    
	    for(int i = 0; i < n; i++){
	        arr[i] = sc.nextInt();
	    }
	    
	    for(int i = 0; i < n; i++){
	        if(i%2 == 0) //Sum of elements at even positions
	            sum_even += arr[i];
	    System.out.println("Sum of elements at even positions: "+ sum_even );
	}
}
