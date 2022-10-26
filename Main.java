public class Main {
    public static void main(String[] args) {
        TWSHeadphones freebuds4i = new TWSHeadphones();
        freebuds4i.setColour("silver");
        freebuds4i.setMaterial("metal");
        freebuds4i.setCompany("Huawei");
        freebuds4i.setBluetoothStandard(5.2);
        freebuds4i.connect(35);

        InvoiceHeadphones major3 = new InvoiceHeadphones();
        major3.setColour("black");
        major3.setMaterial("plastic");
        major3.setCompany("Marshall");
        major3.setMaterialOfEarCushion("lather");
        major3.wear();

        TWSHeadphones airpods = new TWSHeadphones();
        airpods.setColour("white");
        airpods.setMaterial("plastic");
        airpods.setCompany("Apple");
        airpods.setBluetoothStandard(4.2);
        airpods.wear();
        airpods.connect(2.71828459045);

    }
}