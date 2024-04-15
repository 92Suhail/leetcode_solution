# Day 18:
Question: 3Sum Closest<br/>
Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.<br/>
Return the sum of the three integers.<br/>
You may assume that each input would have exactly one solution.<br/>

Example 1:<br/>
Input: nums = [-1,2,1,-4], target = 1<br/>
Output: 2<br/>
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).<br/>

Example 2:<br/>
Input: nums = [0,0,0], target = 1<br/>
Output: 0<br/>
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).<br/>

Answer Approach:<br/>
Firstly sort the input array nums. <br/>
Initialise ans variable to a large positive number (1 << 30 is equivalent to 2^30), which will store the closest sum found so far.<br/>
Iterates through each element of the sorted array nums using a for loop.<br/>
Inside the loop, two pointers j and k are used to find two other numbers such that their sum with nums[i] is closest to the target. Pointer j starts from the element next to i, and pointer k starts from the end of the array.<br/>
Calculate the Current Sum using variable t which stores the sum of nums[i], nums[j], and nums[k].<br/>
If the current sum t equals the target, it means we have found an exact match, so we return t.<br/>
If the current sum t is closer to the target than the previous closest sum stored in ans, we update ans to t.<br/>
Depending on whether t is greater or less than the target, we adjust the pointers j and k to move towards the target sum.<br/>
After the loop completes, we return the closest sum found, stored in ans.<br/>