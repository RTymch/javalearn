package com.javalearning;
import java.util.Scanner;
/*
програма банкомат
ідеетифікація клієнта
меню терміналу
обробка вводу користувача
виконання
перевірка балансу
друк чеку
брак коштів
переведення на інші рахунки
зняти гроші
внести гроші
вибір валюти
кредит
комісія за обслуговування
зміна пінкоду


*/

public class Main {
    
    public static void main(String[] args) {
	int balance =100;
  System.out.println("Програма \"Банкомат\"");
  	System.out.println("Зробіть вибір, натиснувши відповідну цифру");
	System.out.println("Перевірити баланс рахунку - 1");
	System.out.println("Зняти гроші - 2");
	System.out.println("Змінити пінкод - 3");
  Scanner myVar = new Scanner(System.in);
               int vvid = myVar.nextInt();
  System.out.println("Ви вибрали: " + vvid);      
        
 
        if(vvid==1){
            System.out.println("Баланс рахунку : " + balance);
        }
        
        
	}
}