package generic_.ex;

public class ThreeDPrinter {

    private Powder material;

    public void setMaterial(Powder material) {
        this.material = material;
    }

    public Powder getMaterial() {
        return material;
    }

    public String toString(){
        return "재료는 Powder 입니다";
    }
}
