# Day 24:
Question: Generate Parentheses<br/>
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.<br/>

Example 1:<br/>
Input: n = 3<br/>
Output: ["((()))","(()())","(())()","()(())","()()()"]<br/>

Example 2:<br/>
Input: n = 1<br/>
Output: ["()"]<br/>

Answer Approach:<br/>
For solving this question,<br/>
Firstly intialise an arraylist ans to store the generated valid parenthesis combinations.<br/>
and let n is the parameter representing the number of pairs of parentheses to be generated.
Next we built a method named generateParenthesis(). This method is working as entry point of the algorithm and inside method we initializes n and starts the Depth-First Search (DFS) from an empty string.<br/>
Next we built dfs() method:<br/>
It takes three parameters:<br/>
l: the count of left parentheses added so far.<br/>
r: the count of right parentheses added so far.<br/>
t: the current string representing the combination.<br/>
The base cases are:<br/>
If l or r exceed n, or if l becomes less than r, it indicates an invalid combination, so the recursion stops.<br/>
If both l and r reach n, it means a valid combination of parentheses is found. It adds this combination to the ans list.<br/>
The method recursively calls itself with two possibilities:<br/>
Adding a left parenthesis and incrementing l.<br/>
Adding a right parenthesis and incrementing r.<br/>

After the DFS completes, the method returns the list of valid parenthesis combinations stored in ans.<br/>