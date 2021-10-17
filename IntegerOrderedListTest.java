package Assignment2;
import java.util.*;

public class IntegerOrderedListTest {

    public static int getOption(Scanner input){
        int optionNo =  input.nextInt();
        return optionNo;
    }

    public static int getData(Scanner input){
        int intData = input.nextInt();
        return intData;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int option =0;
        IntegerOrderedList IntList = new IntegerOrderedList();

        Integer newData, remData;

        //IntList.insertAtFront(10);


        while(option !=5){

            if(IntList.firstNode == null){
                System.out.println("List is empty. Please insert an object first: ");
                newData = getData(input);
                IntList.insert(newData);
                System.out.println("Number inserted succesfuly! \n");
            }   

            System.out.println("1.Find, 2.Insert, 3.Remove, 4.Print list or 5.Exit?");
            option = getOption(input);

            if(option == 1){
                System.out.println("Number to be found");
                newData = getData(input);
                ListNode x = IntList.find(newData);
                if(x==null){
                    System.out.println("Number not in the list.\n");
                }
                
            }
            else if(option == 2){
                System.out.println("Number to be inserted: ");
                newData = getData(input);
                if(IntList.insert(newData)){
                    System.out.println("Number inserted succesfuly!\n");
                }
                else{
                    System.out.println("Number already in list.");
                }
            }
            else if(option == 3){
                System.out.println("Number to be removed: ");
                remData=getData(input);
                if(IntList.remove(remData)!= null)
                {
                    System.out.println(remData+" removed from list\n");
                }
                else{
                    System.out.println("Number is not in the list");
                }
            }
            else if(option == 4){
                System.out.println(IntList.toString());
            }
        }
        
    }


}