package generic.ex;
public class ThreeDPrintTest {
    public static void main(String[] args){
        Ink ink = new Ink();
        ink.setProductDate(20231011);
        ink.setExpirationDate(20231212);
        ink.setManufacturingName("mizzibiz");

        ThreeDPrintInk pInk = new ThreeDPrintInk(ink);
        System.out.println(pInk.toString());

        Toner toner = new Toner();
        toner.setProductDate(20220823);
        toner.setExpirationDate(20240122);
        toner.setManufacturingName("urakan");

        ThreeDPrintToner pToner = new ThreeDPrintToner(toner);
        System.out.println(pToner.toString());

        //generic 사용
        ThreeDPrintGeneric<Ink> pGenericInk = new ThreeDPrintGeneric<>(ink);
        System.out.println("Generic ink : " + pGenericInk.toString());

        ThreeDPrintGeneric<Toner> pGenericToner = new ThreeDPrintGeneric<>(toner);
        System.out.println("Gneric toner : "+ pGenericToner.toString());
    }
}
