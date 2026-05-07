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
    public ListNode partition(ListNode head, int x) {
        ListNode temp = head;
        int size=0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        temp = head;
        while(temp != null){
            if(temp.val < x){
                arr1.add(temp.val);
            } else{
                arr2.add(temp.val);
            }
            temp = temp.next;
        }
        ListNode newhead = new ListNode(0);
        ListNode temp1 = newhead;
        int i=0;
        while(i<arr1.size()){
            temp1.next = new ListNode(arr1.get(i));
            temp1 = temp1.next;
            i++;
        }
        int j=0;
        while(j<arr2.size()){
            temp1.next = new ListNode(arr2.get(j));
            temp1 = temp1.next;
            j++;
        }
        
        return newhead.next;
    }
}