# Day 82:
Question: Subsets ||<br/>
Given an integer array nums that may contain duplicates, return all possible 
subsets (the power set).<br/>
The solution set must not contain duplicate subsets. Return the solution in any order.<br/>

 
Example 1:<br/>
Input: nums = [1,2,2]<br/>
Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]<br/>

Example 2:<br/>
Input: nums = [0]<br/>
Output: [[],[0]]<br/>


Answer Approach:<br/>
For solving this question, (Using bit manipulation approach)<br/>
Firstly starting with a set to generate all unique subsets of an integer array nums, which may contain duplicates. It begins by sorting nums to facilitate handling duplicates. <br/>
Then iterating through all possible subsets represented by bitmasks from 0 to 2^n - 1, where n is the length of nums, each subset is constructed by checking each bit of the bitmask to determine inclusion of elements from nums. We create HashSet<List<Integer>> ensures duplicates are avoided, and the resulting subsets are stored. Finally, the set is converted to a list and returned.<br/>
