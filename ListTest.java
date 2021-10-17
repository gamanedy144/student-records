package Assignment2;

public class ListTest{

    public static void main(String[] args) {
        List list = new List();

        list.insertAtFront(new Integer(2));
        list.insertAtBack(new Integer(-1));
        list.insertAtBack(new Integer(9));
        list.insertAtBack(new Integer(5));
        System.out.println(list);

        Object removedData = list.removeFromFront();
        System.out.println("removed data is: " + removedData);

        removedData=list.removeFromBack();
        //we know removedData is of class Integer so
        //we "downcast" a superclass (Object) to a sublcass (Integer)
        Integer i = (Integer) removedData;
        System.out.println("removed data is : " + i);

        System.out.println(list);
    }

}   //end class ListTest