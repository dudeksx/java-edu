package edu.javacourse.restaurant.attendance.kitchen;

import edu.javacourse.restaurant.attendance.Waiter;

public class Cook {
    // pode ser default
    public void addSandwichToCounter() {
        System.out.println("ADDING NATURAL BURGER TO THE COUNTER");
    }

    // Can be default access
    public void addJuiceToCounter() {
        System.out.println("ADDING JUICE TO THE COUNTER");
    }

    // Can be default access
    public void addComboToCounter() {
        addSandwichToCounter();
        addJuiceToCounter();
    }

    private void prepareSandwich() {
        System.out.println("PREPARING BURGER-TYPE SANDWICH");
    }

    private void prepareSmoothie() {
        System.out.println("PREPARING SMOOTHIE");
    }

    private void prepareCombo() {
        prepareSandwich();
        prepareSmoothie();
    }

    private void selectSandwichIngredients() {
        System.out.println("SELECTING BREAD, SALAD, EGG, AND MEAT");
    }

    private void selectSmoothieIngredients() {
        System.out.println("SELECTING FRUIT, MILK, AND JUICE");
    }

    private void washIngredients() {
        System.out.println("WASHING INGREDIENTS");
    }

    private void blendSmoothie() {
        System.out.println("BLENDING SMOOTHIE IN THE BLENDER");
    }

    private void frySandwichIngredients() {
        System.out.println("FRYING MEAT AND EGG FOR THE BURGER");
    }

    private void askToChangeGas(Storekeeper myFriend) {
        myFriend.changeGas();
    }

    private void requestIngredients(Storekeeper warehouseWorker) {
        warehouseWorker.deliverIngredients();
    }
}
