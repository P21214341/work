public class PC extends Asset{
	private int number;

	public Book(String name, int price, String color, int number){
		super(name, price, color);
		this.number = number;
	}
	public int getNumber(){
		return this.number;
	}

