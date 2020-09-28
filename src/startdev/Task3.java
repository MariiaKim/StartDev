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
public class Task3 {
    public void run(){
        System.out.println("----- Задача 3 ------");
        System.out.println("Создаем одномерный массив  из 10 ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");
        int maximum = 0;
        int minimum = 0;
        int sum=0;
        int myArr[] = new int[10];
        Random random = new Random();
        
         for(int i = 0; i < myArr.length; i++){
            
            myArr[i] = random.nextInt(10-0+1);
            sum=sum+myArr[i];
            if(minimum > myArr[i]){
                minimum = myArr[i];
            }
            if (maximum < myArr[i]){
                maximum = myArr[i];
            }
            System.out.println(myArr[i]);
        }
         
           
         System.out.println("max = "+maximum);
         System.out.println("min = "+minimum);
         System.out.println("Сумма всех чисел массива: "+sum);
         System.out.println("----- конец задачи 3 ------");
         
    }
        
         
    } 
    
            

            
         
        
        
        
        
    

