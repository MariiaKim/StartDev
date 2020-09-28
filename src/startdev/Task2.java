/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Task2 {
    public void run(){
        System.out.println("----- Задача 2 ------");
        System.out.println("Загадано число от 5 до 10: ");
        Random random = new Random();
        int myNumber = random.nextInt(10-5+1)+5;
        System.out.println("Отгадай: ");
        Scanner scanner = new Scanner(System.in);
        String gamerNumberStr = null;
        int gamerNumber = -1;
        int attempt = 0;
        do{
        try {
           gamerNumberStr = scanner.nextLine();
           gamerNumber = Integer.parseInt(gamerNumberStr);
        } catch (NumberFormatException e) {
            System.out.println("nepravelniy vvod"); 
            System.exit(0);
        }
        
        if(myNumber == gamerNumber){
        System.out.println("Ты выиграл");
        break;
        }else{
            if(attempt < 3){
        System.out.println("не угадал, давай еще"); 
        }else{
        System.out.println("Ты ты проиграл");
         }
        attempt++;
    
}
        }while (true);
        System.out.println("----- конец задачи 2 ------");
    }
   
}
