package com.pizzabill.driver;

public class Pizza {
    private int price;
    private final boolean isVeg;
    private final int extraCheesePrice = 100;
    private final int extraToppingsPrice = 150;
    private final int backPackPrice = 20;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;

    public Pizza(boolean veg) {
        this.isVeg = veg;
        this.price = veg ? 300 : 400;
    }

    public void addExtraCheese() {
        if (!isExtraCheeseAdded) {
            isExtraCheeseAdded = true;
            this.price += extraCheesePrice;
        }
    }

    public void addExtraToppings() {
        if (!isExtraToppingsAdded) {
            isExtraToppingsAdded = true;
            this.price += extraToppingsPrice;
        }
    }

    public void takeAway() {
        if (!isOptedForTakeAway) {
            isOptedForTakeAway = true;
            this.price += backPackPrice;
        }
    }

    public void getBill() {
        StringBuilder bill = new StringBuilder("Bill Details:\n");
        bill.append("Base Pizza: ").append(isVeg ? "Veg" : "Non-Veg").append(" - Rs. ").append(isVeg ? 300 : 400).append("\n");
        if (isExtraCheeseAdded) {
            bill.append("Extra Cheese Added: Rs. ").append(extraCheesePrice).append("\n");
        }
        if (isExtraToppingsAdded) {
            bill.append("Extra Toppings Added: Rs. ").append(extraToppingsPrice).append("\n");
        }
        if (isOptedForTakeAway) {
            bill.append("Take Away: Rs. ").append(backPackPrice).append("\n");
        }
        bill.append("Total Bill: Rs. ").append(this.price).append("\n");

        System.out.println(bill.toString());
        System.out.println("\r\n"
        		+ "Thank you for your order! Visit Again!");
    }
}
