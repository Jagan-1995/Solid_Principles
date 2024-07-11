package DesignPatterns.Structural.Adapter.ThirdParty.ICICIbank;

public class ICICIBank {
    public void makePayment(String to, String from, int amount){
        System.out.println("Transferring money via ICICI Bank");
    }
}
