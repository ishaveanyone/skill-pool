package com.dist.jmx;


import java.util.ArrayList;
import java.util.List;

/*
 * 该类名称必须与实现的接口的前缀保持一致（即MBean前面的名称
 */
public class Hello implements HelloMBean
{
    private String name;

    private String age;

    private List<String> data=new ArrayList<>();

    private Integer a;

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    public void getTelephone()
    {
        System.out.println("get Telephone");
    }

    public void helloWorld()
    {
        System.out.println("hello world");
    }

    public  void outprint(){
        System.out.println("name:"+name+"age:"+age);

    }

    public void helloWorld(String str)
    {
        System.out.println("helloWorld:" + str);
    }

    //属性的操作sertter 以及 getter 不能被显示调用 是对属性进行赋值的时候才会被调用
    public String getName()
    {
        System.out.println("get name 123");
        return name;
    }

    public void setName(String name)
    {
        System.out.println("set name 123");
        this.name = name;
    }

    public String getAge()
    {
        System.out.println("get age 123");
        return age;
    }

    public void setAge(String age)
    {
        System.out.println("set age 123");
        this.age = age;
    }


    @Override
    public void add(String ele) {
        this.data.add(ele);
    }

    @Override
    public void out() {
        data.forEach(System.out::println);
    }
}