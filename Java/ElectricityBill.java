public class ElectricityBill {
    int consumerNo;
    String consumerName;
    double prevReading;
    double currReading;
    String connectionType;

    public ElectricityBill(int consumerNo, String consumerName, double prevReading, double currReading, String connectionType) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.prevReading = prevReading;
        this.currReading = currReading;
        this.connectionType = connectionType;
    }

    public double calculateBill() {
        double unitsConsumed = currReading - prevReading;
        if (connectionType.equalsIgnoreCase("domestic")) {
            return unitsConsumed * 3;
        } else {
            return unitsConsumed * 5;
        }
    }

    public static void main(String[] args) {
        ElectricityBill bill = new ElectricityBill(647895, "John Doe", 900, 300, "domestic");
        System.out.println("Bill Amount: " + bill.calculateBill());
    }
}