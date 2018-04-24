
public class Services_provided {
	public String name;
	public int price;
	public int tax;
	public int amount;
	
	options op[];
	Add_on ao[];
	
	options opp;
	Add_on aon[];
	public Services_provided(String n, int p, int t,options o[],Add_on a[]) {
		name = n;
		price = p;
		tax = t;
		op = o;
		ao = a;
		amount = 0;
	}
	public void bookService(options o, Add_on a[]){
		
		opp = o;
		aon = a;
		amount= amount + price;
		amount= amount + o.price;
		
		for(int i=0; i<aon.length; i++){
			amount = amount + aon[i].price;
		}
	}
	public void printBill(){
		Debug.Log("\nName : "+name);
		Debug.Log("\nPrice : "+price);
		Debug.Log("\nOption : "+opp.name);
		Debug.Log("\nOption : "+opp.price);
		
		for(int i=0; i<aon.length; i++){
			Debug.Log("\nAdon : "+aon[i].name+" Price : "+aon[i].price);
		}
		Debug.Log("\nTotal : "+amount);
	}
}
