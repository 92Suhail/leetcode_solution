# DAY 1
Question:
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]


Answer:
Approach 1:
For solving this problem,
I created a function Which takes input array and target sum and give output a array.
In my function firstly i traverse the array using two index pointer i and j (using two loops), then check their respective element sum is equals to target sum or not.
if it equals to target sum, then it return the indexes of the elements whose sum is equal to the target sum.
Indexes are return in the form of new array.


Approach 2:
For solving this problem (Using Hashmap in Java),
I created a function Which takes input array and target sum and gives output a array.
In my function firstly i created  Hashmap, then I traverse the input array using One loop .
In loop:
(Whereas, 1st element of array + 2nd element of array =target sum)
I created variable who is equal to [target - array element(let we say 1st element)]. Therefore, variable is giving the 2nd element of array . So now we compare this variable value using Hashmap.
In Hashmap:
Put the array elements in the Hashmap one by one by checking if variable values is equals to Hashmap element or not.
if equals then we return the indexes of element whose sum is equals to target sum in the form of new array.