package com.elabs;

public class Main {

    public static void main(String[] args) {

        SomeClass1 sc1 = new SomeClass1(5);
        SomeClass2 sc2 = new SomeClass2(5);
        InterfaceIntVar[] obj = {sc1,sc2};

        for (InterfaceIntVar o : obj) {
            o.setSomeVar(10);
            o.printSomeVar();
        }

        SomeClass3 sc3 = new SomeClass3(sc1);
        sc3.doStuff();
    }
}

class SomeClass3 {

    private InterfaceIntVar mIv;

    public SomeClass3(InterfaceIntVar iv)
    {
        mIv = iv;
    }

    public void doStuff() {

        mIv.printSomeVar();

    }
}


class SomeClass1 implements InterfaceIntVar{

    private int var;

    public SomeClass1(int v)
    {
        var = v;
    }

    @Override
    public int getSomeVar() {
         return var + 1;

    }

    @Override
    public void someCallback() {

    }

    @Override
    public void setSomeVar(int v) {

        var += v;
    }

    @Override
    public void printSomeVar() {

        System.out.println(Integer.toString(var));
    }
}

class SomeClass2 implements InterfaceIntVar{

    private int var;

    @Override
    public void someCallback() {

    }

    public SomeClass2(int v)
    {
        var = v;
    }

    @Override
    public int getSomeVar() {
        return var + 10;

    }

    @Override
    public void setSomeVar(int v) {

        var += v+10;
    }

    @Override
    public void printSomeVar() {

        System.out.println(Integer.toString(var));
    }
}