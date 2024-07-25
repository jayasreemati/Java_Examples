public class Library {
    private String name;

    // Constructor for the Library class
    public Library(String name) {
        this.name = name;
    }

    // Nested class Book
    public class Book {
        private String title;
        private String author;

        // Constructor for the Book class
        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        // Method to display book details
        public void showDetails() {
            System.out.println("Title: " + title + ", Author: " + author);
        }
    }

    // Method to display library name
    public void showLibraryName() {
        System.out.println("Library: " + name);
    }

    // Main method for execution
    public static void main(String[] args) {
        // Create a Library instance
        Library myLibrary = new Library("City Library");

        // Show library name
        myLibrary.showLibraryName();

        // Create a Book instance
        Library.Book myBook = myLibrary.new Book("1984", "George Orwell");

        // Display book details
        myBook.showDetails();
    }
}
