# Day 71:
Question: Combination Sum ||<br/>
Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.<br/>

Each number in candidates may only be used once in the combination.<br/>

Note: The solution set must not contain duplicate combinations.<br/>

 

Example 1:<br/>
Input: candidates = [10,1,2,7,6,1,5], target = 8<br/>
Output: <br/>
[<br/>
[1,1,6],<br/><br/>
[1,2,5],<br/>
[1,7],<br/>
[2,6]<br/>
]<br/>

Example 2:<br/>
Input: candidates = [2,5,2,1,2], target = 5<br/>
Output: <br/>
[<br/>
[1,2,2],<br/>
[5]<br/>
]<br/>


Answer Approach:<br/>
For solving this question, (Using backtracking approach)<br/>
Firstly sorting the candidates array to avoid duplicates, then we apply backtrack function. The function adds the current candidate to the tempList and recursively calls itself with the updated parameters. If the remaining sum is less than 0, it returns; if it's 0, it adds a copy of tempList to the result list. After the recursive call, it removes the last element from tempList to backtrack.<br/>

