package ex_16_Encapsulation;

public class Encap_ex01 {
    public static void main(String[] args) {
        UserLogin userlogin = new UserLogin("U1399", "Abi@123");
        System.out.println(userlogin.Username);
        System.out.println(userlogin.Password);
        AdminLogin adminlogin = new AdminLogin("U1733","Vino@153");
        //why were not pass boolean here becoz here object creation time construtor have 2 para so we pass 2 here
        //In setter time we can pass boolean value thr with cond
        System.out.println(adminlogin.getUsername());
        System.out.println(adminlogin.getPassword());
        adminlogin.setUsername("U16172");
        adminlogin.setPassword("Test@123",true);
    }
}
class UserLogin
{
    public String Username;
    public String Password;

    public UserLogin(String username,String password)
    {
       this.Password = password;
       this.Username = username;
    }
}
class AdminLogin
{
    private String Username;
    private String Password;

    public AdminLogin(String usr,String pswd)
    {
        this.Username = usr;//why we need in constructor,The constructor is called only once, when the object is created
        this.Password = pswd;
    }
    public String getUsername()
    {
        return Username;
    }
    public String getPassword()
    {
        return Password;
    }
    //Setters (mutator methods) are used to modify the instance variables after the object has been created.
    //so that we use twice 'this' in Construtor and Setter method
    //constructor called only once when obj created
    //Setter intialize afer obj creation
    public void setUsername(String username)
    {
        this.Username = username;
    }
    public void setPassword(String password,boolean isAdmin) {
        if (isAdmin) {
            this.Password = password;
        }
        else {
            System.out.println("Not allowed to set a password, not a admin!");
        }
    }

}

