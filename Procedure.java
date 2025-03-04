
public class Procedure {
	
	//instance variables
	private String nameOfProcedure;
	private String date;
	private String nameOfPractitioner;
	private double charges;
	
	
	//Constructor methods
	public Procedure() {
		nameOfProcedure = "";
		date = "";
		nameOfPractitioner = "";
		charges = 0.0;
	}
	
	public Procedure(String nameOfProcedure, String date) {
		this.nameOfProcedure = nameOfProcedure;
		this.date = date;
		nameOfPractitioner = "";
		charges = 0.0;
	}

	public Procedure(String nameOfProcedure, String date, String nameOfPractitioner, double charges) {
		this.nameOfProcedure = nameOfProcedure;
		this.date = date;
		this.nameOfPractitioner = nameOfPractitioner;
		this.charges = charges;
	}
	
	
	//Accessor methods
	public String getNameOfProcedure() {
		return nameOfProcedure;
	}
	
	public String getDate() {
		return date;
	}
	
	public String getNameOfPractitioner() {
		return nameOfPractitioner;
	}
	
	public double getCharges() {
		return charges;
	}
	
	
	//Mutator methods
	public void setNameOfProcedure(String nameOfProcedure) {
		this.nameOfProcedure = nameOfProcedure;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public void setNameOfPractitioner(String nameOfPractitioner) {
		this.nameOfPractitioner = nameOfPractitioner;
	}
	
	public void setCharges(double charges) {
		this.charges = charges;
	}
	
	
	//Returns description of assets in each instance of the class
	public String toString() {	
		return "\n\tProcedure: " + nameOfProcedure + "\n\tProcedure Date = " + date + "\n\tPractitioner = " + nameOfPractitioner + "\n\tCharge = " + charges + "\n";
	}
}
