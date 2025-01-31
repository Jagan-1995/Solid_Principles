package DesignPatterns.Creational.Factory.components.Button;

public class AndroidButton implements Button{
    @Override
    public void showButton() {
        System.out.println("Showing Android Button");
    }

    @Override
    public void clickButton() {
        System.out.println("Clicking Android Button");
    }
}
