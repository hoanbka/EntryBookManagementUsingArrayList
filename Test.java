package phoneBookManagement;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		PhoneBook phoneBookMng = new PhoneBook();
		System.out.println("PhoneBook Management System :");
		Scanner input = new Scanner(System.in);
		boolean check = true;
		while (check) {
			System.out.println("Menu of the system :");
			System.out.println("1. Add entryphone");
			System.out.println("2. Edit entryphone ");
			System.out.println("3. Delete entryphone");
			System.out.println("4. Find entryphone ");
			System.out.println("5. Display entryphone");
			System.out.println("6. Exit");
			System.out.println("Enter your option :");
			int key = input.nextInt();

			switch (key) {
			case 1:
				input.nextLine();
				PhoneEntry entry = new PhoneEntry();
				System.out.println("Name of entryphone:");
				entry.setName(input.nextLine());
				System.out.println("Number of entryphone: ");
				entry.setPhoneNumber(input.next());
				if (phoneBookMng.addEntry(entry)) {
					System.out
							.println("Add the entry to the list successfully");
				} else {
					System.out
							.println("Add the entry to the list NOT successfully");
				}

				break;
			case 2: {
				System.out
						.println("Do you want to modify by number or name : 1?2");
				int temp = input.nextInt();
				switch (temp) {
				case 1:
					System.out.println("Enter entry number in the list :");
					String entryNumber = input.next();
					input.nextLine();
					System.out.println("Enter new number :");
					String newNumber = input.nextLine();

					if (phoneBookMng.editEntryByNumber(entryNumber, newNumber)) {
						System.out.println("Modification is successful");
					} else {
						System.out.println("Modification is NOT successful");
					}
					break;
				case 2:
					input.nextLine();
					System.out.println("Enter entry name in the list :");
					String entryName = input.nextLine();
					// input.nextLine();
					System.out.println("Enter new name :");
					String newName = input.nextLine();
					if (phoneBookMng.editEntryByName(entryName, newName)) {
						System.out.println("Modification is successful");
					} else {
						System.out.println("Modification is NOT successful");
					}
					break;
				}
			}
				break;
			case 3:
				input.nextLine();
				System.out.println("Enter the name you want to delete :");
				String delName = input.nextLine();
				if (phoneBookMng.deleteEntry(delName)) {
					System.out.println("Delete successfully");
				} else {
					System.out.println("Delete NOT successfully");
				}
				break;
			case 4:
				System.out.println("Do u want to find by name or number : 1?2");
				int temp2 = input.nextInt();
				switch (temp2) {
				case 1:
					input.nextLine();
					System.out.println("Enter the name that u want to find :");
					String findName = input.nextLine();
					PhoneEntry result = phoneBookMng.findEntryByName(findName);
					if (result != null) {
						System.out.println(result);
					} else {
						System.out.println("NOT found ");
					}
					break;
				case 2:
					input.nextLine();
					System.out
							.println("Enter the number that u want to find :");
					String findNumber = input.nextLine();
					PhoneEntry result2 = phoneBookMng
							.findEntryByNumber(findNumber);
					if (result2 != null) {
						System.out.println(result2);
					} else {
						System.out.println("NOT found ");
					}
					break;
				}
				break;
			case 5:
				// phoneBookMng.toString();
				phoneBookMng.disp();
				break;

			case 6:
				System.out
						.println("Exit program, Programming is just a game !!!");
				check = false;
				break;
			default:
				System.out.println("Wrong selection!");
				break;
			}

		}

	}
}
