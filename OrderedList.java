package Assignment2;

abstract class OrderedList extends List{

    protected abstract int compare(Object obj1, Object obj2);

    public ListNode find(Object newData){

        ListNode current = firstNode;
        
        if(firstNode == null)
        {
            return null;
        }
        while(current != null)
        {
            if(compare(newData, current.data) == 0){

                return current;
            }
            current = current.next;
        }
        return null;

    }   //end find method

    public boolean insert(Object newData){

        ListNode current = firstNode;
        ListNode last = new ListNode(null,current);

        if(firstNode == null){

            firstNode=new ListNode(newData,null);
            return true;
            
        }

        if(find(newData) != null){
            return false;
        }

        while(current != null){

            if(compare(newData, current.data) < 0){

                
                if(current == firstNode){
                    ListNode newDataNode = new ListNode(newData, firstNode);
                    firstNode = newDataNode;
                    return true;
                }
                ListNode newDataNode = new ListNode(newData, current);
                last.next = newDataNode;
                return true;
                
            }

            last = current;
            current = current.next;

        }

        //insert at back
        ListNode newDataNode = new ListNode(newData, null);
        last.next = newDataNode;
        return true;

    }   //end insert method

    public ListNode remove(Object remData) {

        ListNode removedDataNode = new ListNode(remData, null);

        if(find(remData) == null){
            return null;
        }

        if(firstNode.next == null){
            firstNode = null;
            return removedDataNode;
        }
        if(compare(remData,firstNode.data) == 0){
            firstNode = firstNode.next;
            return removedDataNode;
        }

        else{
            ListNode current = firstNode;
            ListNode last = new ListNode(null,current);
            
            while(current != null){

                if(compare(remData, current.data)==0){
                    last.next = current.next;
                    return removedDataNode;
                }
                last = current;
                current=current.next;
            }
        }
        return null;
        
    }   //end remove method

    @Override
    public void insertAtBack(Object newData) {
        System.out.println("This method should not be used.");
    }   //end isertAtBack supression

    @Override
    public void insertAtFront(Object newData) {
        System.out.println("This method should not be used.");
    }   //end insertAtFront supression

}   //end OrderedList class