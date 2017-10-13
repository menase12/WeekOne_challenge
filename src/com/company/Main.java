package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here

                dispalyDetails();
                option();
                multipleOption();
            }

            public static void dispalyDetails() {

                String code = "";
                String Nrm = "", npf = "", biz = "";
                String name, lastName;
                int id;
                double sales, calc1, calc2;
                Scanner keyboard = new Scanner(System.in);
                System.out.print("Eneter your customer ID: ");
                id = keyboard.nextInt();
                System.out.print("Eneter your name: ");
                name = keyboard.next();
                lastName = keyboard.next();
                System.out.print("Eneter your sales amount: ");
                sales = keyboard.nextInt();
                System.out.print("Eneter your Tax code: ");
                code = keyboard.next();
                if (code.equalsIgnoreCase("Nrm")) {
                    System.out.println("Your tax code amount is: 6%");
                    calc1 = sales * 0.06;
                    System.out.println("Your taxed value is: " + calc1);
                    System.out.println("Your total amount due: " + (calc1 + sales));
                } else if (code.equalsIgnoreCase("npf")) {
                    System.out.println("Your tax code amount is: 0%");
                    System.out.println("Your total amount due: " + +sales);
                } else if (code.equalsIgnoreCase("biz")) {
                    System.out.println("Your tax code amount is: 4.5%");
                    calc2 = sales * 0.045;
                    System.out.println("Your taxed value is: " + calc2);
                    System.out.println("Your total amount due: " + (calc2 + sales));
                }
            }
            public static int option() {
                String choice;
                String Y;
                Scanner input = new Scanner(System.in);
                System.out.println("Do you want to enter an other record? (Y/N)");
                choice = input.next();
                if (choice.equalsIgnoreCase("Y")) {
                    dispalyDetails();
                } else
                    System.out.println("Thank you for your time!");

                return 0;
            }

            public static void multipleOption() {
                int x = option();
                for(x=0;x>1000000;x++)
                {
                    x++;
                }
            }

    }




