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
    int pin;
   int pincode=1111;
 int minus;
   // int zniaty;
    int vvid;
    int inp;
    int balance =100;
    
    
    // Перевірка пінкоду
    void checkpin(){
        while (pin!=pincode){
        System.out.println("Введіть пінкод");
        Scanner chek = new Scanner(System.in);
        pin=chek.nextInt();
        }
    }
    
    
    // вивід головного меню
    public void mainMenu(){
    System.out.println("Програма \"Банкомат\"");
  	System.out.println("Зробіть вибір, натиснувши відповідну цифру");
	System.out.println("Перевірити баланс рахунку - 1");
	System.out.println("Зняти гроші - 2");
	System.out.println("Змінити пінкод - 3");
    }
    
    
    //ввід
 public  int input(){
        Scanner myVar = new Scanner(System.in);
               vvid = myVar.nextInt();
  System.out.println("Ви вибрали: " + vvid);
        return vvid;
    }
    
    
    //обробка вводу
    
    void actions2(){
        switch (vvid){
            case 1:
                System.out.println("Баланс рахунку : " + balance);
                break;
     case 2:
               System.out.println("Скільки ви хочете зняти?");
              Scanner zniaty= new Scanner(System.in);
                minus=zniaty.nextInt();
                System.out.println("Знято: " + minus);
    balance -= minus;
                System.out.println("Залишок: " + balance);
                case 3:
            }
    }
   
    
    
    //повтор циклу чи вихід
    /*
  public void repeet(){
        System.out.println(" ");     
        System.out.println("Повернутися до вибору? - Натисніть 1");
        Scanner myVar2= new Scanner(System.in);
               int vvid2= myVar2.nextInt();
        if(vvid2==1){
            m.mainMenu();
    }
    }
    */
    
    public static void main(String[] args) {
	
       Main m= new Main();
        m.checkpin();
        m.mainMenu();
       m.input();
      //  m.actions();
    m.actions2();
          
        
	}
}