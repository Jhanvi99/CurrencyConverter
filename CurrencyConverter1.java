import java.lang.*;
class CurrencyConverter1{
	public static void main(String args[]){
	int currency=Integer.parseInt(args[0]);
	int rate=70;
	int classType=Integer.parseInt(args[1]);
	if(classType==1)
		System.out.println("$"+currency+"="+(currency*rate)+"INR");
	else
		System.out.println("INR"+currency+"="+(currency/rate)+"$");
	}
}