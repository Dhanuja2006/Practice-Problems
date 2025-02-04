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
	    
	    int evenArray[] = new int[n];
	    int oddArray[] = new int[n];
	    
	    int i = 0;
	    int j = 0;
	    
	    for(int k = 0; k < n; k++){
	        if(arr[k] % 2 == 0){
	            evenArray[i] = arr[k];
	            i++;
	        }else{
	            oddArray[j] = arr[k];
	            j++;
	        }
	    }
	    
	    System.out.print("Even elements: ");
	    for(int k = 0; k < i; k++){
	        System.out.print(evenArray[k] + " ");
	    }
	    System.out.println();
	    System.out.print("Odd elements: ");
	    for(int k = 0; k < j; k++){
	        System.out.print(oddArray[k] + " ");
	    }
	}
}


