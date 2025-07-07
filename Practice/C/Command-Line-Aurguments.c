/* Command-Line Arguments */
#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[])
{
    printf("Aurgument count: %d\n", argc);  
    printf("1st aurgument value: %s\n", argv[1]);
    
    //printf("%d\n", argv[1]); //random value
    
    printf("Sum(arg1, arg2): %d\n", atoi(argv[1]) + atoi(argv[2]));
    
    printf("Given aurgumments...:");
    for(int i = 1; i < argc; i++){
        printf("%s ", argv[i]);
    }
    return 0;
}

/*
2) What is meant by argc and argv in CLA? (argument count, argument vector)

3) Why is the Default Value of argc 1?
ans: it is allocated to name of the program or path of the program
Memory Layout Example
If you run:
./my_program hello world
The memory structure looks like:
argv[0] → "./my_program\0"  
argv[1] → "hello\0"  
argv[2] → "world\0"  
argv[3] → NULL  

4) printf("%d", argv[1]); Why does this give a random value?
ans: argv[1] is a pointer to a string (e.g., "hello"). %d in printf expects an integer (int). When you pass a pointer (char*) where an int is expected, the pointer’s memory address is misinterpreted as an integer, printing a seemingly random number.

5) printf("%s", argv[1] + argv[2]); -> throws error
ans: As these 2 are strings. Would work if u convert it to string (atoi)

*/
