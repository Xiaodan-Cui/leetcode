/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    int len = 0;
    Random rand = new Random();
    ListNode head;
    public Solution(ListNode head) {
        this.head = head;
        ListNode pointer = head;
        while(pointer != null){
            len++;
            pointer = pointer.next;
        }
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        int randNum = rand.nextInt(len);
        ListNode pointer = head;
        for(int i = 0; i < randNum; i++){
            pointer = pointer.next;
        }
        return pointer.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */