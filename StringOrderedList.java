package Assignment2;

public class StringOrderedList extends OrderedList{

    protected int compare(Object obj1, Object obj2){

        String x = "";
        String y = "";
        x=(String) obj1;
        y=(String) obj2;

        for(int i=0; i<Math.min(x.length(),y.length()); i++ )
        {
            if(x.charAt(i) < y.charAt(i))
            {
                return -1;
            }
            else if (x.charAt(i) > y.charAt(i))
            {
                return 1;
            }
        }   //end for loop

        if(x.length() == y.length()){
            return 0;
        }
        else if(x.length() > y.length()){
            return 1;
        }
        else return -1;

    }   //end compare method

    //constructors
    public StringOrderedList(String listName){

        firstNode=lastNode=null;
        name = listName;
    }
    
    public StringOrderedList(){

        this("StringOrderedList");
    }

}   //end StringOrderedList class