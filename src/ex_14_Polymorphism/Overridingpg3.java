package ex_14_Polymorphism;

public class Overridingpg3 {
    public static void main(String[] args) {
        FatherHomeOverridingPg1 home = new FatherHomeOverridingPg1();
        home.home();

        AbiHomeOverridingpg2 homeabi = new AbiHomeOverridingpg2();
        homeabi.home();

        VanshiHomeOverridingpg2 homevanshi = new VanshiHomeOverridingpg2();
        homevanshi.home();

        FatherHomeOverridingPg1 homefatherabi = new AbiHomeOverridingpg2();
        homefatherabi.home();

        FatherHomeOverridingPg1 homefathervanshi = new VanshiHomeOverridingpg2();
        homefathervanshi.home();

        FatherHomeOverridingPg1 lorry = new FatherHomeOverridingPg1();
        lorry.lorry();

        AbiHomeOverridingpg2 lorry2 = new AbiHomeOverridingpg2();
        lorry2.lorry();

        FatherHomeOverridingPg1 lorry3 = new AbiHomeOverridingpg2();
        lorry3.lorry();
    }
}
