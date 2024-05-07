# Day 29:
Question: Letter Combinations of a Phone Number<br/>
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.<br/>

A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.<br/>

Example 1:<br/>
Input: digits = "23"<br/>
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]<br/>

Example 2:<br/>
Input: digits = ""<br/>
Output: []<br/>

Example 3:<br/>
Input: digits = "2"<br/>
Output: ["a","b","c"]<br/>

Answer Approach:<br/>
For solving this question,<br/>
Firstly define a mapping where each digit from 2 to 9 is associated with the corresponding letters on a telephone keypad. Then after that using a recursive backtracking approach to generate all possible combinations efficiently.<br/>
Check for Base case: If the index reaches the length of the input string `digits`, add the current combination to the result list and return.<br/>
Then using backtracking method, For each digit, get the associated letters.<br/>
Iterate through each letter, append it to the current combination, recursively call the method with updated combination and index, and then backtrack by removing the last character from the combination.<br/>
After all recursive calls, the result list contains all possible combinations of letters corresponding to the input digits.<br/>