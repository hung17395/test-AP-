package Question_2;

public class SpecCar extends Car{
	private int type;
	
	public SpecCar() {
	}

	public SpecCar(String maker, int price, int type) {
		super(maker, price);
		this.type = type;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return  super.toString()+", "+ type;
	}
	
	public void setData() {
		this.setMaker("XZ"+super.getMaker());
		this.setPrice(super.getPrice()+20);
	}
	
	public int getValue() {
		if(this.type<7) {
			this.setPrice(super.getPrice()+10);
		}else {
			this.setPrice(super.getPrice()+15);
		}
		return this.getPrice();
	}
}
