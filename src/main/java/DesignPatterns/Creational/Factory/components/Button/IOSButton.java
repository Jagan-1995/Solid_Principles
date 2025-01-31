package DesignPatterns.Creational.Factory.components.Button;

public class IOSButton implements Button{
    @Override
    public void showButton() {
        System.out.println("Showing IOS Button");
    }

    @Override
    public void clickButton() {
        System.out.println("Clicking IOS Button");
    }
}
