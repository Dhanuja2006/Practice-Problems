/* Using C
1)Finding the sum of array
2)If sum is not a multiple of three then return False
3)Traverse from zero to last idx, find the sum of numbers,
    if anywhere sum is a multiple of 3, 
      let it be a module1, resume from the nxt idx with sum = 0 
      continue the process till the end
4)If cnt = 3 or cnt = 2 i.e module with equal sum is 3,
    return true
*/

bool canThreePartsEqualSum(int* arr, int arrSize) {
    int sum = 0;
    for(int i = 0; i < arrSize; i++){
        sum += arr[i];
    }
    if(sum%3 != 0)
        return false;
    
    int partSum = sum/3;
    int curSum = 0;
    int cnt = 0;

    for(int i = 0; i < arrSize; i++){
        curSum += arr[i];
        if(curSum == partSum){
            curSum = 0;
            cnt += 1;
        }
    }
    if(cnt >= 3)
        return true;
    return false;
}
