import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int evenCnt = 0;
	    int oddCnt = 0;
	    
	    int n = sc.nextInt();
	    int arr[] = new int[n];
	    
	    for(int i = 0; i < n; i++){
	        arr[i] = sc.nextInt();
	        if(arr[i] % 2 == 0)
	            evenCnt += 1;
	        else
	            oddCnt += 1;
	    }
	    
	    int evenArray[] = new int[evenCnt];
	    int oddArray[] = new int[oddCnt];
	    
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
	    for(i = 0; i < evenCnt; i++){
	        System.out.print(evenArray[i] + " ");
	    }
	    System.out.println();
	    System.out.print("Odd elements: ");
	    for(i = 0; i < oddCnt; i++){
	        System.out.print(oddArray[i] + " ");
	    }
	}
}


