import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Management_BookStore {
    private List<Book> inventory;
    Management_BookStore()
    {
        inventory=new ArrayList<Book>();
    }
    void addBook(Book book)
    {
        inventory.add(book);
    }
    void removeBook(String isbn)
    {
        for(Book it:inventory)
        {
            if(it.isbn.equals(isbn))
            {
                inventory.remove(it);
                return;
            }
        }
    }
    double buyBook(String isbn,int quantity,String email,String address)
    {
        for(Book it:inventory)
        {
            if(it.isbn.equals(isbn))
            {
                if(it.is_for_sale) {
                    return it.buy(quantity);
                }else {
                    throw  new RuntimeException("this type is not for sale");
                }
            }
        }
        throw  new RuntimeException("no available book with this ISBN");
    }
    List<Book> remove_outdate(int duration)
    {
        List<Book>  outDated_books =new ArrayList<Book>();

        inventory.removeIf(it -> {
            if (LocalDate.now().getYear()- it.publish_Year> duration) {
                outDated_books.add(it);
                return true;
            }else
            {
                return false;
            }

        });
        return outDated_books;
    }
}
