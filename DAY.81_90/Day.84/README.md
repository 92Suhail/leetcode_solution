# Day 84:
Question: Reverse Nodes in k-Groups<br/>
Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.<br/>

k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.<br/>

You may not alter the values in the list's nodes, only nodes themselves may be changed.<br/>

Example 1:<br/>
Input: head = [1,2,3,4,5], k = 2<br/>
Output: [2,1,4,3,5]<br/>

Example 2:<br/>
Input: head = [1,2,3,4,5], k = 3<br/>
Output: [3,2,1,4,5]<br/>
 


For solving this question,<br/>
Firstly initialize a dummy node pointing to the head to simplify edge cases and use pointers curr, nex, and pre initialized to this dummy. <br/>
We first traverse the list to count the total number of nodes. Then, while there are at least k nodes remaining, we set curr to the start of the current group and nex to the next node, and reverse the nodes in the group by adjusting pointers such that each node in the group (except the first) is moved to the front. After reversing, pre is moved to the end of the reversed group, and the node count is decremented by k. Finally, we return dummy.next, which points to the new head of the modified list.<br/>