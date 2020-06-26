package com.company;

public class Main {

    public static void main(String[] args) {
        int age;
        age = 3;

        switch (age){
            case 1:
                System.out.println("crawl");
                break; //testb HEKKI
            case 2:
                System.out.println("talk");
                break;
                //if none of the other cases match the value go here
            default:
                System.out.println("DONT KNOW AGE");
                break;
        }

    }
}
