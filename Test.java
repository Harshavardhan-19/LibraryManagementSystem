public class Test {
    public static void main(String[] args) {
        // User usr= new User();
        // System.out.println(usr.getUserId());

        // User usr1= new User("Harshavardhan", "Do not contact Me.");
        // System.out.println(usr1.getName() + "  " + usr1.getContactInfo());
        // User copyUser = new User(usr1);
        // System.out.println("Copy user" + copyUser.getName() + "  " + copyUser.getContactInfo());
        Member harshavardhan = new Member("Harshavardhan J. Patil", "hjk.unofficial@gmail.com"); 
        Librarian asdf = new Librarian("asdf", "asdf@Harshavardhan.com", "125");
        harshavardhan.displayDashboard();
        asdf.displayDashboard();

        System.out.println();
        System.out.println("MemberId:" + harshavardhan.getUserId());
        System.out.println("EmployeeID:" + asdf.getUserId());
        System.out.println("TotalUsers:" + User.getTotalUsers());
        LibraryManagementSystem lbSystem = new LibraryManagementSystem();
        NovelBook harryPBook = new NovelBook("123", "HarryPotter and the Chanber of Secrets", "J. K. Rowling", "Fiction");
        NovelBook harryPBook2 = new NovelBook("456", "HarryPotter 2", "J. K. Rowling", "Fiction");
        NovelBook harryPBook3 = new NovelBook("789", "HarryPotter 3", "J. K. Rowling", "Fiction");
        lbSystem.addBook(harryPBook);
        lbSystem.addBook(harryPBook2);
        lbSystem.addBook(harryPBook3);
        lbSystem.registerUser(harshavardhan);

    }
}
