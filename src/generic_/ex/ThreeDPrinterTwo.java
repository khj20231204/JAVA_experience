package generic_.ex;

public class ThreeDPrinterTwo {

    private Plastic material;

    public void setMaterial(Plastic material) {
        this.material = material;
    }

    public Plastic getMaterial() {
        return material;
    }

    public String toString(){
        return "재료는 Plastic입니다";
    }
}
