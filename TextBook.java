public class TextBook extends Book{
    String subject;int edition;
    public TextBook(String isbn, String title, String author, String subject, int edition){
        super(isbn, title, author);
        this.subject=subject;
        this.edition=edition;
    }
    @Override
    public void displayBookDetails(){
        System.out.println("Title: ");
        System.out.println("Author: ");
        System.out.println("Subject: ");
        System.out.println("Edition: ");
    }
}