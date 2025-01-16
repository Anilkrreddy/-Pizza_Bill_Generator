# Pizza Order System

This `Pizza` class allows users to order a pizza with customizable options such as extra cheese, extra toppings, and takeaway packaging. It provides an easy way to calculate the final bill based on the selected options.

## Class Overview

### Pizza Class

**Attributes:**
- `price`: The total price of the pizza.
- `isVeg`: A boolean to indicate if the pizza is vegetarian or non-vegetarian.
- `extraCheesePrice`: The price for adding extra cheese (Default: Rs. 100).
- `extraToppingsPrice`: The price for adding extra toppings (Default: Rs. 150).
- `backPackPrice`: The price for adding takeaway packaging (Default: Rs. 20).
- `isExtraCheeseAdded`: A boolean to indicate if extra cheese is added.
- `isExtraToppingsAdded`: A boolean to indicate if extra toppings are added.
- `isOptedForTakeAway`: A boolean to indicate if takeaway packaging is requested.

**Constructor:**
- `Pizza(boolean veg)`: Initializes the pizza with a base price. The base price is Rs. 300 for a vegetarian pizza and Rs. 400 for a non-vegetarian pizza.

### Methods

- `void addExtraCheese()`: Adds extra cheese to the pizza and updates the price.
- `void addExtraToppings()`: Adds extra toppings to the pizza and updates the price.
- `void takeAway()`: Adds takeaway packaging to the pizza and updates the price.
- `void getBill()`: Prints the bill details including all selected options and total price.

## Usage

Here is an example of how to use the `Pizza` class:

```java
package com.pizzabill.driver;

public class Main {
    public static void main(String[] args) {
        Pizza myPizza = new Pizza(true);  // Create a vegetarian pizza
        myPizza.addExtraCheese();         // Add extra cheese
        myPizza.addExtraToppings();       // Add extra toppings
        myPizza.takeAway();               // Opt for takeaway
        myPizza.getBill();                // Print the final bill
    }
}
