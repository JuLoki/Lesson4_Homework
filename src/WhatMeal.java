public class WhatMeal {
    public static void main(String[] args) {
        for (String TypeFood : args) {
        if (TypeFood.equals("milk")) {
            System.out.println("milkType");
        } else if (TypeFood.equals("apple")){
            System.out.println("fruit");
        } else if (TypeFood.equals("tomato")) {
            System.out.println("vagitables");
        } else {
            System.out.println("not on the list");

        }
        }
    }
}
