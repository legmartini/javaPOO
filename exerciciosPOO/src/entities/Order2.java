package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order2 {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	
	private Client2 client;
	private List<OrderItem2> items = new ArrayList<>();
	
	public Order2(Date moment, OrderStatus status, Client2 client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client2 getClient() {
		return client;
	}

	public void setClient(Client2 client) {
		this.client = client;
	}

	public List<OrderItem2> getItems() {
		return items;
	}
	
	public void addItem(OrderItem2 item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem2 item) {
		items.remove(item);
	}
	
	public Double total() {
		double sum = 0.0;
		for (OrderItem2 item : items) {
			sum += item.subTotal();
		}
		return sum;
	}
	
	@Override 
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order Moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order Status: " );
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order Items: \n");
		for (OrderItem2 item: items) {
			sb.append(item + "\n");
		}
		sb.append("Total Price: R$ ");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
}
