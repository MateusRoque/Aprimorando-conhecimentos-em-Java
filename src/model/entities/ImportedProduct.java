package model.entities;

public class ImportedProduct extends Product{
	private Double customsFee;

	public ImportedProduct() {}
	
	
	
	
	public ImportedProduct(String name, double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}




	public Double getCustomsFee() {
		return customsFee;
	}
	
	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	@Override
	public String priceTag() {
		return name + " $ " + price + " (Customs fee: $" + customsFee + ")";
	}
	
	public double totalPrice() {
		return price += + customsFee;
	}
}
