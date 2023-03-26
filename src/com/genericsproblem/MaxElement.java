package com.genericsproblem;

public class MaxElement<T extends Comparable<T>> {
    //integer element
    T x,y,z;

    public MaxElement(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    } // Refactor2- Parameterized Constructor

    public T testMaximum(){
        return MaxElement.testMaximum(x,y,z);
    } // Refactor2- testMaximum method to call internally


    /*
    public static void maximumOfInteger(Integer x, Integer y, Integer z){
        Integer max= x;
        if((y.compareTo(max))>0) max=y;
        if((z.compareTo(max))>0) max=z;
        System.out.println("Maximum of "+x+", "+y+" and "+z+" is: "+max);
    }
    public static void maximumOfFloat(Float x, Float y, Float z){
        Float max=x;
        if((y.compareTo(max))>0) max=y;
        if((z.compareTo(max))>0) max=z;
        System.out.println("Maximum of "+x+", "+y+" and "+z+" is: "+max);
    }
    public static void maximumOfString(String x, String y, String z){
        String max=x;
        if((y.compareTo(max))>0) max=y;
        if((z.compareTo(max))>0) max=z;
        System.out.println("Maximum of "+x+", "+y+" and "+z+" is: "+max);
    }
     */ //Refactor1- all 3 methods to one generic maximumOf method()


    public static <T extends Comparable<T>> T testMaximum(T x, T y, T z){
        T max=x;
        if((y.compareTo(max))>0) max=y;
        if((z.compareTo(max))>0) max=z;
        System.out.println("Maximum of "+x+", "+y+" and "+z+" is: "+max);
        return max;
    }

    public static void main(String[] args) {
        Integer int1= 3, int2= 4, int3= 5;
        Float flt1=6.6f, flt2=8.8f, flt3=7.7f;
        String str1="apple", str2="peach", str3="banana";

        System.out.println("Test Cases for UC1:");
        //TestCase1.1
        testMaximum(int3,int1,int2);
        //TestCase1.2
        testMaximum(int1,int3,int2);
        //TestCase1.3
        testMaximum(int1,int2,int3);

        System.out.println("\nTest Cases for UC2:");

        //TestCase2.1
        testMaximum(flt2,flt1,flt3);
        //TestCase2.2
        testMaximum(flt1,flt2,flt3);
        //TestCase2.3
        testMaximum(flt1,flt3,flt2);

        System.out.println("\nTest Cases for UC3:");

        //TestCase3.1
        testMaximum(str2,str1,str3);
        //TestCase3.2
        testMaximum(str1,str2,str3);
        //TestCase3.3
        testMaximum(str1,str3,str2);

        System.out.println("\nNew Test Cases using Generic Class:");
        //NewTestCase1
        new MaxElement<>(int1,int2,int3).testMaximum();
        //NewTestCase2
        new MaxElement<>(flt1,flt2,flt3).testMaximum();
        //NewTestCase3
        new MaxElement<>(str1,str2,str3).testMaximum();
    }
}
