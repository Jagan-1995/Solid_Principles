package Factory.components.DropDown;

public class AndriodDropDown implements DropDown{
    @Override
    public void showDropDown() {
        System.out.println("Showing Android DropDown");
    }

    @Override
    public void collapse() {
        System.out.println("Collapse Android DropDown");
    }
}
