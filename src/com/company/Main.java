package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double[] thx = {2.1, 13.2, 12.1, 14.2, -51.3, 28.4, 7.5, -16.6, 16.3, 34.2, 22.1, 14.4, -49.7, 58.2, 37.8};
        double fix = 0;
        int cast = 0;
        boolean dd = false;

        for (double wenty : thx) {

            if (wenty < 0) {
                dd = true;
            } else {
                if (dd) {
                    fix += wenty;
                    cast += 1;
                }
            }


        }
        System.out.println(fix / cast);





    }
    }

