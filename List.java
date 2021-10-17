package Assignment2;

public class List{
    protected ListNode firstNode;   //the first node
    protected ListNode lastNode;    //the last node
    protected String name;          //a string name

    public void insertAtFront(Object newData){  //insert Object at front
        if(firstNode==null) //empty list
            firstNode = lastNode = new ListNode(newData, null);
        else{
            ListNode newFirstNode = new ListNode(newData, firstNode);
            firstNode = newFirstNode;
        }
    }   //end insertAtFront method

    public void insertAtBack (Object newData){  //insert Object at back
        if (firstNode==null)    //empty list
            firstNode = lastNode = new ListNode(newData,null);
        else{
            ListNode newLastNode = new ListNode(newData,null);
            lastNode.next = newLastNode;
            lastNode = newLastNode;
        }
    }   //end insertAtBack method

    public Object removeFromFront(){    //reemove Object from front
        if (firstNode == null)  //empty list
            return null;
        
        Object removedData = firstNode.data;

        if (firstNode == lastNode)  //only one list node
            firstNode = lastNode = null;
        else
            firstNode=firstNode.next;
        
        return removedData;
    }   //end removeFromFront method

    public Object removeFromBack(){ //remove object from back
        if(firstNode == null)   //empty list
            return null;
        
        Object removedData = lastNode.data;
        if(firstNode == lastNode)   //only one node in the list
            firstNode=lastNode=null;
        else{
            ListNode current = firstNode;
            while(current.next != lastNode)
                current=current.next;
            lastNode=current;
            current.next = null;
        }

        return removedData;
    }   //end removeFromBack method


    //getFirst allows one to get a "handle" to navigate through the list in a loop
    public ListNode getFirst(){
        return firstNode;
    }

    @Override
    public String toString(){
        String output = new String();
        ListNode current = firstNode;

        output = name + ":";
        while (current != null){
            //we are implicitly calling the data object toString method
            output += " " + current.data;
            current = current.next;
        }
        return output;
    }

    //constructors
    public List (String listName){ 
        firstNode = lastNode = null;
        name = listName;
    }
    
    public List(){
        this("List");
    }

}   //end class List