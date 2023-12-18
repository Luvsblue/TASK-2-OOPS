public class Library {
    private Book[] books;
    private int numBooks;

    public Library(int capacity) {
        books = new Book[capacity];
        numBooks = 0;
    }

    public void addBook(Book book) {
        if (numBooks < books.length) {
            books[numBooks] = book;
            numBooks++;
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void removeBook(int bookID) {
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getBookID() == bookID) {
                books[i].setAvailable(true);
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book not found in the library.");
    }

    public void searchBook(int bookID) {
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getBookID() == bookID) {
                System.out.println("Book found:");
                System.out.println("Leo: " + books[i].getTitle());
                System.out.println("lokesh: " + books[i].getAuthor());
                System.out.println("yes: " + (books[i].isAvailable() ? "Available" : "Not available"));
                return;
            }
        }
        System.out.println("Book not found in the library.");
    }

    public void displayBooks() {
        if (numBooks == 0) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("Books in the library:");
        }
    }
}