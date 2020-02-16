package edu.htc.blitstein.caih313.tddstack.engine;

import edu.htc.blitstein.caih313.tddstack.IStackable;

public class TddStack {

    static long DEFAULT_DEPTH = 100;
    long stackDepth;

    TddStack(long stackDept){
        stackDept = stackDepth;
    }

    public TddStack(){

    }
    //to compile, this method must return something, but this
    //code is just to make it compile, not a real implementation
    boolean isEmpty(){
        return false;
    }

    boolean isFull(){
        return false;
    }

    IStackable pop() {
        //any object can be null; again, just to get it to compile
        return null;
    }

    void push(IStackable iStackable) {
        //doesn't need to return anything
    }


}
