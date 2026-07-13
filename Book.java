public abstract class Book implements Lendable {
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;
    public Book(String isbn, String title, String author){
        this.isbn=isbn;
        this.title=title;
        this.author=author;
        this.isAvailable=isAvailable;
    }
    public Book(){
        isAvailable=true;
    }
    public Book(Book book){
        this.isbn=book.isbn;
        this.author=book.author;
        this.title=book.title;
        this.isAvailable=true;
    }
    @Override
    public boolean lend(User user){
        if(!isAvailable()){
            System.out.println("Book is not lendable");
            return false;
        }
        else{
            if(isAvailable && user.canBorrowBooks()){
                isAvailable=false;
                return true;
            }
        }
        return true;
    }
    @Override
    public void returnBook(User user){
        //Mark the book as available;
    }
    public boolean isAvailable(){
        return isAvailable;     
    }
    abstract void displayBookDetails();
    
}
