package com.example.helloworld;

/**
 * Created by rebecca on 6/3/2014.
 */
public class HelloWorld {
       public static void main(String[] args) {
              System.out.printlin("Hello, world!");
           int[] values = {2, 4, 1};
           System.out.println(values[2]);

           int[][] grid = {
                   {2, 1, 11},
                   {9, 3},
                   {14, 8, 55, 51}
           };

           System.out.println(grid[0][2]);

           String[][] texts = new String[2][5];
           texts[0][1] = "Hello there";
           System.out.println(texts[0][1]);

           for (int row = 0; row < grid.length; row++) {
               for (int col = 0; col < grid[row].length; col++) {
                   System.out.print(grid[row][col] + "\t");
               }
               System.out.println();
           }

           String[][]words =new String[2][];

           words[0]= new String[3];
           words[0][2]= "hi there";
           System.out.println(words[0][2]);
       }}



