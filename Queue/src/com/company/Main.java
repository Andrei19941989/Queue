package com.company;

public class Main {

    public static void main(String[] args) {
        MyQueue m=new MyQueue(5);
        m.Add(4);
        m.Add(23);
        m.Add(7);
        System.out.println(m);
        System.out.println(m.Get());
        System.out.println(m);
        System.out.println(m.Peek());
    }
}
