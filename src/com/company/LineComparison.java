package com.company;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation");

        int x1 = 4;
        int x2 = 5;

        int y1 = 9;
        int y2 = 8;

        double lengthOfline = Math.sqrt(Math.pow((x2-x1),2) +Math.pow((y2-y1),2));
        System.out.println("length of line is "+lengthOfline);
    }
}
