# DAY 2
Question:
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example 1:
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:
Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]

Answer approach:
For solving this problem,
I built a new Linked list (result) for storing the addition result of two input linked lists who elements has to be added.
Both linked lists pointer l1 and l2 are pointing to the first element of their respective linked list and for result linked list there is a "curr" pointer for pointing first element.

In addition operation,
I create a carry variable if sum of the element is came in two digit.
Then adding the first element of first linked list with first element of second linked list, then doing (sum%10) for extracting their 1st single digit and after that store the result of (sum/10) in carry variable (for storing the 10th position digit). After that we update the all pointer to tyhe next one. for next addition we add carry variable value also in elements sum.
Do the above operations until l1=null or l2=null or carry=0.

After addition operation, we return the result linked list.