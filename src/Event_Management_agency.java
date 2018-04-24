
public class Event_Management_agency {
	public static void main(String[] args) {
		client cl1 = new client("Ramesh");
		
		options op1 = new options("medium  hall",23200);
		
		Add_on a1 = new Add_on("Sound",15100);
		
		options opl1[] = new options[1];
		opl1[0] = op1;
		
		Add_on adl1[] = new Add_on[1];
		adl1[0] = a1;
		
		Services_provided s1 = new Services_provided("Hall Booking",11000,1000,opl1,adl1);
		
		s1.bookService(op1, adl1);
		s1.printBill();
	}
}
