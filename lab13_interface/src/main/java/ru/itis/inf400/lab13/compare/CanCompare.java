package ru.itis.inf400.lab13.compare;

/**
 * 0 - если объект совпадает с other
 * положительное число - если объект больше other
 * отрицательное число - если объект меньше other
 *
 * other - объект, реализующий интерфейс CanCompare
 */
public interface CanCompare {
    int compare(CanCompare other);
}
