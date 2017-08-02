package com.corejava.part12;

/**
 * @author yangwenliang, wenliang.yang@htouhui.com
 * @version 1.0
 */
public class Pair <T> {
    private T first;
    private T second;
    
    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }
    
    public T getFirst() {
        return first;
    }
    
    public void setFirst(T first) {
        this.first = first;
    }
    
    public T getSecond() {
        return second;
    }
    
    public void setSecond(T second) {
        this.second = second;
    }
}
