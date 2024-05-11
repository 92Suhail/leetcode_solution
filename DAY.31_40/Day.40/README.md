# Day 40:
Question: Remove Duplicates from Sorted List<br/>
Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.<br/>
 
Example 1:<br/>
Input: head = [1,1,2]<br/>
Output: [1,2]<br/>

Example 2:<br/>
Input: head = [1,1,2,3,3]<br/>
Output: [1,2,3]<br/>


Answer Approach:<br/>
For solving this question,<br/>
Firstly start with two pointers, `current` and `next`, both initially pointing to the head of the linked list.
Traverse the linked list until the `current` pointer reaches the end of the list or the `next` pointer reaches the end of the list. <br/>
At each step, compare the value of the current node with the value of the next node. 
If the values are equal, it means there's a duplicate. Skip the next node by setting `current.next` to `current.next.next`.
If no duplicate is found, move both pointers to the next node.
Repeat this until either `current` or `next` reaches the end of the list.<br/>
At last, return the head of the modified linked list.

