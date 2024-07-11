package DesignPatterns.Structural.Adapter;

public class PhonePe {
    // Ideally we should use Dependency Injection here
    private static BankAPI bankAPI = new ICICIAdapter();

    public static void main(String[] args) {
        bankAPI.sendMoney("1234", "9876", 1000);
    }
}
