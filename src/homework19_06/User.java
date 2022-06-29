package homework19_06;
//Write program: userClass that has a constructor that initializes
// instance variable name and mobile number. Create a subclass  userInfo that
// will have user address variable and it also being initialized through constructor call. P
// rint users name, mobile number and address in userDetails method. Test your code.

public class User {

    String name;
    String mobileNumber;

    User(String name, String mobileNumber){
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

}

class UserInfo extends User{

    String address;

    UserInfo(String name, String mobileNumber, String address){
        super(name, mobileNumber);
        this.address = address;
    }

    public String userDetails(){
        return name +" "+ mobileNumber +" "+ address;
    }
}
