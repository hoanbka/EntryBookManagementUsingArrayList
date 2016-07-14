package phoneBookManagement;

import java.util.ArrayList;

public class PhoneBook {
	private ArrayList<PhoneEntry> phoneEntries = new ArrayList<PhoneEntry>();

	public PhoneBook() {
	}

	private boolean isDuplicateName(String entryName) {
		if (phoneEntries.size() == 0) {
			return false;
		} else {
			for (int i = 0; i < phoneEntries.size(); i++) {
				if (phoneEntries.get(i).getName().equals(entryName)) {
					return true;
				}
			}
		}

		return false;
	}

	private boolean isDuplicateNumber(String entryNumber) {
		if (phoneEntries.size() == 0) {
			return false;
		} else {
			for (int i = 0; i < phoneEntries.size(); i++) {
				if (phoneEntries.get(i).getPhoneNumber().equals(entryNumber)) {
					return true;
				}
			}
		}

		return false;
	}

	public boolean addEntry(PhoneEntry entry) {
		if (!isDuplicateNumber(entry.getPhoneNumber())) {
			phoneEntries.add(entry);
			return true;
		}

		return false;
	}

	public boolean deleteEntry(String entryName) {
		if (!isDuplicateNumber(entryName)) {
			return false;
		} else {
			for (int i = 0; i < phoneEntries.size(); i++) {
				if (phoneEntries.get(i).getName().equals(entryName)) {
					phoneEntries.remove(i);
					return true;
				}
			}

		}
		return false;
	}

	public PhoneEntry findEntryByName(String entryName) {
		for (int i = 0; i < phoneEntries.size(); i++) {
			if (phoneEntries.get(i).getName().equals(entryName)) {
				return phoneEntries.get(i);
			}
		}
		return null;
	}

	public PhoneEntry findEntryByNumber(String entryNumber) {
		for (int i = 0; i < phoneEntries.size(); i++) {
			if (phoneEntries.get(i).getPhoneNumber().equals(entryNumber)) {
				return phoneEntries.get(i);
			}
		}
		return null;
	}

	public boolean editEntryByName(String oldName, String newName) {
		if (isDuplicateName(oldName)) {
			for (int i = 0; i < phoneEntries.size(); i++) {
				if (phoneEntries.get(i).getName().equals(oldName)) {
					phoneEntries.get(i).setName(newName);
					return true;
				}
			}
		}

		return false;
	}

	public boolean editEntryByNumber(String oldNumber, String newNumber) {
		if (isDuplicateNumber(oldNumber)) {
			for (int i = 0; i < phoneEntries.size(); i++) {
				if (phoneEntries.get(i).getPhoneNumber().equals(oldNumber)) {
					phoneEntries.get(i).setPhoneNumber(newNumber);
					return true;
				}
			}
		}
		return false;
	}

	public void disp() {
		for (PhoneEntry temp : phoneEntries) {
			System.out.println(temp.toString());
		}
	}

}
