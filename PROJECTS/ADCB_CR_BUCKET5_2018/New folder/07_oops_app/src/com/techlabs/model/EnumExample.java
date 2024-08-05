package com.techlabs.model;

public class EnumExample {
    enum Status {
        Running, Failed, Pending, Success;
    }

    public static void main(String[] args) {
        Status[] ss = Status.values();
        System.out.println(ss[0]);
        for (Status s : ss) {
            System.out.println("Status is " + s + " (" + s.ordinal() + ")");
        }
    }
}
