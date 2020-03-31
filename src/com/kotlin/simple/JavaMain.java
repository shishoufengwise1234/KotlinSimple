package com.kotlin.simple;

import com.kotlin.simple.simple2.NPECheck;

public class JavaMain {

    public static void main(String[] args){
        System.out.println("Hello Java");

        NPECheck npeCheck = new NPECheck();
        System.out.println(" hashCode = "+npeCheck.parseInt("23").hashCode());


    }


}
