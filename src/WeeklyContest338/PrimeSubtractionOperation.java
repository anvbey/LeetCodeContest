class Solution {
    public boolean primeSubOperation(int[] nums) {

        if(nums.length == 1)
            return true;
        boolean flag = true;
        for(int i=nums.length-2;i>=0;i--)
        {
            int x;
            if(nums[i+1] <= nums[i])
            {
                x= nums[i];
                nums[i] -= findPrime(nums[i], nums[i+1]);
                System.out.println(nums[i]);
                if(nums[i] == x)
                    return false;
            }
        }

        // for(int i=0;i<nums.length;i++)
        // System.out.println(nums[i]);

        return nums[0]< nums[1]?true:false;
    }

    public int findPrime(int x, int y)
    {
        for(int i= 2;i<x;i++)
        {
            if(isPrime(i) && (x-i < y))
                return i;
        }

        return 0;
    }

    public boolean isPrime(int x)
    {
        for(int i=2;i<x;i++)
        {
            if(x % i == 0)
                return false;
        }
        return true;
    }
}