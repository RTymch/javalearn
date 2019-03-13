package com.javalearning;
import java.util.Scanner;
/*
 *
 *
програма банкомат

*/

public class Main {
    int pincodeSc;
    int again=1;
    int pin;
    int pincode=1111;
    int minus;
    int vvid;
    int balance =100;
    int rep;


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
        System.out.println(" ");
        System.out.println("Програма \"Банкомат\"");
        System.out.println("Зробіть вибір, натиснувши відповідну цифру");
        System.out.println("Перевірити баланс рахунку - 1");
        System.out.println("Зняти гроші - 2");
        System.out.println("Змінити пінкод - 3");
    }


    //вибір пункту меню
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
                if (balance-minus<0){ //перевірка чи достатньо коштів
                    System.out.println("На рахунку бракує коштів");
                    balance+=minus; // повертає суму на рахунок
                }
                balance -= minus;
                System.out.println("Залишок: " + balance);
                break;
            case 3:
                System.out.println(" ");
                System.out.println("Введіть новий пінкод");
                Scanner newPinSc=new Scanner(System.in);
                pincodeSc=newPinSc.nextInt();
                pincode=pincodeSc;
                System.out.println("Ви успішно змінили пінкод");
                break;
        }
    }



    //повтор циклу чи вихід

    public void repeat(){
        System.out.println(" ");
        System.out.println("Повернутися до головного меню? - Натисніть 1");
        System.out.println("Вийти - Натисніть 0");
        Scanner repetition= new Scanner(System.in);
        rep = repetition.nextInt();
        again=rep;
        System.out.println(" ");
        System.out.println("До побачення!");

    }

       // виконання
    public static void main(String[] args) {

        Main m= new Main();
        m.checkpin();
        while (m.again ==1){
            m.mainMenu();
            m.input();
            m.actions2();
            m.repeat();
            
        }

    }
}