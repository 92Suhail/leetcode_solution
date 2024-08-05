# Day 42:
Question: Remove Nth Node From End of List<br/>
Given the head of a linked list, remove the nth node from the end of the list and return its head.<br/>


Example 1:<br/>
Input: head = [1,2,3,4,5], n = 2<br/>
Output: [1,2,3,5]<br/>

Example 2:<br/>
Input: head = [1], n = 1<br/>
Output: []<br/>

Example 3:<br/>
Input: head = [1,2], n = 1<br/>
Output: [1]<br/>

Answer Approach:<br/>
For solving this question,<br/>
Firstly creating a dummy node and set its next to the head of the linked list (Because of handle edge cases where the head itself needs to be removed). <br/>
Then initialising two pointers, `first` and `second`, both pointing to the dummy node initially. Move the `second` pointer ahead by `n+1` steps. Move both `first` and `second` pointers simultaneously until `second` reaches the end of the list.<br/>
Now, `first` is at the (n-1)th node from the end. Remove the nth node by updating `first.next` to `first.next.next`.
Then at last return `dummy.next`, which is the modified head of the list after removal.

