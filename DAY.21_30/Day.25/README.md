# Day 25:
Question: Remove Element<br/>
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.<br/>

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:<br/>

- Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.<br/>
- Return k.<br/>


Example 1:<br/>
Input: nums = [3,2,2,3], val = 3<br/>
Output: 2, nums = [2,2,_,_]<br/>
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).<br/>

Example 2:<br/>
Input: nums = [0,1,2,2,3,0,4,2], val = 2<br/>
Output: 5, nums = [0,1,4,0,3,_,_,_]<br/>
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.<br/>
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).<br/>

Answer Approach:<br/>
For solving this question:<br/>
Firstly using a function "removeElement" which takes two parameters integer array and value. It returns an integer, representing the length of the modified array after removing all occurrences of `val`.<br/>
In function,<br/>
Initialize a variable `k` to keep track of the current index where non-`val` elements are to be stored.<br/>
then next,<br/>
Iterate through each element `x` in the input array `nums`.<br/>
Then we should remove the target element by performing below opreations:<br/>
- Check if the current element `x` is not equal to the target value `val`.<br/>
- If `x` is not equal to `val`, it means it's a value to be retained.<br/>
- In that case, assign `x` to the `k-th` position in the array `nums` and increment `k`.<br/>
- This effectively removes occurrences of `val` from the array.<br/>

After iterating through the entire array, the value of `k` represents the length of the modified array where all occurrences of `val` are removed.<br/>
then at last return value of k.<br/>
