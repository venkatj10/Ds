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
public class DynamicArrays {
    
    int initialCapacity;
    int size=0;
    Object data[];

    
    public DynamicArrays(int initialCapacity) {
        this.initialCapacity=initialCapacity;
        data=new Object[initialCapacity];  
    }

 public void add(int value)
 {
    data[size]=value;
    System.out.println("data"+data[size]);
    size ++; 
    System.out.println("size"+size); 
 }
     
    
 public  void delete(int index) {
     System.out.println("inside the delete");
// Copy down
   // current j position is index   
   //how long j pointer needs to  move 
   //j moves from the index position to  before the last elment position
   //and pull the last element to the last before position 
   //so if j=1  last position is 3  ,then j needs to move till 2th position
   //so j<3
    for (int j = index; j < size - 1; j++) {
        
        System.out.println("inside the for");
        data[j] = data[j + 1];
    }
    // Clear last element of array
        data[size - 1] = null; // index not last element

       size--;    
}
 
 public void insert(int index,int value)
 {  
     //resize if the size and the index same
    //copy up
    //put the value
    //increment size++ 
     System.out.println("data size"+data.length);
     if(size==initialCapacity){
         resize();
     }
     
     
     
     for(int j=size-1;j>=index;j--){
        //j initial position is last element
       // j needs to move till
        //start from last element and change to next position
        
         data[j+1]=data[j];         
       }
//        // Copy up
//        for (int j = size; j > index; j--) {
//            data[j] = data[j-1];
//        }
     data[index]=value;
     size++;
 }
 

 public void resize(){
     System.out.println("inside the resize");
   Object newArray[]=new Object[initialCapacity * 2];
   for(int i=0;i<size;i++){
       newArray[i]=data[i];
   }
   data=newArray;  
   initialCapacity=initialCapacity*2; 
 }
 
 
 
 public void set(int index,int value){           //o(1)
     data[index]=value;
 }
 
 
 public Object get(int index ){              //o(1)
     return data[index];
 }
 
 
 public boolean isEmpty(){ 
     return size==0;  
 }
 
 
public boolean contains(int value){
    
    for(Object currentValue:data){
        if(currentValue.equals(value)){
            return true;
        }   
    }
    return false;  
}



public void printAll(){
    // i initital position is 0
    // i needs to move till last position for getting the element
for(int i=0;i<size ;i++){
    System.out.println("a[%d]"+data[i]);    
}
    System.out.println("size"+size);    
}
    }


  