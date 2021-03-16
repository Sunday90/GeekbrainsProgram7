package ru.geekbrains;

public class Plate {
    private int food;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public Plate(int food) {
        setFood(food);
    }

    public void increaseFood(int n) {
        setFood(getFood()+n);
    }

    public void decreaseFood(int n) throws Exception {
        if (n<getFood()) {
            setFood(getFood()-n);
        }
        else throw new Exception("Not enough food in plate for cat`s appetite.");
    }

    public void info() {
        System.out.println("plate: " + getFood());
    }
}
