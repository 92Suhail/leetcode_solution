# Day 35:
Question : Search Insert Position<br/>
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.<br/>

You must write an algorithm with O(log n) runtime complexity.<br/>

 
Example 1:<br/>
Input: nums = [1,3,5,6], target = 5<br/>
Output: 2<br/>

Example 2:<br/>
Input: nums = [1,3,5,6], target = 2<br/>
Output: 1<br/>

Example 3:<br/>
Input: nums = [1,3,5,6], target = 7<br/>
Output: 4<br/>

Answer Approach:<br/>
For Solving this question,<br/>
Firstly we utilizes binary search to find the target or determine its insertion point.<br/>
then after Initializes pointers `left` and `right` to mark the search range.<br/>
Continues searching while `left` is less than or equal to `right`.<br/>
Calculates the midpoint index to split the search range.<br/>
Compares element at `mid` with target:<br/>
   - If equal, returns `mid`.<br/>
   - If less, updates `left`.<br/>
   - If greater, updates `right`.<br/>
If not found, returns `left` as insertion point.<br/>