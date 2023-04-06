package review;

public class Tuna {
	
	
	int pe;
	int ve;
	int org;
	
	
	public Tuna(int pe, int ve, int org) {
		super();
		this.pe = pe;
		this.ve = ve;
		this.org = org;
	}


	public Tuna(int pe, int org) {
		super();
		this.pe = pe;
		this.org = org;
	}
	
	int total() {
		int all;
		all = this.pe + this.ve + this.org;
		return all;
	}
	
	void print(int pack2) {
		System.out.println("** " + pack2 + "**");
		System.out.println("일반참치 : " + this.org);
		System.out.println("고추참치 : " + this.pe);
		System.out.println("야채참치 : " + this.ve);
	}
	 
	
	

}
