package com.mathi27.object.demo;

public class CloneDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("Mathii", 25 , 'M', 234323235);
        Person p2 = p1;
        p2.setName("Mathi Yuvarajan T.K");
        System.out.println(p1.getName());
        Person p3 = (Person) p1.clone();
        System.out.println(p3.getName());
        p3.setName("Sathishu");
        System.out.println(p1.getName());
        System.out.println(p3.getName());

    }

}
