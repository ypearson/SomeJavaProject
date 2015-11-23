package com.elabs;

public class Main {

    public static void main(String[] args) {

    }
}

class SomeClass1 {

    static InterfaceIntVar mIv;
    static SomeClass1 mSc1;

    public static SomeClass1 getInstance(InterfaceIntVar iv)
    {

        mSc1 = new SomeClass1(iv);
        return mSc1;
    }

    public SomeClass1 (InterfaceIntVar iv) {

        mIv = iv;
    }

    public void doWork() { // this gets executed, which in turn calls SomeClass2's someCallback method

        mIv.someCallback();

    }

}

class SomeClass2 implements InterfaceIntVar{ //Users Class

    private SomeClass1 sc1;

    public SomeClass2() {

        sc1 = SomeClass1.getInstance(this); // register current object in SomeClass1 object
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

