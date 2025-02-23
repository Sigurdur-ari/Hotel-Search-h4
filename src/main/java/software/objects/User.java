package software.objects;

public class User {
    private final String userName;
    private final String cardNumber;
    private final String ssNo;

    public User(String userName, String cardNumber, String ssNo) {
        this.userName = userName;
        this.cardNumber = cardNumber;
        this.ssNo = ssNo;
    }

    public String getUserName() {
        return userName;
    }
}
