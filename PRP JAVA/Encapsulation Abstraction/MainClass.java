
public class MainClass {

	public static void main(String[] args) {
		Author author=new Author("Virat","virat@gmail.com","F");
		Book book=new Book("viru","virat@gmail.com","F","patel",87.96377,author,2);
		System.out.println(book.toString());

	}

}
