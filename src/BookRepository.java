import java.util.ArrayList;

public class BookRepository {

    //Repositorio de datos

    private ArrayList<Book> books = new ArrayList<Book>();

    public BookRepository(){
        Book book1 = new Book("1234", "The Dead of Night","Horror", "no description","S.K. Eleton",10,7);
        Book book2 = new Book("5678", "Castles and Crenellations","Historical", "no description","H.P. Anderson",9,4);
        Book book3 = new Book("9876", "The knight's Sword","Fantasy", "no description","F.E. Anvil",8,3);
        Book book4 = new Book("9876", "Time of Night","Romance", "no description","A.U. ring",8,6);
        Book book5 = new Book("5432", "Castle Siege","Historical", "no description","N.N Blacksmith",4,2);
        Book book6 = new Book("0123", "Night and Day","Mystery", "no description","Q.Z Bizar",5,5);
        Book book7 = new Book("4567", "Never Time","Thriller", "no description","P.B Jellinton",7,1);


        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
    }

    public Book findByIsbn(String isbn){
        for (Book i : books){
            if (i.getIsbn().equals((isbn))){
                return i;
            }
        }
        return null;
    }

    public ArrayList<Book> findByTitle(String keyword){
        ArrayList<Book> booksFound= new ArrayList<>();
        for (Book i:books){
            if (i.getTitle().toLowerCase().contains(keyword.toLowerCase())){
                booksFound.add(i);
            }
        }
        return booksFound;
    }

}
