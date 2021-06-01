package Gaming1;

public class Company {
	
	private String name,email,adress,no;
	
	 // Create Setter Method
	  public void setName() {
		  this.name="Meliodas Enterprise";
	  }
	  
	  public void setEmail() {
		  this.email="www.melio.com";
	  }
	  
	  public void setAdress() {
		  this.adress="Lot G-10, Menara Amanah Ikhtiar\r\n"
		  		+ "Jalan Cempaka SD 12/1A\r\n"
		  		+ "Bandar Sri Damansara, PJU 9\r\n"
		  		+ "52200 Kuala Lumpur";
	  }
	  
	  public void setPhone() {
		  this.no="03-46654432";
	  }
	  
	  // Create Getter Method
	  public String getName() {
		  return this.name;
	  }
	  
	  public String getEmail() {
		  return this.email;
	  }
	  
	  public String getAdress() {
	 	  return this.adress;
 	  }
	  
	  public String getPhone() {
	 	  return this.no;
 	  }
}
