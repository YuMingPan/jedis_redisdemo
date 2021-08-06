package com.atguigu;

import java.util.*;

import java.util.Stack;

// 前缀和
class NumArray {
    private int[] sums;

    public NumArray(int[] nums) {
        int n = nums.length;
        // 将前缀和数组 sums 的长度设为 n+1 的目的是为了方便计算 sumRange(i,j)，不需要对 i=0 的情况特殊处理。
        sums = new int[n + 1];
        for (int i = 0; i < n; i++) {
            sums[i + 1] = sums[i] + nums[i];
        }
    }

    // sums[i]对应的是nums在i-1范围内的前缀和，因为sums第一位固定为0
    // 如nums 2,3,4,5
    // sums为 0,2,5,9,14
    public int sumRange(int i, int j) {
        return sums[j + 1] - sums[i];
    }
}