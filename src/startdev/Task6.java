/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Random;
/**
 *
 * @author user
 */
public class Task6 {
    public void run(){
        System.out.println("----- Задача 6 ------");
        System.out.println("Создаем ДВУХМЕРНЫЙ ЗУБЧАТЫЙ массив  из 10х(5,6,7,8,9) ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");
        int myArr[][] = new int[10][];
        Random random = new Random();
          for(int i = 0; i < myArr.length; i++){

      int column = (int)(Math.random()*5)+5; //create your random column count on each iteration
      myArr[i] = new int[column]; //Initialize with each random column count

      for(int j = 0; j < myArr[i].length; j++){
        //Fill the matrix with random numbers
        myArr[i][j] = (int)(Math.random()*10); 
        System.out.print(" " + myArr[i][j] + " ");
      }
      System.out.println();
   }  

   
        
        
//        for (int i = 0; i < myArr.length; i++) {
//            for (int j = 5; j < 10; j++) {
//                myArr[i] = new int[j];
//            }        
//        }
//        
//        for (int i = 0; i < myArr.length; i++) {
//            for (int j = 0; j < myArr[i].length; j++) {
//                myArr[i][j] = random.nextInt(20);
//                 System.out.print(" " + myArr[i][j] + " ");
//            }  
//            System.out.println();
//        }
        

                     
        System.out.println("----- конец задачи 6 ------");
    }
}
