# Day 77:
Question: Container With Most Water<br/>
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).<br/>

Find two lines that together with the x-axis form a container, such that the container contains the most water.<br/>

Return the maximum amount of water a container can store.
<br/>
Notice that you may not slant the container.<br/>

 

Example 1:<br/>
Input: height = [1,8,6,2,5,4,8,3,7]<br/>
Output: 49<br/>
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.<br/>

Example 2:<br/>
Input: height = [1,1]<br/>
Output: 1<br/>



Answer Approach:<br/>
For solving this question,<br/>
Firstly initialize two pointers left and right at the beginning and end of the array respectively. Use these pointers to compute the current water trapped between the lines as min(height[left], height[right]) * (right - left), updating a maxWater variable with the maximum found so far. Move the pointer pointing to the shorter line towards the center in each iteration, as moving the pointer of the taller line wouldn't increase the area and might decrease it. Continue this until the pointers meet, returning the maxWater as the result.<br/>
