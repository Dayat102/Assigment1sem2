package GAMING;

public class GamingDescription {
	

	int price1;
	String date1;
	public void gamingDescription(int price,String date) {
		this.price1=price;
		this.date1=date;
		System.out.println();
		System.out.println("*******************************************************************");
		System.out.println("*                    GAMING DESCRIPTION!!!!                       *");
		System.out.println("*              -------------------------------                    *");
		System.out.println("*                                                                 *");
		System.out.println("*              WELCOME TO MAGIC CHESS TOURNAMENT                  *");
		System.out.println("*          OPEN TO ALL REGARDLESS OF GENDER AND ALSO AGE          *");
		System.out.println("*                    FEE : RM "+this.price1 +" PER PERSON                      *");
		System.out.println("*                      TIME:"+this.date1+"                        *");
		System.out.println("*                                                                 *");
		System.out.println("*                                                                 *");
		System.out.println("*******************************************************************");
	}


}
