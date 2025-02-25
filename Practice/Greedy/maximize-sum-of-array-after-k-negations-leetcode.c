/*
If all neg nos are flipped and only pos nos are left in array:
    check if k is even or odd:
        if k is even:
            donot make any action(as smallest pos no in array will be negetive for nxt iteration, the previously filpped value will be flipped again for nxt iteration and so on..)
        else:
            single flip is enough
*/


int compare(const void *a, const void *b){
    return (*(int *)a - *(int *)b);
}

int total(int *arr, int l){
    int sum = 0;
    for(int i = 0; i < l; i++){
        sum += arr[i];
    }
    return sum;
}

int largestSumAfterKNegations(int* nums, int numsSize, int k) {
    qsort(nums, numsSize, sizeof(int), compare);
    int i = 0;
    while(i < numsSize && nums[i] < 0 && k > 0){
        nums[i] = -1*nums[i];
        i++;
        k--;
    }
    
    if(k % 2 == 0){
        return total(nums, numsSize);
    }
    int min_idx = 0;
    for(int i = 1; i < numsSize; i++){
        if(nums[i] < nums[min_idx])
            min_idx = i;
    }
    nums[min_idx] = -1*nums[min_idx];
    return total(nums, numsSize);
}
