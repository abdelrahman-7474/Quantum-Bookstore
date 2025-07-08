public class EBook extends Book{
String fileType;
EBook(String isbn, String title, int publish_Year, double price,String fileType)
{
    super(isbn,title,publish_Year,price);
    this.is_for_sale=true;
    this.fileType=fileType;

}
    @Override
    double buy(int quantity) {
        return price*quantity;
    }


}

