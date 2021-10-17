package Assignment2;
import java.util.*;


public class IntStrOrderedListTest{
    
    //Global data declaration   
    static Scanner input = new Scanner(System.in);          //input
    static Scanner stringInput = new Scanner(System.in);    //string input 
    static int dataType = 0;                                //So we know if the user wants to insert 1.Integer or 2.String and for other values, the program will exit
    public static IntegerOrderedList intList = new IntegerOrderedList("IntegerList");
    public static StringOrderedList stringList = new StringOrderedList("StringList");
    static String newStringData, remStringData;
    static int newData,remData;
    static boolean runOrNot = false;

     static class IntegerOrderedList extends OrderedList{


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
    
            this("Integer Ordered List");
        }
        
    
    
    
    }   //end IntegerOrderedList class

    public static class StringOrderedList extends OrderedList{

        protected int compare(Object obj1, Object obj2){
    
            int l1 = ((String) obj1).length();
            int l2 = ((String) obj2).length();
            int lmin = Math.min(l1,l2);
    
            for(int i=0; i< lmin; i++ )
            {
                int obj1_ch = (int)((String)obj1).charAt(i);
                int obj2_ch = (int)((String)obj2).charAt(i);

                if(obj1_ch != obj2_ch){
                    return obj1_ch - obj2_ch;
                }
            }   //end for loop
    
            //Edge case for String that contain one another
            if(l1!=l2){
                return l1 - l2;
            }
            else{
                return 0;
            }

        }   //end compare method
    
        //constructors
        public StringOrderedList(String listName){
    
            firstNode=lastNode=null;
            name = listName;
        }
        
        public StringOrderedList(){
    
            this("String Ordered List");
        }
    
    }   //end StringOrderedList class

    public static void main(String[] args) {

        while(dataType<3)
        {
            System.out.println("Which type of data would you like to introduce?");
            System.out.println("1.Integer or 2.String\n");
            dataType = input.nextInt();
            if(dataType == 1){      //Integer user menu
                int option = 0;
                if(intList.firstNode == null)
                {
                    System.out.println("List is empty, please insert first number: ");
                    newData = input.nextInt();
                    intList.insert(newData);
                    runOrNot = false;
                    ;
                }
                else{
                    runOrNot=true;
                    System.out.println("What would you like to do?");
                    System.out.println("1.Find a number in list.\n2.Insert a number in list\n3.Remove a number from the list.\n4.Print integer list.\n5.Change data type.\n6.Exit");
                    option=input.nextInt();
                    
                }
                if(runOrNot == true){
                    switch(option){
                        case 1: //find
                            System.out.println("Number to be found");
                            newData = input.nextInt();
                            ListNode x = intList.find(newData);
                            if(x==null){
                                System.out.println("Number is not in the list.\n");
                            }
                            else{
                                System.out.println("Number found in the list: "+newData+"\n");
                            }
                            break;
                        case 2: //insert
                            System.out.println("Number to be inserted: ");
                            newData = input.nextInt();
                            if(intList.insert(newData)){
                                System.out.println("Number inserted succesfuly!\n");
                            }
                            else{
                                System.out.println("Number is already in list.\n");
                            }
                            break;  
                        case 3: //remove
                            System.out.println("Number to be removed: ");
                            remData=input.nextInt();
                            if(intList.remove(remData)!= null)
                            {
                                System.out.println(remData+" removed from list\n");
                            }
                            else{
                                System.out.println("Number is not in the list\n");
                            }
                            break;
                        case 4: //print
                            System.out.println(intList.toString());
                            break;
                        case 5: //oh switch, go back (change data type)
                            option = 0;
                            dataType = 0;
                            break;
                        case 6: //exit
                            dataType = 3;
                            break;
                        default: 
                            System.out.println("Please insert a number from 1 to 6.");
                            break;
                            
                    }   //end of switch statement
                }   //end of while statement
                //runOrNot = true;

            }   //end of Integer user menu
            else if(dataType == 2){ //String user menu
                int option = 0;
                //Scanner stringInput = new Scanner(System.in);
                if(stringList.firstNode == null){
                    System.out.println("List empty. Please insert first String: ");
                    newStringData = stringInput.next();
                    //stringInput.nextLine();
                    stringList.insert(newStringData);
                    runOrNot = false;
                }
                else{
                    runOrNot=true;
                    System.out.println("What would you like to do?");
                    System.out.println("1.Find a String in list.\n2.Insert a String in list\n3.Remove a String from the list.\n4.Print String list.\n5.Change data type.\n6.Exit");
                    option=input.nextInt();
                }
                if(runOrNot == true){
                    switch(option){
                        case 1: //find
                            System.out.println("String to be found");
                            newStringData = stringInput.next();
                            //stringInput.nextLine();
                            ListNode x = stringList.find(newStringData);
                            if(x==null){
                                System.out.println("String is not in the list.\n");
                            }
                            else{
                                System.out.println("String found in the list: "+ newStringData +"\n");
                            }
                            break;
                        case 2: //insert
                            System.out.println("String to be inserted: ");
                            newStringData = stringInput.next();
                            //stringInput.nextLine();
                            if(stringList.insert(newStringData)){
                                System.out.println("String inserted succesfuly!\n");
                            }
                            else{
                                System.out.println("String is already in list.\n");
                            }
                            break;
                        case 3: //remove
                            System.out.println("String to be removed: ");
                            remStringData=stringInput.next();
                            //stringInput.nextLine();
                            if(stringList.remove(remData)!= null)
                            {
                                System.out.println(remData+" removed from list\n");
                            }
                            else{
                                System.out.println("String is not in the list");
                            }
                            break;
                        case 4: //print
                            System.out.println(stringList.toString());
                        case 5: //oh switch, go back (change data type)
                            option = 0;
                            dataType = 0;
                            break;
                        case 6: //exit
                            dataType = 3;
                            break;
                        default: System.out.println("Please insert a number from 1 to 6.");
                    }   //end of switch statement

                }   //end of while statement
                //runOrNot = true;
                
            }   //end pf String user menu
            
        }   //end of while loop 
        
    }   //end main method
}   //end IntStrOrderedListTest class