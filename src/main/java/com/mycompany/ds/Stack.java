/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ds;

import java.util.EmptyStackException;

/**
 *
 * @author krish
 */
public class Stack {
    //LIFO   // last in first out
   
    
    public class Node{
        
       private int data;
       private  Node next;
       private Node(int data){
           this.data=data; 
        }
        
    }
    
   private Node head;
   private int size;
   
    
   
   public boolean isEmpty(){
       return head==null;
   }
    
    public int peek(){
           if (head==null){
         throw new EmptyStackException();
     }
        return head.data;
    }
    
    
    public void push(int data){
        //create new node with the data
       //assign the head to the newNode's next
      //assign the head to the new node  //move the pointer of the head to new node
      //increase the size by 1
        
      Node newNode= new Node(data);
      newNode.next=head;
      head=newNode;
      size++;
    }  
    
    
    
    public int pop(){
        //if head is null then there is no data present check null
        // take the data from the head to other variable
        // now change the head position to the heads next position
        //reduce the size by 1

     if (head==null){
         throw new EmptyStackException();
     }
     int data=head.data;
     head=head.next;
        System.out.println(""+head);
     size--;
     return data;   
    }
    

    public int size(){
        return size;
    }
    
    
    
}
