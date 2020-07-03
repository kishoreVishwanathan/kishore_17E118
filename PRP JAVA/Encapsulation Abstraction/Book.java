
public class Book extends Author
{
	String name;
	double price;
	Author author;
	int qtyStock;
	public Book(String name, String email, String gender, String name2, double price, Author author, int qtyStock) {
		super(name, email, gender);
		name = name2;
		this.price = price;
		this.author = author;
		this.qtyStock = qtyStock;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public int getQtyStock() {
		return qtyStock;
	}
	public void setQtyStock(int qtyStock) {
		this.qtyStock = qtyStock;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", author=" + author + ", qtyStock=" + qtyStock
				+ ", getName()=" + getName() + ", getPrice()=" + getPrice() + ", getAuthor()=" + getAuthor()
				+ ", getQtyStock()=" + getQtyStock() + ", getEmail()=" + getEmail() + ", getGender()=" + getGender()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	

}
