package generic.ex;

public class Toner {
    private int productDate;
    private int expirationDate;
    private String manufacturingName;

    public int getProductDate() {
        return productDate;
    }

    public void setProductDate(int productDate) {
        this.productDate = productDate;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getManufacturingName() {
        return manufacturingName;
    }

    public void setManufacturingName(String manufacturingName) {
        this.manufacturingName = manufacturingName;
    }

    public String toString(){
        return this.manufacturingName + " : " + this.productDate + "~" + this.expirationDate;
    }
}
