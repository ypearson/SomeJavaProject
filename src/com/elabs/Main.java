package com.elabs;

public class Main {

    public static void main(String[] args) {

    }
}

class SomeClass1 {

    InterfaceIntVar mIv;

    public SomeClass1 (InterfaceIntVar iv){

        mIv = iv;

    }

    public void doWork() {

        mIv.printSomeVar();

    }

}

class SomeClass2 implements InterfaceIntVar{

    private SomeClass1 sc1;

    public SomeClass2() {

        sc1 = new SomeClass1(this);
    }

    @Override
    public int getSomeVar() {
        return 0;
    }

    @Override
    public void setSomeVar(int v) {

    }

    @Override
    public void printSomeVar() {

    }

    @Override
    public void someCallback() {

    }


}

