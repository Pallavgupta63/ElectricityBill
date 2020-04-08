import java.util.Random;

public class Customer {

	int c_id;
	String c_name;
	int conn_num;
	int bill_curr;
	int wallet;
	int last_six;
	
	public void conn() {
		int conn_num=new Random().nextInt(900000) + 100000;
		}
	public void wallet_create() {}
	public void bill_current() {}
	public void bill_pay() {}
	public void last_six_months() {}
	public void status() {}
}
