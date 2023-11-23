/*
* plz submit in the form of a single .java file
*rename the public class as <session_programme_regno> e.g FA19_BCE_002
*rename the file same as the name of public class e.g FA19_BCE_002.java
* file should be compilable (remove package name before submitting as is this file) 
*/ 
public class Sessional1{
    public static void main(String arg[]){

         Linked_List list = new Linked_List();
         
        list.addAtStart(1);
        list.addAtStart(2);
        list.addAtStart(3);
         list.printList();
         
         System.out.println(" ");
        

        list.printList();

    }

static void reverseList(LinkedList list){
//add code here
}

}
//########## Node class ##########
class Node {
    int data;
    Node next;
    Node(int val){
        data=val;
    }
    Node (){

    }
}
//########## LinkedList class ##########

class LinkedList{
    Node head;
    int n;
 boolean addAtStart(int value){
         Node temp=new Node();
          temp.data = value;
          temp.next = head;
          head = temp;
          n++; /// new element has been added
         
          return true;
     }

 void printList(){
         
         int i=0;
         Node temp = head;
         
         do
         {
             System.out.println(temp.data);
             
             temp = temp.next;  
             
             i++;
         }
         
         while(i<n);

     }  
}