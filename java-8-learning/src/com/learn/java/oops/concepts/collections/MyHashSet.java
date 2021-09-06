package com.learn.java.oops.concepts.collections;

import java.util.AbstractSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MyHashSet<E> extends AbstractSet
implements Set, Cloneable, java.io.Serializable {

	private transient HashMap<E,Object> map;
	 
    // PRESENT is dummy value which will be used as value in map
    private static final Object PRESENT = new Object();
 
    /**
     * Constructs a empty map.so hash
     * 
     */
    public MyHashSet() {
     map = new HashMap<E,Object>();
    }
 
    // return false if e is already present in HashSet
    @Override
    public boolean add(E e) {
     return map.put(e, PRESENT)==null;
    }

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
}
