
public class Patient {
	
	//instance variables
	private String firstName;
	private String middleName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zipCode;
	private String phoneNumber;
	private String emergencyContact;


	//Constructor methods
	public Patient() {
		firstName = "";
		middleName = "";
		lastName = "";
		address = "";
		city = "";
		state = "";
		zipCode = "";
		phoneNumber = "";
		emergencyContact = "";
	}
	
	public Patient(String firstName, String middleName, String lastName) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		address = "";
		city = "";
		state = "";
		zipCode = "";
		phoneNumber = "";
		emergencyContact = "";
	}
	
	public Patient(String firstName, String middleName, String lastName, String address, String city, String state, String zipCode, String phoneNumber, String emergencyContact) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
		this.emergencyContact = emergencyContact;
	}
	
	//Accessor methods
	public String getFirstName() {
		return firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getEmergencyContact() {
		return emergencyContact;
	}
	
	
	//Mutator methods
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}
	
	
	//Returns concatenated String of first, middle, and last name with spaces between
	public String buildFullName() {
		return firstName + " " + middleName + " " + lastName;
	}
	
	
	//Returns concatenated String of address, city, state, and ZIP code with spaces between
	public String buildAddress() {
		return address + " " + city + " " + state + " " + zipCode;
	}
	
	
	//Returns concatenated String of Emergency contact name and phone number with a space between
	public String buildEmergencyContact() {
		return emergencyContact + " " + phoneNumber;
	}
	
	
	//Returns description of assets in class as built full name, address, and emergency contact information
	public String toString() {
		return " Name: " + buildFullName() + "\n Address: " + buildAddress() + "\n EmergencyContact: " + buildEmergencyContact();
	}
}
