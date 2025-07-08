import java.util.List;

public class Main {
    public static void main(String[] args) {

        Management_BookStore MB=new Management_BookStore();

        MB.addBook(new PaperBook("PB1", "The Days", 1991, 100.0, 3,10));
        MB.addBook(new EBook("EB1", "intro to Ai",  2022, 75.0,"PDF"));
        MB.addBook(new Showcase("SB1", "Big data",  2015,100.0));
        System.out.println("price = "+ MB.buyBook("PB1",3,"abdelrahmantamer0111@gmail.com","cairo,nasr city"));
        System.out.println("price = "+ MB.buyBook("EB1",3,"abdelrahmantamer0111@gmail.com","cairo,nasr city"));
        List<Book> temp=MB.remove_outdate(20);

        for(Book book:temp)
        {
            System.out.println(book.isbn);
        }
try {
    MB.removeBook("EB1");
    System.out.println("price = "+ MB.buyBook("EB1",3,"abdelrahmantamer0111@gmail.com","cairo,nasr city")); //throw exprction book not found
}catch (Exception e)
{
    System.out.println(e.getMessage());
}

try {
    System.out.println("price = " + MB.buyBook("SB1", 0, "abdelrahmantamer0111@gmail.com", "cairo,nasr city")); // this type not for sale
}catch (Exception e)
{
    System.out.println(e.getMessage());

}

    }
}