package Assignment2;

public class ListNode{

    //public instance variable as there is nothign to "protect"
    public Object data;     //the contained data object
    public ListNode next;   //the self-reference

    //constructors
    public ListNode (Object newData, ListNode newNext){
        data= newData;
        next= newNext;
    }

    public ListNode (){
        data=null;
        next=null;
    }

}   //end class ListNode