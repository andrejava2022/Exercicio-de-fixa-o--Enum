package entities;

public class OrderItem {
	
	private Integer quantity;
	private Double price;
	
	public OrderItem() {
		
	}

	public OrderItem(Integer quantity, Double price) {
		this.quantity = quantity;
		this.price = price;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public Integer getQuantity() {
		return quantity;
		
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public Double subTotal () {
		return price;
		
	}
	
}
