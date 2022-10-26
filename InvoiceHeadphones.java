public class InvoiceHeadphones extends Headphones {
    private String materialOfEarCushion;

    public void setMaterialOfEarCushion(String materialOfEarCushion) {
        this.materialOfEarCushion = materialOfEarCushion;
    }

    public String getMaterialOfEarCushion() {
        return materialOfEarCushion;
    }

    @Override
    public void wear() {
        System.out.println("we are over the ears");
    }
}
