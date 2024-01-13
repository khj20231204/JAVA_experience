package generic.ex;

public class ThreeDPrintInk {
    private Ink material;
    public ThreeDPrintInk(Ink material){
        this.material = material;
    }
    public Ink getMaterial() {
        return material;
    }
    public void setMaterial(Ink material) {
        this.material = material;
    }
    public String toString(){
        return material.toString();
    }
}
