package generic_.ex;

public class GenericPrinterTest {

    public static void main(String[] args){

        Powder powder = new Powder();
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(powder);

        Powder p = powderPrinter.getMaterial();
        p.toString();
    }

}
