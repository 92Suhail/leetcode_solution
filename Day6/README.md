#DAY 6:<br/>
Question:
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.<br/>
Notice that the solution set must not contain duplicate triplets.

 <br/>

Example 1:
Input: nums = [-1,0,1,2,-1,-4]<br/>
Output: [[-1,-1,2],[-1,0,1]]<br/>
Explanation: <br/>
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.<br/>
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.<br/>
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.<br/>
The distinct triplets are [-1,0,1] and [-1,-1,2].<br/>
Notice that the order of the output and the order of the triplets does not matter.<br/>

Example 2:<br/>
Input: nums = [0,1,1]<br/>
Output: []<br/>
Explanation: The only possible triplet does not sum up to 0.<br/>

Example 3:<br/>
Input: nums = [0,0,0]<br/>
Output: [[0,0,0]]<br/>
Explanation: The only possible triplet sums up to 0.<br/>


Answer Approach:<br/>
For solving this question,<br/>
Create a Arraylist for storing triplets.
It first checks if the number of elements in the array is less than 3 or not, if it less than 3 then return empty list and if not then do rest operation.
Sort the array using Array inbuilt method.
Then traverse the sorted array,
Along with traversing inside loop, use two pointer "left and right".
Left is start traversing from first element of array toward last element and right is traversing from last element to first element.<br/>
then inside loop run another loop:<br/>
While left <right, then
checking if the sum of the current nums[left] and nums[right] is less than, greater than, or equal to the target (which is the negative of nums[i]).
If the sum is less than the target, it means we need to increase the sum, so we move left pointer to the right.
If the sum is greater than the target, it means we need to decrease the sum, so we move right pointer to the left.
If the sum is equal to the target, it means we found a triplet. We add this triplet to the result, and then skip any duplicates of nums[left] and nums[right] (since the array is sorted).<br/>
After that, we move both left and right pointers to continue searching for more triplets.
The process continues until left and right meet each other.
