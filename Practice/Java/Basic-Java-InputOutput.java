import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(num-1 + ", " + num + ", " + (num+1));
    }
}

/*
1) main method is entry point of the program. Hence it has to be in pulic else entry will be blocked
2) when private is used instead of public: can't find main(String[]) method in class: Main
3) void is used cuz main is not gonna return any value to other variable.
*/
