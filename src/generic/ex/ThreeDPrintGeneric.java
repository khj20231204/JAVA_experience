package generic.ex;

public class ThreeDPrintGeneric<T>{

    private T material;

    public ThreeDPrintGeneric(T material){
        this.material = material;
    }

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    public String toString(){
        return material.toString();
    }
}
