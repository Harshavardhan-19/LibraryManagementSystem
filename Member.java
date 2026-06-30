public class Member extends User{

    private int borrowedBooksCount;
    private final int MAX_BORROW_LIMIT =5;
    
    @Override
    public void displayDashboard(){
        System.out.println("Member Dashboard and Books Borrowed: " + borrowedBooksCount);
    }
    @Override
    public boolean canBorrowBooks(){
        return borrowedBooksCount<MAX_BORROW_LIMIT;
    }
}