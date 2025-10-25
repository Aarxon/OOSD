package lab6;

public class Person 
{
	// stores name and address
	private String name;
	private String address;
    
	// create person
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
    
	// getters and setters
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return name + "(" + address + ")";
	}
}