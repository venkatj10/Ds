/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ds;

/**
 *
 * @author krish
 */
public class LinkedList {
    
   int size;
   
   
   public class Node{
       
       int data;
       Node next;

        public Node(int data) {
            this.data = data;
           
        }

   }
    
   
   
      Node head;
   
      public void addFront(int value){               // O(1)
       //check whether is null if null assign the new node to head
       //if head is not null then change the new node head and change the next of the node as previous head
       Node newNode=new Node(value);
       if (head==null){
           
           head=newNode;
           return;
       }
        newNode.next=head;
        head=newNode;
        size++;
 
   }    
        
      
      public int getFirst(){
      
          return head.data;     // 0(1)
      }
      
      public int getLast(){
        //check the list is emptu
        // iterate the nodes from the head node tiill node which have the next is null
        //loop till last element ,complete the loop
       //retunr the elemeent which has next is null
          
       if(head==null){
           throw new IllegalStateException("emptyList");
       }

         Node current=head;
          
       while(current.next!=null){
          current=current.next;  
       }
         return current.data;
      }  
      
   
        public void addBack(int value){                   //o(n)
       //iterate from head to last element 
       //after reaching last element set the next of last element to new elment added
           Node newNode=new Node(value);
           if(head==null){
           head=newNode;
            }
           
           Node current=head;
           while(current.next!=null){
           current=current.next;       
           }
           
          current.next=newNode;
           size++;
       }
   

    
    public int size(){            // o(n) time complexity
    
       //iterate
       //flag increment
       //return flag;                    
       int count=0;
       
       Node current=head;
       while(current.next!=null){    
       count++;    
       current=current.next;
       }
       return count;
       }
       
  
    public int sizefast(){
        
       return size;
    }
    
    
    
    
    public void clear()                  //0(1)  constant time
    {                                             
      // set head to null 
      //because of the referencing the remeaing elements goes to garbage collection
        head=null;   
    }
    

  public void delete(int value)     //O(n)
  {
   //if head matches with the deleted value then change the head position to the next position     
   // else iterate from head and check wheteher any of the element matches with the given value
   // if the deleted element is found change the position of the previous of the deleted to next of the deleted
     //-element

   if(head==null){
       return;
   }
   
   if(head.data==value){
       head=head.next;
       size--;
       return;
   }
   
    Node current =head;
   while(current.next!=null){
       if(current.next.data==value){
          current.next=current.next.next;         
       } 
       current=current.next;
      }
      size--;
        return;
    }
    
    
    
    public void print(){
     Node current=head;
    while(current!=null){
        System.out.println(""+current.data);
        current=current.next;   
    }    
        
    }
     
}
