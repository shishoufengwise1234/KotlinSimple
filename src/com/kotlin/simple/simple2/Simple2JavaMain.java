package com.kotlin.simple.simple2;


import java.util.Optional;

public class Simple2JavaMain {

    public static void main(String[] args) {

        NPECheck npeCheck = null;
        Optional.of(npeCheck).get().parseInt("23").hashCode();

        School school = new School();

        // Java 连缀调用
//        int userNameLength = school.getClassData().getUser().getName().length();

        // java 判断处理
        if (school != null && school.getClassData() != null && school.getClassData().getUser() != null){
            int userNameLength = school.getClassData().getUser().getName().length();
        }


    }
}
