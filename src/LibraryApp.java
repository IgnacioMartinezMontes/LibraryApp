import java.util.ArrayList;

public class LibraryApp {

    //Frontend

    private BookRepository bookRepo = new BookRepository();

    public void searchByIsbn(String isbn){
       System.out.println("Searching by ISBN:"+ isbn);
       Book book = bookRepo.findByIsbn(isbn);
       if (book!=null){
           System.out.println("Book found:\n\tTitle: "+book.getTitle()+"\n\tGenre: "+book.getGenre()+"\n\tAuthor: "+book.getAuthor()+"\n\t");
       }
       else{
           System.out.println("No books were found for this search");
           System.out.println();
       }
    }

    public void searchByTitle(String keyword){
        System.out.println("Searching by Tile:"+ keyword);
        ArrayList<Book> books = bookRepo.findByTitle(keyword);
        System.out.println(books.size()+" books found");
        for (Book i:books){
            System.out.println("Book found:\n\tTitle: "+i.getTitle()+"\n\tGenre: "+i.getGenre()+"\n\tAuthor: "+i.getAuthor()+"\n\t");
        }

        System.out.println();
    }

    public void checkOutBook(String isbn){
        Book book = bookRepo.findByIsbn(isbn);
            if (book!=null){
                book.checkOut();
                System.out.println("Cheking out "+book.getTitle());
                System.out.println("Book checked out successfully");
        }else{
                System.out.println("Failed, there is no book with that ISBN");
            }
    }

    public void checkInBook(String isbn){
        Book book = bookRepo.findByIsbn(isbn);
        if (book!=null){
            book.checkOut();
            System.out.println("Cheking in "+book.getTitle());
            System.out.println("Book checked in successfully");
        }else{
            System.out.println("Failed, there is no book with that ISBN");
        }
    }

}
