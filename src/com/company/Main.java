package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            Triangle a = new Triangle(3, 1, 0);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}
