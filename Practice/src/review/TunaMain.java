package review;

public class TunaMain {

	public static void main(String[] args) {


		Tuna pack = new Tuna(12, 1, 6);
		
//		pack.pe = 12;
//		pack.ve = 1;
//		pack.org = 6;
		
		
		
		Tuna pack2 = new Tuna(12,1);
		
		
		int count = pack.total();
		
		System.out.println(count);
		
		
		

	}

}
