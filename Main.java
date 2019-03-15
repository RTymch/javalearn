package com.company;
import java.util.Scanner;
/*
 * кілька користувачів
 *
програма банкомат

*/

public class Main {
    public static void main(String[] args) {

        String name = "noname", surname, balance;
        System.out.println("Модель Банкомату");
        System.out.println(" ");
        Scanner S = new Scanner(System.in);
        String pin;


// check pincode


        //Array of data
        String[][] user = {{"1111", "Roman", "Tymchyshyn","100000$"},
                {"0000", "Sylvester", "Stallone","56000$"},
                {"007", "James", "Bond","*******"}};






            while(name.equals("noname") ){
                System.out.print("Enter pincode : ");
                pin = S.nextLine();
                for (int i = 0; i < 3; i++) {     // how can i make this with "length"?
                    int j=0;
                        if (pin.equals(user[i][j])) {//if pin is right, set new name, surname and balance
                            name = user[i][1];
                            surname = user[i][2];
                            balance = user[i][3];
                            System.out.println("Hello, " + name + " " + surname+"!");
                            System.out.println("The balance is: " + balance);
                            break;


                    }
                }//check wrong or not and write message
                if (name.equals("noname")){
                    System.out.println("Wrong pin!");
                    System.out.println(" ");
                }

                }


        }

}



