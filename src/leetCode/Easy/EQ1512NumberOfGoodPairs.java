package leetCode.Easy;

public class EQ1512NumberOfGoodPairs {
    /*
Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.



Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
Example 2:

Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
Example 3:

Input: nums = [1,2,3]
Output: 0
     */

    public static int numIdenticalPairs(int[] nums) {
        int goldPairs=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
              if(nums[i]==nums[j])
                  goldPairs++;
            }
        }
        return goldPairs;
    }

    public static void main(String[] args) {
        int[] nums={1,1,1,1};
        System.out.println(numIdenticalPairs(nums));
    }
}
//Important explanation
/*
Solution 1: Brute Force Approach, Using two nested loop.
Initialise ans as 0 and increase ans for every nums[i] if we have nums[i] == nums[j], (0<= j < i).
TC: O(N^2), SC:O(1).

class Solution {
public:
    int numIdenticalPairs(vector<int>& nums) {
        int ans = 0;
        for(int i=0; i<nums.size(); i++){
            for(int j=i-1; j>= 0; j--){
                if(nums[j] == nums[i])
                    ans++;
            }
        }
        return ans;
    }
};
Solution 2: Think what we are doing in last solution, we are calculating how many time nums[i] occur before ith index.
So if store occurance of nums[i] in some container lets say array as N <= 100 or hashmap. Then we can remove inner
loop, and simply do ans += count[nums[i]]. TC:O(N), SC:O(1), 100 is fixed size array !!

class Solution {
public:
    int numIdenticalPairs(vector<int>& nums) {
        int count[101] = {0}, ans = 0;
        for(int i=0; i<nums.size(); i++){
            if(count[nums[i]] != 0){
                ans += count[nums[i]];
            }
            count[nums[i]]++;
        }
        return ans;
    }
};
 */
