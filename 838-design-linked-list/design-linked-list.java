class MyLinkedList {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    ListNode head;

    public MyLinkedList() {
        head = null;
    }
    
    public int get(int index) {
        ListNode temp=head;
        for(int i=0;i<index;i++){
            if(temp==null) return -1;
            temp=temp.next;
        }
        if(temp==null) return -1;
        return temp.val;
    }
    
    public void addAtHead(int val) {
        ListNode x = new ListNode(val);
        x.next=head;
        head=x;
    }
    
    public void addAtTail(int val) {
        ListNode x = new ListNode(val);
        if(head==null) {
         head=x;
         return;   
        }
        //ListNode x = new ListNode(val);
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=x;
        temp=x;
    }
    
    public void addAtIndex(int index, int val) {
        if (index == 0) {
        addAtHead(val);
        return;
        }
        ListNode temp=head;
        for(int i=0;i<index-1;i++){
            if(temp==null){
                return;
            }
            temp=temp.next;
        }
        if(temp==null) return;
        ListNode temp2=temp.next;
        ListNode x = new ListNode(val);
        temp.next=x;
        x.next=temp2;

    }
    
    public void deleteAtIndex(int index) {

    if (head == null)
        return;

    if (index == 0) {
        head = head.next;
        return;
    }

    ListNode temp = head;

    for (int i = 0; i < index - 1; i++) {

        if (temp == null)
            return;

        temp = temp.next;
    }

    if (temp == null || temp.next == null)
        return;

    temp.next = temp.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */