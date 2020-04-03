package com.kotlin.simple.simple2;

public class SamMain {

    public static void main(String[] args) {

        //新方法
        IGetName get = (name) -> "Hello "+name;

        System.out.println("new : " + get.getName("Java"));

        //老方法
        IGetName old = new IGetName() {
            @Override
            public String getName(String name) {
                return "Old : Hello " + name;
            }
        };

        System.out.println(" old : " + old.getName("world"));

        // 使用方法 传入 lambda 表达式
        testFun(val -> "Hello=" + val);
    }

    interface IGetName {
        String getName(String name);
    }

    public static void testFun(IGetName getName) {
        System.out.println(getName.getName("Hello"));
    }
}
