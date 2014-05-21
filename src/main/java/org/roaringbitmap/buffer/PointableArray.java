package org.roaringbitmap.buffer;

//TODO: rename
public interface PointableArray extends Cloneable {
	MappeableContainerPointer getContainerPointer();
	MappeableContainer getContainer(short x);
	MappeableContainer getContainerAtIndex(int i); 
	
	PointableArray clone();
	int getIndex(short x);
	int size();
	short getKeyAtIndex(int i);
}