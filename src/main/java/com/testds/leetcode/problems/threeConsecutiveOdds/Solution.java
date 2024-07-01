//https://leetcode.com/problems/three-consecutive-odds/
package com.testds.leetcode.problems.threeConsecutiveOdds;

public class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        if (arr.length <= 2)
            return false;
        for (int i = 0; i < arr.length - 2; i++) {
            if(arr[i+2]%2==0){
                i+=2;
                continue;
            }
            if(arr[i+1]%2==0){
                i+=1;
                continue;
            }
            if(arr[i]%2==1)
                return true;
        }
        return false;
    }
}
