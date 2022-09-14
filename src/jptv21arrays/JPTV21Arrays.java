/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21arrays;

import java.util.Random;

/**
 *
 * @author pupil
 */
public class JPTV21Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int n = 10;
        int sum = 0;
        int min = 10;
        int max = 0;
        System.out.println("---- Одномерные массивы ----");
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++){
             nums[i] = random.nextInt(n);
        }
        for (int i = 0; i < nums.length; i++){
             System.out.printf("%3d",nums[i]);
             sum += nums[i];
             if(min > nums[i]) min = nums[i];
             if(max < nums[i]) max = nums[i];
        }
        System.out.println();
        System.out.println("sum = " +sum);
        System.out.println("min = " +min);
        System.out.println("max = " +max);
        }
        
//        System.out.println("---- Многомерные массивы ----");
//        int[][] nums2 = new int [n][n];
//        for(int i = 0; i < nums2.length; i++) {
//            for(int j = 0: j < nums2[i].length; j++);
//                    nums2[i][j] = random.nextInt(n);
//            }
//        }
//        sum = 0;
//        for(int i = 0; i < num2.length; i++) {
//            for(int j = 0; j < nums2[i].length; j++) {
//                System.out.printf("%4d", nums2[i] [j]);
//                sum += nums2 [i] [j];
//            }
//            System.out.println();
//        
//            
//        }
//        System.out.println();
//        System.out.println("sum = " +sum);
//        System.out.println("min = " +min);
//        System.out.println("max = " +max);
//        System.out.println("Сумма по нисходящей диагонали = " +SumDown);
//        System.out.println("Сумма по изходящей диагонали = " +SumUp);

            
        
       
    
    

