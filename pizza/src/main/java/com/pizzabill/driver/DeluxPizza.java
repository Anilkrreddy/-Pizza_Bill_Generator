package com.pizzabill.driver;

public class DeluxPizza extends Pizza {

    public DeluxPizza(boolean veg) {
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
    }

    @Override
    public void addExtraCheese() {
        // Custom implementation if needed
    }

    @Override
    public void addExtraToppings() {
        // Custom implementation if needed
    }
}
