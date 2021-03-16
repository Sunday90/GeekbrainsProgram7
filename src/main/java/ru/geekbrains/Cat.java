package ru.geekbrains;

public class Cat {
    private String name;
    private int appetite;
    private boolean sitost;

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    private void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSitost() {
        return sitost;
    }

    private void setSitost(boolean sitost) {
        this.sitost = sitost;
    }

    public Cat(String name, int appetite) {
        setName(name);
        setAppetite(appetite);
        setSitost(false);
    }

    public void eat(Plate p) {
        try {
            if (p.getFood()>getAppetite()) {
                p.decreaseFood(appetite);
                setSitost(true);
            }
            else {
                throw new Exception("Not enough food in plate for cat`s appetite.");
            }
        }

        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}