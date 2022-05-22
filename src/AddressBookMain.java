import java.util.Scanner;

public class AddressBookMain {
    Contact contact = new Contact();
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program.");

        AddressBookMain addressBookMain = new AddressBookMain();
        addressBookMain.getDetails();
        addressBookMain.showDetails();
    }
    void getDetails(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Name: ");
        String fName = scanner.next();
        contact.setfName(fName);
        System.out.println("Enter Last Name: ");
        String lName = scanner.next();
        contact.setlName(lName);
        System.out.println("Enter Phone No.: ");
        int phone = scanner.nextInt();
        contact.setPhoneNo(phone);
        System.out.println("Enter Email: ");
        String email = scanner.next();
        contact.setEmail(email);
        System.out.println("Enter City: ");
        String city = scanner.next();
        contact.setCity(city);
        System.out.println("Enter State: ");
        String state = scanner.next();
        contact.setState(state);
        System.out.println("Enter Pin: ");
        int pin = scanner.nextInt();
        contact.setPin(pin);
    }

    void showDetails(){
        System.out.println(contact);
    }
}
