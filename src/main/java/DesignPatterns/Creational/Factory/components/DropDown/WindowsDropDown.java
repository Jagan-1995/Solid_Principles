package DesignPatterns.Creational.Factory.components.DropDown;

public class WindowsDropDown implements DropDown{
    @Override
    public void showDropDown() {
        System.out.println("Showing Windows DropDown");
    }

    @Override
    public void collapse() {
        System.out.println("Collapse Windows DropDown");
    }
}
