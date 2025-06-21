package ex_15_AccessModifier.Cop;

public class Police {
private int gun;
String icard;
public Police(int gun)
{
    this.gun = gun;
    System.out.println(gun);
}
public Police()
{
    System.out.println("Chennai Police Station");
}
protected void canIShoot()
    {
        System.out.println("Yes You can shoot!");
    }

    private void PrivateFuntion()
    {
        System.out.println("Private will work within class");
    }
    public void PublicFuntion(int gun)
    {
        System.out.println("Public Funtion will work outside class and package");
        this.gun = gun;
        System.out.println(gun);
    }
}
class gun
{
    void gun(int gun)
    {
        //this.gun = gun; --  this.gun is private variable defined in Police Class
        // "class-level visibility only" (not package-level).
        //so we cant use in another class

    }

}
