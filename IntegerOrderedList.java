package Assignment2;

public class IntegerOrderedList extends OrderedList{


    protected int compare(Object obj1,Object obj2){
    
        if( ((Integer) obj1).intValue() < ((Integer) obj2).intValue()){
            return -1;
        }
        else if(((Integer) obj1).intValue() > ((Integer)obj2).intValue()){
            return 1;
        }
        else return 0;

    }   //end Integer compare method
    

    //constructors 
    public IntegerOrderedList (String listName){

        firstNode=lastNode = null;
        name = listName;
        
    }
    public IntegerOrderedList(){

        this("IntegerOrderedList");
    }
    



}   //end IntegerOrderedList class

