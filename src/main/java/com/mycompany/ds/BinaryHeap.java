/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ds;

import java.util.Arrays;

/**
 *
 * @author krish
 */
public class BinaryHeap {
    private int capacity=10;
    private int size;
    
   public int items[]=new int[capacity];
    
   
   
   public boolean hasParent(int index){
       return parentIndex(index)>=0;
   }
   
   public int parent(int index){
       return items[parentIndex(index)];
   }
   
   public int parentIndex(int childIndex){
       return (childIndex-1)/2;
   }
   
    public void insert(int value){
        ensureCapacity();
        items[size]=value;
        size++;
        heapifyUp();
        
    }
    
    
 
    
    public void heapifyUp(){
        int  index=size-1;
        while(hasParent(index)&& parent(index)<items[index]){
           swap(parentIndex(index),index) ;
           index=parentIndex(index);
        }
    }
    
    public void swap(int index1,int index2){
      int temp=items[index1];
      items[index1]=items[index2];
      items[index2]=temp;
        
    }
    
    
    
   public int extractMax(){
       if(size<0)throw new IllegalStateException();
       int item=items[0];        //grap the max 
       items[0]=items[size-1];  //swap the first and last element
       size--;                  // effectively delete the last element
       heapifyUp();            // check the first element greater than its child till it is goes less than the bottom element
       return item;             //
       
        
        
    }
    
    
    public void heapifyDown(){
        
        
        
    }
    
    public void ensureCapacity(){
     if(size==capacity){
         items=Arrays.copyOf(items, capacity*2);
         capacity*=2;
     }
        
    }
    
    
}
