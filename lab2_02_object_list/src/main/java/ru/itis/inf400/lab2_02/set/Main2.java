package ru.itis.inf400.lab2_02.set;

public class Main2 {

    private Set400Impl<? extends Car> set;

    public static void main(String[] args) {
        Main2 main2 = new Main2();
        Set400Impl<PoliceCar> set = new Set400Impl<>();
        main2.setSet(set);
    }

    public void setSet(Set400Impl<? extends Car> set) {
        this.set = set;
    }
}
