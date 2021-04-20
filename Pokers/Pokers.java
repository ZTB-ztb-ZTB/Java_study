package Pokers;

public class Pokers {
	private String size;
	private String design;

	public Pokers(String size, String design) {
		this.size = size;
		this.design = design;
	}

	public void get () {
		System.out.print("design:"+this.design+","+"size:"+this.size+" ");
	}
}
