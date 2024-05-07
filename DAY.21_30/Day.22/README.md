# Day 22
Question: Roman to Integer
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.
 

Example 1:
Input: s = "III"
Output: 3
Explanation: III = 3.

Example 2:
Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.

Example 3:
Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.


Answer Approach:
For solving this question,
We define two arrays,
First one -> cs, containing the Roman numeral characters in the order "IVXLCDM".
Second one -> vs, containing the corresponding integer values {1, 5, 10, 50, 100, 500, 1000}.
It initializes a HashMap d to store the mapping between each Roman numeral character and its integer value.
It iterates through the cs array and populates the HashMap d with the character-value pairs.
It initializes an integer variable ans to store the result and sets it to the integer value corresponding to the last character of the input string s.
It iterates through the characters of the input string s, except for the last character.
For each character at index i, it compares its value with the value of the next character.
If the value of the current character is less than the value of the next character, it subtracts the current value from the result (ans) by multiplying it with -1. Otherwise, it adds the current value to the result.
Finally, it returns the computed integer value ans.