public class PetrolPurchase {

	private String location;
	private String type;
	private int quantity;
	private double pricePerLitre;
	private double percentageDiscount;

	public PetrolPurchase (String location, String type, int quantity, double pricePerLitre, double percentageDiscount) {

	this.location = location;
	this.type = type;	
	if (quantity > 0.0) {
		this.quantity = quantity;
	}
	this.pricePerLitre = pricePerLitre;
	this.percentageDiscount = percentageDiscount;
}
	public void setLocation (String location) {
	this.location = location;
	}
	public String getLocation() {
	return location;
	}
	public void setType (String type) {
	this.type = type;
	}
	public String getType () {
	return type;
	}
	public void setQuantity (int quantity) {
	this.quantity = quantity;
	}
	public int getQuantity() {
	return quantity;
	}
	public void setPricePerLitre (double pricePerLitre) {
	this.pricePerLitre = pricePerLitre;
	}
	public double getPricePerLitre() {
	return pricePerLitre;
	}
	public void setPercentageDiscount (double percentageDiscount) {
	this.percentageDiscount = percentageDiscount;
	}
	public double getPercentageDiscount() {
	return percentageDiscount ;
	}
	public double getNetAmount() {
	return  ((quantity * pricePerLitre) - (quantity * pricePerLitre ) * (percentageDiscount / 100));
	}




}