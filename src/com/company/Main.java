package com.company;

public class Main {
    public static void main(String[] args) {

        createObject("Lion").print();
        createObject("Tiger").print();
        createObject("Lynx").print();
    }

    public static Animal createObject(String className) {
        switch (className) {
            case "Lion":
                return new Lion("Simba", 4);
            case "Tiger":
                return new Tiger("Dio",5);
            case "Lynx":
                return new Lynx("Polnareff", 2);
            default:
                return null;

        }
    }
}