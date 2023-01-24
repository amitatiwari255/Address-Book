package com.bridgelabz.addressbook;
import java.util.ArrayList;
import java.util.*;
public class AddressBookMain {
    public static void main(String[] args) {
        AddressBook obj = new AddressBook();
        obj.addDetails();
        System.out.println("----------------" + "----------------");

        String ch;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter choice \n 1.Add Contact \n 2.Edit Contact \n 3.Delete contact");
            int choice;
            choice = scan.nextInt();

            switch (choice) {

                case 1:
                    obj.addDetails();
                    break;
                case 2:
                    obj.editContact();
                    break;
                case 3:
                    obj.deleteContact();
                    //		obj.print();
                    break;

                default:
                    System.out.println("Invalid Input");
            }
            System.out.println("----------------------------------------------------------------");
            System.out.println("DO YOU WANT TO ADD MORE CONTACT (PRESS y to contune)");
            ch = scan.next();
        } while (ch.equals("y") || ch.equals("Y"));
    }
}
