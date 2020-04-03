package com.kotlin.simple.simple2;


import com.kotlin.simple.JavaMain;
import com.kotlin.simple.KotlinMainKt;
import kotlin.reflect.KClass;
import sun.awt.geom.AreaOp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Optional;

public class Simple2JavaMain {

    public static void main(String[] args) {

//        NPECheck npeCheck = new NPECheck();
//        Optional.of(npeCheck).get().parseInt("23").hashCode();

        School school = new School();

        // Java 连缀调用
//        int userNameLength = school.getClassData().getUser().getName().length();

        // java 判断处理
//        if (school != null && school.getClassData() != null && school.getClassData().getUser() != null){
//            int userNameLength = school.getClassData().getUser().getName().length();
//        }

        getName(1);
        getName(3.4);
        getName(3.6f);
        getName(1);


//        File file = new File("");
//        FileInputStream fis = null;
//        try {
//            fis = new FileInputStream(file);
//            fis.read();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //调用包级函数
        InteropKotlinKt.getTime();

        new com.kotlin.simple.simple2.Util().hashCode();

        Simple2Name.getSimpleName();
        Simple2Name.getDataName();



        InteropKotlin interopKotlin = new InteropKotlin();
        interopKotlin.getTime();



        Person person  = new Person();
        person.peronId = 1;
        person.setPersonName("23");


        Key key1 = new Key(2);
        Key key2 = new Key(-4);

        Key.COMPARATOR.compare(key1,key2);




        // 访问常量
        int c = Obj.CONST;
        int max = InteropKotlinKt.MAX;
        int version = InteropC.VERSION;

        // 调用静态方法
        InteropC.callStatic();

        // 通过实例对象调用 非静态方法
        InteropC.Companion.callNonStatic();

        Obj.callStatic();
        Obj.INSTANCE.callNonStatic();


        // 调用接口中 伴生对象中静态方法
        ChatBot.Companion.greet("123");

        // 获取 kotlin 字节码对象
        KClass kotlinKClass = kotlin.jvm.JvmClassMappingKt.getKotlinClass(InteropKotlin.class);
        //interopKotlin.getInteropClass(InteropKotlin.class);  编译错误
        interopKotlin.getInteropClass(kotlinKClass);

        // 访问
        interopKotlin.filterValid(new ArrayList<String>());
        interopKotlin.filterValidInt(new ArrayList<Integer>());

        interopKotlin.getX();
        interopKotlin.getX_prop();

        interopKotlin.z();
        interopKotlin.changeZ(3);

        Circle circle1 = new Circle(10,20);
        Circle circle2 = new Circle(10,20,5);

        circle1.draw("");
        circle1.draw("",2);
        circle1.draw("",2,"");

//        try {
//            InteropKotlinKt.writeToFile();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//
//        InteropKotlinKt.getInteropName().getBytes();




    }


    private static void getName(double d){

    }
}
