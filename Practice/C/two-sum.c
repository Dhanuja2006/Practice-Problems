int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    * returnSize = 2;
    int *ptr = (int*)malloc(* returnSize*(sizeof(int)));
    for(int i=0;i<numsSize;i++)
    {
        for(int j=i+1;j<numsSize;j++)
        {
            if(((*(nums+i))+(*(nums+j)))==target)
            {
                *(ptr+0)=i;
                *(ptr+1)=j;
                return ptr;
            }
        }
    }
    * returnSize = 0;
    return NULL;
    
}
