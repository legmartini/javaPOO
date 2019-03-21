package entities;

public class OrderItem2 {
	
	private Integer quantity;
	private Double price;
	
	private Product2 product;

	public OrderItem2(Integer quantity, Double price, Product2 product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product2 getProduct() {
		return product;
	}

	public void setProduct(Product2 product) {
		this.product = product;
	}
	
	public double subTotal() {
		return price * quantity;
	}
	
	@Override
	public String toString() {
		return product.getName()
				+ ", R$"
				+ String.format("%.2f", price)
				+ ", Quantity: "
				+ quantity
				+ ", Subtotal: R$ "
				+ String.format("%.2f", subTotal());
	}
	
}
