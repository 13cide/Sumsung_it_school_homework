public class TWSHeadphones extends Headphones {
    private double bluetoothStandard;

    public double getBluetoothStandard() {
        return bluetoothStandard;
    }

    public void setBluetoothStandard(double bluetoothStandard) {
        this.bluetoothStandard = bluetoothStandard;
    }
    
    public void connect(double distanceToPhone) {
        System.out.println(distanceToPhone < 20.0 ? "connected" : "can`t connect");
    }

    @Override
    public void wear() {
        System.out.println("we are in your ears");
    }
}
