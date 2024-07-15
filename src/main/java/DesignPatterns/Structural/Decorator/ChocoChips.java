package DesignPatterns.Structural.Decorator;

public class ChocoChips implements IceCream{
    private IceCream iceCream;

    public ChocoChips(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + Choco Chips";
    }

    @Override
    public int getCost() {
        if (iceCream != null){ // Always check for NPE
            return iceCream.getCost() + 5;
        }
        return 0; // invalid
    }
}
