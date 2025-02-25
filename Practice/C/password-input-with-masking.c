#include <stdio.h>
#include<conio.h>

int main(){
    char passwrd[20];
    char ch;
    int i = 0;
    printf("Enter the password:");
    while((ch = getch()) != 13){
        passwrd[i] = ch;
        i++;
        printf("* ");
    }
    printf("\nPassword: %s", passwrd);
}
