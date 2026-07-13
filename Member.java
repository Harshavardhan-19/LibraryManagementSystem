public class Member extends User{

    private int borrowedBooksCount;
    private static final int MAX_BORROW_LIMIT =5;
    public Member(String username, String contactInfo){
        super(username, contactInfo);
        this.borrowedBooksCount=0;
    }
    
    @Override
    public void displayDashboard(){
        System.out.println("=== MEMBER DASHBOARD ===" );
        System.out.println("Esteemed Member name: " + getName());
        System.out.println("Number of books borrowed: "+ borrowedBooksCount );
    }
    @Override
    public boolean canBorrowBooks(){
        return borrowedBooksCount<MAX_BORROW_LIMIT;
    }
}