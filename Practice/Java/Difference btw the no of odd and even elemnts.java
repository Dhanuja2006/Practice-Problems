import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int arr[] = new int[n];
	    
	    for(int i = 0; i < n; i++){
	        arr[i] = sc.nextInt();
	    }
	    
	    int i = 0;
	    int j = 0;
	    
	    for(int k = 0; k < n; k++){
	        if(arr[k] % 2 == 0){
	            i++;
	        }else{
	            j++;
	        }
	    }
	    System.out.println("Difference btw the number of even and odd elements: " + Math.abs(i - j));
	}
}


