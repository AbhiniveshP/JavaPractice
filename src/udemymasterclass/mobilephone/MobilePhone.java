package udemymasterclass.mobilephone;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact newContact) {
        if( findContact( newContact.getName() ) >= 0 ) return false;
        this.myContacts.add(newContact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = findContact( oldContact.getName() );
        if(  position < 0 ) return false;
        this.myContacts.set(position, newContact);
        return true;
    }

    public boolean removeContact(Contact contact) {
        int position = findContact( contact.getName() );
        if(  position < 0 ) return false;
        this.myContacts.remove(position);
        return true;
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String name) {
        for(int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(name)) return i;
        }
        return -1;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) return this.myContacts.get(position);
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for(int i=0; i<this.myContacts.size(); i++) {
            System.out.println((i+1) + ". " +
                    this.myContacts.get(i).getName() + " -> " +
                    this.myContacts.get(i).getPhoneNumber());
        }

    }

    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("720-492-8360");
        Contact c1 = new Contact("A1", "720-492-8362");
        Contact c2 = new Contact("V1", "720-492-8606");
        Contact c3 = new Contact("V2", "720-492-8616");
        mobilePhone.addNewContact(c1);
        mobilePhone.printContacts();
        System.out.println();
        mobilePhone.addNewContact(c2);
        mobilePhone.addNewContact(c3);
        mobilePhone.printContacts();
        System.out.println();
        mobilePhone.removeContact(c2);
        mobilePhone.printContacts();

    }

}
