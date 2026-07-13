


public abstract class User{

    static int totalUsers=0;
    int idCounter=0;
    private final String userId;
    private String name;
    private String contactInfo;
    public User(String userId){
        this.userId=userId;
    }
    public User(){
        this.userId = generateUniqueId();
        totalUsers++;
    }
    
    public User(String name, String contactInfo){
        this.userId = generateUniqueId();
        this.name=name;
        this.contactInfo=contactInfo;
        totalUsers++;
    }
    public User(User usr){
        this.userId = generateUniqueId();
        this.name=usr.name;
        this.contactInfo=usr.contactInfo;
        totalUsers++;
    }
    
    final String generateUniqueId(){
        return "UID-"+ ++idCounter;
    }
    static int getTotalUsers(){
        return totalUsers;
    }
    public String getUserId(){
        return userId;
    }
    public String getName(){
        return name;
    }
    public String getContactInfo(){
        return contactInfo;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setContactInfo(String cInfo){
        this.contactInfo=cInfo;
    }
    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();

    
    
}