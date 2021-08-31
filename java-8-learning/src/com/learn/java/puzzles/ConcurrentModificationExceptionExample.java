
package com.learn.java.puzzles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModificationExceptionExample {  
  
    public static void main(String[] args) {  
          
        HashMap<Integer, Integer> map = new HashMap<>();  
        map.put(1, 1);  
        map.put(2, 2);  
        map.put(3,3);  
          
        Iterator<Integer> it = map.keySet().iterator();  
        while(it.hasNext()) {  
            Integer key = it.next();  
            System.out.println("Map Value:" + map.get(key));  
            if (key.equals(2)) {  
                map.put(1, 4);  
            }  
        }   
        
        
        CopyOnWriteArrayList list = new CopyOnWriteArrayList();
        
        list.add(1);  
        list.add(2);  
        list.add(3);  
        list.add(4);  
        list.add(5);  
  
        Iterator<Integer> listIterator = list.iterator();  
        while (listIterator.hasNext()) {                   
Integer value = listIterator.next();              
            System.out.println("List Value:" + value);  
            if (value.equals(3))  
                list.remove(value);  
        }  
  
    }  
    
} 