package leetcode;

//Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). 
//Find two lines, which together with x-axis forms a container, such that the container contains the most water.
//
//Note: You may not slant the container.
public class MostWaterContainer {
	public static int maxArea(int[] height) {
        int result = 0;
        
        for(int i = 0,j = height.length - 1;i != j;){
        	int x = j - i;
        	int y = height[i] < height[j] ? height[i] : height[j];
        	
        	int area = x * y;
        	if(area >= result){
        		result = area;
        	}
        	
        	if(height[i] < height[j])  {
        		i++;
        	}else{
        		j--;
        	}
        }
        return result;
    }
}
