package studyopedia;

public class BookInputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book myBook =new Book();
		
		Scanner item = new Scanner(System.in);
		
		System.out.println("please enter The title of the book");
		 myBook.title= item.nextLine();
		 
		 System.out.println("please enter The author of the book");
		 myBook.author= item.nextLine();
		 
		 System.out.println("please enter The number of pages");
		 myBook.numberOfPages= item.nextInt();
		 
		 System.out.println("The book title is:" +myBook.title);
		 System.out.println("The book author is:"+ myBook.author);
		 System.out.println("The book title is:"+myBook.numberOfPages);
	}

}
