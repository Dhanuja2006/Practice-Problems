import java.util.*;
public class Main
{
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int no = sc.nextInt();
        int prime_factor;
        for(int i = 2;i <= no; i++){
            prime_factor = 0;
            for(int j = 2; j < i;j++){
                if (i % j == 0){
                    prime_factor = prime_factor + 1;
                }
            }
            if (prime_factor == 0){
                System.out.print(i + " ");
            }
        }
}
}
