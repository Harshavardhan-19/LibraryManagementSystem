public class Test {
    public static void main(String[] args) {
        User usr= new User();
        System.out.println(usr.getUserId());

        User usr1= new User("Harshavardhan", "Do not contact Me.");
        System.out.println(usr1.getName() + "  " + usr1.getContactInfo());
        User copyUser = new User(usr1);
        System.out.println("Copy user" + copyUser.getName() + "  " + copyUser.getContactInfo());

        
    }
}
