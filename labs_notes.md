# Заметки по практике Информатика 11-400

## 28.12.2024

```java
interface ICompareObject {
    int compare(Object var1, Object var2);
}

public class ArrayUtils {
    
    public static void sort(Object[] array, ICompareObject comparator) {
        for (...)
            for (...)
            if (comparator.compare(array[j], array[j + 1]) > 0) {
                swap(j, j + 1);
            }
    }
} 
```

## 21.12.2024



## 20.12.2024
Интерфейс

```java
public interface IMove {
    void move();
}
```

```java
/**
 * 0 - если объект совпадает с other
 * положительное число - если объект больше other
 * отрицательное число - если объект меньше other
 */
public interface CanCompare {
    int compare(CanCompare other);
}
```

Описать класс, реализующий этот интерфейс,
создать двусвязный список, хранящий экземпляры этого класса,
и создать метод, сортирующий этот список


Бинарные деревья, алгоритмы обхода

## 14.12.2024

связный список

Задание: Отсортировать по атрибуту value двунаправленный связный список (пузырьком)

## 13.12.2024

игра зверушки

## 30.11.2024

- Пакеты
 - Формируется как директория, в классе указываем принадлежность к пакету директивой package
 - доступ к классу из другого пакета обеспечиваем директивой import
 
Пиццерия.
 - Пиццерия
   - Название
   - Адрес
   - Рейтинг
 - Меню (Пицца)
  - Название
  - Вес
  - Цена
  - Размер
  - Ингридиенты
 - Заказ
  - Номер 
  - Клиент
  - Время
  - Пиццы
  - Стоимость
  - Скидка
  - СуммаКОплате
 - Клиент
  - Имя
  - Скидка (5, 10, 15, 20, 30)

Программа:
  - Новая пиццерия
  - Меню (описать все пиццы)
  - Клиенты
  - Заказы

## 29.11.2024
- ООП
- Описание точки Point
- Описать линию Line(Point p1, Point p2)
- Определить многоугольник на плоскости как массив отрезков Line
  Line[] triangle = new Line[3]; ...
- Создать программу, сортирующую доставщиков пиццы по среднему рейтингу
  
    Описать в отдельном классе доставщика
    Атрибуты (Члены класса):
      - Имя
      - Возраст
      - Рейтинги (целочисленный массив со значениями от 1 до 10 за каждую доставку, массив взять длиной 100)

    Методы:
      - Установка имени
      - Установка Возраста
      - Добавление рейтинга
      - Вывод рейтингов на консоль
      - Получение среднего рейтинга

    Сортировку реализовать отдельным методом в классе Main

## 22.11.2024
- рекурсия

## 16.11.2024
- String
- switch case
- args
- тернарный оператор
- Задача на доп балл: вычислить число Фибоначи рекурсией


## 15.11.2024
- Ввод с консоли
- Определение методов
- Игра "Лабиринт"

## 9.11.2024
- аудиторные задачки на массивы

1. Найти максимум в массиве из действительных чисел.
2. Найти минимум в массиве из действительных чисел.
3. Найти сумму элементов массива.
4. Найти среднее арифметическое всех элементов массива.
5. Найти произведение всех элементов массива (long[] ).
6. Найти разницу между суммой всех элементов на нечетных позициях и  суммой всех элементов на четных позициях (позиция: 1 -й, 2-й, …; отличается от индекса).
7. Из двух массивов составить третий, «приставив» второй к первому ([1,2], [3,4] → [1,2,3,4]).
8. Создать массив, состоящий из каждого третьего элемента второго массива.
9. Вывести гистограмму, направленную вниз по значению элементов массива
   [2,3,1,4]
   xxxx
   xx x
    x x
      x
10. Проверить наличие в целочисленном массиве элемента с определенным значением.
11. Сравнить два массива из целых чисел одинаковой длины
(проверяется совпадение чисел на одинаковых позициях). 
Вывести «Одинаковые», если они совпадают, или число — индекс, начиная с которого найдены расхождения.
12. Сравнить два массива из целых разных чисел одинаковой длины 
(проверяется только наличие одинаковых чисел, которые могут занимать в массивах разные позиции 
[1,2,3]~[1,3,2]). Вывести «Эквивалентны» или «Различны».
13. Заданы два вектора размерности N в евклидовом пространстве, найти их скалярное произведение.
14. Найти сумму двух матриц, заданных двумерными массивами. Проверить на возможность их сложения. 
15. Найти произведение матриц, заданных двумерными массивами. Проверить на возможность их перемножения.

- задачи 11 - 15 отдельным блоком на баллы


## 8.11.2024

- for
- определение массива
- определение двумерного массива
- Задание: с помощью двумерного массива задать картинку (16х16, каждый элемент массива - цвет пикселя, которым будет рисоваться картинка
например, флаг России (картинка 3x3):
int [][] flag = {
    { 0xffffff, 0xffffff, 0xffffff}, // белая полоса из 3-х пикселей
    { 0x0000ff, 0x0000ff, 0x0000ff}, // синяя полоса
    { 0xff0000, 0xff0000, 0xff0000}, // красная полоса
}
Отрисовать в консоли картинку, изображая пиксель цветным прямоугольником

## 2.11.2024
- операции с примитивными типами
- приоритет операций
- задача на приоритеты и вычисление
- цикл while
- Задание (на баллы): вычисление e^x через ряд Маклорена с точностью до 0.000001

## 2.11.2024
- Установка Java
- Компиляция и запуск в консоли
- Примитивные типы данных
- Задание: вывести "таблицу умножения" для булевских операций
