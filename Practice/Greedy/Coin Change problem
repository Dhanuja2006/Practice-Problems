#include <stdio.h>

void greedy(int coins[], int a, int l_coins){
    
    for(int i = 0; i < l_coins; i++){
        while(a >= coins[i]){
            printf("%d ", coins[i]);
            a -= coins[i];
        }
    }
}

void main()
{
    int coins[] = {25, 10, 5, 1};
    int a;
    printf("Enter the amt: ");
    scanf("%d", &a);
    int l_coins = sizeof(coins)/sizeof(coins[0]);
    greedy(coins, a, l_coins);
}
