#include <stdio.h>

/*
void main(){
  char a = '2';
  int b = (int)a - '0';
  printf("%d", b);
}
*/

int main()
{
    char a[] = "123";
    int x = 0;
    for(int i = 0; i < (sizeof(a)/sizeof(a[0])) - 1; i++){
        int no = (int)a[i] - '0';
        x = x*10 + no;
    }
    printf("%d", x);
    return 0;
}
