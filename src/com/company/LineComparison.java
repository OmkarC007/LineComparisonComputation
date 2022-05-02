package com.company;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation");

        int x1 = 0;
        int x2 = 0;

        int y1 = 0;
        int y2 = 8;

        double lengthOfline1 = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        System.out.println("length of line one is "+lengthOfline1);

        int x11 = 0;
        int x22 = 0;

        int y11 = 0;
        int y22 = 0;

        double lengthOfline2 = Math.sqrt(Math.pow((x22-x11),2) + Math.pow((y22-y11),2));
        System.out.println("length of line two is "+lengthOfline2);

        if (lengthOfline1.equals(lengthOfline2)){
            System.out.println("linea are equals");
        }else{
            System.out.println("linea are not equals");
        }
    }
}
