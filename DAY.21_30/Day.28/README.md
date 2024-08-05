# Day 28:
Question: Rotate List<br/>
Given the head of a linked list, rotate the list to the right by k places.<br/>

Example 1:<br/>
Input: head = [1,2,3,4,5], k = 2<br/>
Output: [4,5,1,2,3]<br/>

Example 2:<br/>
Input: head = [0,1,2], k = 4<br/>
Output: [2,0,1]
<br/>


Answer Approach:<br/>
For solving this question,<br/>
Firstly check,<br/>
If the list is empty, has one node, or if `k` is zero, return the original list.
Then traverse the list to find its length and locate the tail.<br/>
Reduce "k" to be within the range of the list length.<br/>
then after that find the node that will be the new tail after rotation.<br/>
Break the list at the new tail and reconnect it to the original head to form a circular list.<br/>
then at last return the node next to the new tail as the new head.<br/>

