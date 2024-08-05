# Day 46:
Question: Remove Linked List Elements<br/>
Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
<br/>
 
Example 1:<br/>
Input: head = [1,2,6,3,4,5,6], val = 6<br/>
Output: [1,2,3,4,5]<br/>

Example 2:<br/>
Input: head = [], val = 1<br/>
Output: []<br/>

Example 3:<br/>
Input: head = [7,7,7,7], val = 7<br/>
Output: []<br/>


Answer Approach:<br/>
For solving this question,<br/>
Check if the head node itself needs to be removed. If so, skip all consecutive nodes with the same value as `val` until a node with a different value or `null` is encountered.<br/>
Traverse the linked list while keeping track of the current node and its next node. If the value of the next node matches `val`, skip it by updating the `next` pointer of the current node to point to the node after the next one.
Once the traversal is complete, return the updated head of the linked list, which may have changed if the original head was removed.<br/>
Along with this approach confirms that all nodes with the given value are removed from the linked list while maintaining the order of other nodes.

