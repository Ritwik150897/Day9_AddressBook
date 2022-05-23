import java.util.Scanner;

public class AddressBookMain {
    Contact contact = new Contact();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        AddressBookMain addressBookMain = new AddressBookMain();
        Scanner scanner = new Scanner(System.in);

        int menuOption = 0;
        while (menuOption != 4) {
            System.out.println("Welcome to Address Book Program.");
            System.out.println("Press 1 To Add Contact.");
            System.out.println("Press 2 To Display Contact.");
            System.out.println("Press 3 To Edit Contact.");
            System.out.println("Press 4 To Exit.");

            menuOption = scanner.nextInt();

            switch (menuOption) {
                case 1:
                    addressBookMain.getDetails();
                    break;

                case 2:
                    addressBookMain.showDetails();
                    break;

                case 3:
                    addressBookMain.editDetails();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Enter Correct Choice.");
            }
        }
    }

    void getDetails() {
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

    void showDetails() {
        System.out.println(contact);
    }

    void editDetails() {
        System.out.println("Select Option to Edit: ");
        System.out.println("1 for First Name.");
        System.out.println("2 for Last Name.");
        System.out.println("3 for Phone No..");
        System.out.println("4 for Email.");
        System.out.println("5 for City Name.");
        System.out.println("6 for State Name.");
        System.out.println("7 for Pin.");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Update First Name: ");
                String fName = scanner.next();
                contact.setfName(fName);
                break;

            case 2:
                System.out.println("Update Last Name: ");
                String lName = scanner.next();
                contact.setlName(lName);
                break;

            case 3:
                System.out.println("Update Phone No.: ");
                int phone = scanner.nextInt();
                contact.setPhoneNo(phone);
                break;

            case 4:
                System.out.println("Update Email: ");
                String email = scanner.next();
                contact.setEmail(email);
                break;

            case 5:
                System.out.println("Update City Name: ");
                String city = scanner.next();
                contact.setCity(city);
                break;

            case 6:
                System.out.println("Update State Name: ");
                String state = scanner.next();
                contact.setState(state);
                break;

            case 7:
                System.out.println("Update Pin: ");
                int pin = scanner.nextInt();
                contact.setPin(pin);
                break;

            default:
                System.out.println("Enter Correct Choice.");
        }
        System.out.println("Contact Updated.");
    }
}
