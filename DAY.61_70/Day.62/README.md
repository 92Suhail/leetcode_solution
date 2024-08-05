# Day 62:
Question: Student Attendance Record |<br/>
You are given a string s representing an attendance record for a student where each character signifies whether the student was absent, late, or present on that day. The record only contains the following three characters:<br/>

'A': Absent.<br/>
'L': Late.<br/>
'P': Present.<br/>
The student is eligible for an attendance award if they meet both of the following criteria:<br/>

The student was absent ('A') for strictly fewer than 2 days total.<br/>
The student was never late ('L') for 3 or more consecutive days.<br/>
Return true if the student is eligible for an attendance award, or false otherwise.<br/>

 

Example 1:<br/>
Input: s = "PPALLP"<br/>
Output: true<br/>
Explanation: The student has fewer than 2 absences and was never late 3 or more consecutive days.<br/>

Example 2:<br/>
Input: s = "PPALLL"<br/>
Output: false<br/>
Explanation: The student was late 3 consecutive days in the last 3 days, so is not eligible for the award.<br/>


Answer Approach:<br/>
For solving this question,<br/>
Firstly iterates through the input string s character by character.<br/>
It keeps track of the count of absences (absentCount) and the count of consecutive late days (lateCount).<br/>
   - If the count of absences (absentCount) exceeds 2, return false immediately.<br/>
   - If the count of consecutive late days (lateCount) reaches 3 or more, it checks if the last three days were late. If so, returns false.<br/>
If the current character is not L, it resets the consecutive late count (lateCount) to 0.<br/>
If no violations are found after iterating through the entire string, it means the student is eligible for the award, so it returns true.