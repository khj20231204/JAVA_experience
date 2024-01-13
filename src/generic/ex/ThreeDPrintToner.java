package generic.ex;

public class ThreeDPrintToner {
    private Toner material;
    public ThreeDPrintToner(Toner material){
        this.material = material;
    }
    public Toner getMaterial() {
        return material;
    }
    public void setMaterial(Toner material) {
        this.material = material;
    }
    public String toString(){
        return material.toString();
    }
}
