# Day 39:
Question:  Climbing Stairs<br/>
You are climbing a staircase. It takes n steps to reach the top.<br/>

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?<br/>

 

Example 1:<br/>
Input: n = 2<br/>
Output: 2<br/>
Explanation: There are two ways to climb to the top.<br/>
1. 1 step + 1 step<br/>
2. 2 steps<br/>

Example 2:<br/>
Input: n = 3<br/>
Output: 3<br/>
Explanation: There are three ways to climb to the top.<br/>
1. 1 step + 1 step + 1 step<br/>
2. 1 step + 2 steps<br/>
3. 2 steps + 1 step<br/>

Answer Approach:<br/>
For solving this question,<br/>
Firstly check, If there's only one step (`n = 1`), there's only one way to climb it. If there are two steps (`n = 2`), there are two ways to climb it (either by taking one step at a time or by taking two steps at once).<br/>
We use an array `dp` to store the number of ways to climb to each step. We initialize `dp[1]` to 1 and `dp[2]` to 2 (let say base cases).<br/>
Starting from the third step (`i = 3`), we calculate the number of ways to reach the `i-th` step by summing up the number of ways to reach the `(i-1)-th` step and the `(i-2)-th` step. This is because from the `(i-1)-th` step, we can take one step to reach the `i-th` step, and from the `(i-2)-th` step, we can take two steps to reach the `i-th` step.<br/>
Finally, we return `dp[n]`, which represents the number of distinct ways to climb to the top of the staircase with `n` steps.<br/>

