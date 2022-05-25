import java.util.List;

public class Client {
	private String firstName;
	private String lastName;
	private String CPF;
	private String phoneNumber;
	private List<Address> addresses;

	public Client(String firstName, String lastName, String CPF, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.CPF = CPF;
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCPF() {
		return CPF;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void addAddress(Address addressToAdd){
		addresses.add(addressToAdd);
	}

	public void removeAddressByIndex(int index){
		addresses.remove(index);
	}

	public void removeAddressByID(Address addressToRemove){
		for (Address address : addresses){
			if(address.equals(addressToRemove))
				addresses.remove(addressToRemove);
		}
	}
}