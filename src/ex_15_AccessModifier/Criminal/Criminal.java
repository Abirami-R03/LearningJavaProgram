package ex_15_AccessModifier.Criminal;

import ex_15_AccessModifier.Cop.Police;

public class Criminal {
    public static void main(String[] args) {
        Police station = new Police();
        Police  gunCount = new Police(15);
        station.PublicFuntion(25);
        //station.PrivateFuntion(); -- it will not call becoz private method within class level
        //If we created Object,then Construtor method(both Non parameterized, parameterised) will call automatically without method calling
        //jrCop.canIShoot(); --- its not supported because canIShoot is protected Method
        //Outside package its not accessible

        //Protected accessible within Package
        //Public accessible outside package also
        //Private accessible within class level

    }
}
