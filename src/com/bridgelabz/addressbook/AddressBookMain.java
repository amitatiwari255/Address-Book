package com.bridgelabz.addressbook;
import java.util.ArrayList;
public class AddressBookMain {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        AddressBook addressBook = new AddressBook();
        addressBook.addDetails(arrayList);
        addressBook.multipleContact(arrayList);
    }
}
