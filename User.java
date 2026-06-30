


public abstract class User{


    private String userId, name, contactInfo;
    public User(String userId){
        this.userId=userId;
    }
    public User(){
        this.userId = generateUniqueId();
    }
    
    public User(String name, String contactInfo){
        this.name=name;
        this.contactInfo=contactInfo;
    }
    public User(User usr){
        this.name=usr.name;
        this.contactInfo=usr.contactInfo;
    }
    public String getUserId(){
        return this.userId;
    }
    private String generateUniqueId(){
        return "0100";
    }
    public String getName(){
        return this.name;
    }
    public String getContactInfo(){
        return this.contactInfo;
    }

    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();
}