package ex_15_AccessModifier.Cop;

public class JuniorPolice {
    public static void main(String[] args) {
        Police jrCop = new Police(15);
        jrCop.canIShoot();//Protected method will call becoz its within package
        jrCop.PublicFuntion(25);
    }


}
