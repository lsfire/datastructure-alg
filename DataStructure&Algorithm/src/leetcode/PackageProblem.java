package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PackageProblem {
	
	public static void main(String[] args) {
		int[] cost = new int[]{4,3,5,6,2,1};
		int[] value = new int[]{10,100,43,4,102,1000};
		int capacity = 20;
		
		System.out.println(packagePro(cost, value, capacity));
	}
	/**
	 * 
	 * @param cost 每件物品的重量
	 * @param value 每件物品的价值
	 * @param capacity 背包容量
	 */
	public static int packagePro(int[] cost,int[] value,int capacity){
		int maxValue = 0;//保存可能获得的最大值
		List<Integer> list = new ArrayList<>();
		int n = cost.length,m = value.length;
		if (n != m) return maxValue;
		
		int[][] dp = new int[n + 1][capacity + 1];
		
		dp[0][0] = 0;
		for(int i = 1;i < n + 1;i++){
			for(int j = 1;j < capacity + 1;j++){
				
				int taken = (j - cost[i - 1]) >= 0? dp[i - 1][j - cost[i - 1]] + value[i - 1]:0;
				int notTaken = dp[i - 1][j];
				
				dp[i][j] = taken > notTaken ? taken : notTaken;
				if(taken > notTaken){
					if(!list.contains(i)){
						list.add(i);
					}
				}
				
			}
		}
		
		System.out.println("taken these:" + list);
		
		return dp[n][capacity];
	}

}
