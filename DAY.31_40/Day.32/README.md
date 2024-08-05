# Day 32:
Question: Merge Two Sorted Lists<br/>

You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.<br/>


Example 1:<br/>
Input: list1 = [1,2,4], list2 = [1,3,4]<br/>
Output: [1,1,2,3,4,4]<br/>

Example 2:<br/>
Input: list1 = [], list2 = []<br/>
Output: []<br/>

Example 3:<br/>
Input: list1 = [], list2 = [0]<br/>
Output: [0]<br/>


Answer Approach:<br/>
For solving this question,<br/>
Create a dummy node to serve as the starting point of the merged list. Also, initialize a current pointer to keep track of the last node added to the merged list.<br/>
Use a while loop to iterate through both input lists simultaneously. At each iteration, compare the values of the current nodes in list1 and list2.<br/>
If the value of the current node in list1 is less than or equal to the value of the current node in list2, append the current node of list1 to the merged list and move the list1 pointer to the next node.<br/>
Otherwise, if the value of the current node in list2 is less, append the current node of list2 to the merged list and move the list2 pointer to the next node.<br/>
Update the current pointer to point to the last node added to the merged list.<br/>
After exiting the loop, one of the input lists might still have remaining nodes then join these remaining nodes to the end of the merged list.<br/>
Return the next node after the dummy node, which represents the head of the merged list.<br/>
