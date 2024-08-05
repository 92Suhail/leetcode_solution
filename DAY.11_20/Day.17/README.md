# Day 17:
Question: Swap Nodes in Pairs<br/>

Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)<br/>

Example 1:<br/>
Input: head = [1,2,3,4]<br/>
Output: [2,1,4,3]<br/>

Example 2:<br/>
Input: head = []<br/>
Output: []<br/>

Example 3:<br/>
Input: head = [1]<br/>
Output: [1]<br/>

Answer Approach:<br/>
Creating a dummy node dummy with value 0, pointing to the head of the linked list. This dummy node helps handle edge cases where the head itself needs to be swapped.<br/>

Initialize three pointers pre, cur, and t. pre points to the dummy node, cur points to the current node (initially the head), and t points to the next node of cur.<br/>

Swap Pairs: We loop through the list until we reach the end or the node we are currently on (cur) and its next node (cur.next) are both not null. Inside the loop:<br/>
a. We swap the positions of cur and t by adjusting their next pointers.<br/>
b. We adjust the next pointer of the previous node (pre) to point to t.<br/>
c. Update pre, cur, and t pointers for the next iteration.<br/>

Return Result: Once the loop is done, we return the next node of the dummy node, which is the new head of the modified linked list.<br/>
