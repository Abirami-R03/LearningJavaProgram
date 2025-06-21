package ex_14_Polymorphism;

class AbiHomeOverridingpg2 extends FatherHomeOverridingPg1 {
    @Override
    void home() {
        System.out.println("3BHK");
    }

    @Override
    void lorry() {
        System.out.println("1 Lorry");
    }
}
class VanshiHomeOverridingpg2 extends FatherHomeOverridingPg1
{
    @Override
    void home()
    {
        System.out.println("4BHK");
    }
}
