package DesignPatterns.Creational.Factory.components.DropDown;

public class IOSDropDown implements DropDown{
    @Override
    public void showDropDown() {
        System.out.println("Showing IOS DropDown");
    }

    @Override
    public void collapse() {
        System.out.println("Collapse IOS DropDown");
    }
}
