# Day: 96
Question: Insertion Sort List<br/>
Given the head of a singly linked list, sort the list using insertion sort, and return the sorted list's head.<br/>
The steps of the insertion sort algorithm:<br/>
Insertion sort iterates, consuming one input element each repetition and growing a sorted output list.<br/>
At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the sorted list and inserts it there.<br/>
It repeats until no input elements remain.<br/>
The following is a graphical example of the insertion sort algorithm. The partially sorted list (black) initially contains only the first element in the list. One element (red) is removed from the input data and inserted in-place into the sorted list with each iteration.<br/>



Example 1:<br/>
Input: head = [4,2,1,3]<br/>
Output: [1,2,3,4]<br/>

Example 2:<br/>
Input: head = [-1,5,3,4,0]<br/>
Output: [-1,0,3,4,5]
 <br/>
 
Answer Approach:<br/>
For solving this question,<br/>
Firstly we initialized a dummy node to serve as the head of the sorted portion of the list.<br/>
Then traverse the original list node by node. For each node, we determine its correct position in the already sorted part of the list.<br/>
we compare its value with the values in the sorted list and insert it in the appropriate position to maintain the sorted order.<br/>
After placing each node, we move to the next node in the original list and repeat the process.
Once all nodes are processed, the sorted list is returned.
<br/>
