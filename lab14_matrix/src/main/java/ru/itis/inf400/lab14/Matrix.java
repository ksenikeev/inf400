package ru.itis.inf400.lab14;

public class Matrix {
    private float[][] value;

    public Matrix(float[][] value) {

    }

    public Matrix(LAVector[] rows) {

    }

    public Matrix(int rows, int columns) {
        //TODO заполнить нулями
    }

    public Matrix(int rows, int columns, float value) {
        //TODO заполнить значениями value
    }

    public float[][] getComponents() {
        return null;
    }

    public float getComponent(int row, int column) {
        return 0;
    }

    public static Matrix identy(int size) {
        //TODO единичная матрица
        return null;
    }

    //TODO умножение матрицы на вектор столбец справа
    public static LAVector multRVector(Matrix m, LAVector v) {
        return null;
    }

    //TODO умножение матрицы на вектор строку слева
    public static LAVector multLVector(Matrix m, LAVector v) {
        return null;
    }

    //TODO сложение матриц
    public static Matrix summ(Matrix m1, Matrix m2) {
        return null;
    }

    //TODO умножение матриц
    public static Matrix mult(Matrix m1, Matrix m2) {
        return null;
    }
}
