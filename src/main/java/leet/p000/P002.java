package leet.p000;

public class P002 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        
        ListNode prev = new ListNode(0);
        ListNode temp = prev;
        
        int carry = 0;
        
        while(l1 != null || l2 != null || carry != 0) {
            
            int a = l1 == null?0:l1.val;
            int b = l2 == null?0:l2.val;
            
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
            
            if((a+b+carry)>=10){
            	temp.next = new ListNode(a+b+carry-10);
                carry = 1;
            }else{
            	temp.next = new ListNode(a+b+carry);
                carry = 0;
            }        
            temp = temp.next;
            
        }
        
        return prev.next;
        
    }
	
	public static void main(String[] args) {
		
		P002 p02 = new P002();
		
		ListNode l1 = new ListNode(7);
		l1.next = new ListNode(9);
		
		ListNode l2 = new ListNode(3);
		l2.next = new ListNode(5);

		
		ListNode result = p02.addTwoNumbers(l1, l2);
		
		while(result != null) {
			System.out.print(result.val);
			result = result.next;
		}

	}

}

 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
