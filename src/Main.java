public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the libapp");

        LibraryApp app = new LibraryApp();
/*
        app.searchByIsbn("1234");
        app.searchByIsbn("5678");
        app.searchByIsbn("9876");
        app.searchByIsbn("9846");

        app.searchByTitle("castle");
        app.searchByTitle("night");
        app.searchByTitle("dagger");
*/
        app.checkOutBook("1234");
        app.checkInBook("1234");
    }
}
