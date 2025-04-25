# Функциональное программирование

1. Функциональное программирование можно определить как набор идей, в которых базовым понятием является функция:

```java
    x -> f(x)
```

2. Задействованные переменные - обязательно `final`

3. Функция не использует внешнее состояние, не изменяет состояние. Данные поступают в функцию через аргументы.

4. Аргументами функций могут быть функции.

5. Отложенные вычисления

```java
    studentList.filter_by_group("11-403").sort_by_name(ascent).filter_by_gender(male).execute()
```

6. Лямбда исчисление - основа функционального стиля во многих языках
- Аппликация - применение функции к заданному значению аргумента `f x, f(x)`
- Абстракция - строит функцию по заданному выражению `(&lambda; x. t[x])` означает функцию `x -> t(x)`, пример: функция
  `f(x) = 5x - 1`, примененная к аргументу `2`, может быть выражена в виде аппликации
  `((&lambda; x. 5x - 1))2`


## Stream API

Удобно применять тогда, когда код укладывается в шаблон:

```java
    source -> operation -> operation -> operation -> fin
```
- source: `Collection`, `Iterator` (источник данных)
- operation: `filter`, `sort`, `map`, ... (операции над данными: отбор, сортировка, преобразование)
- fin: `collections`, `locals`, `count`, `forEach`, ... (формирование результата)

### Описание
```java
public interface Stream<T> extends BaseStream<T, Stream<T>> { ...
```

- обработчик некоторого множества
- не является структурой данных
- отложенное выполнение операций
- не изменяет источник
- одноразовый

### Stream pipeline

Методы Stream API разделяют на _промежуточные_ (конвейерные) и _терминальные_.

- Конвейерные методы возвращают `Stream<?>` (их выполнение отложено до вызова терминального метода)
- Терминальные методы возвращают некоторый объект, отличный от `Stream<?>` (фактически запускают процессы, описанные ранее)

**Конвейерные:**
* **filter** - возвращает только записи, соответствующие условию
* **sorted** - сортирует значения с помощью `Comparator`
* **map** - преобразует каждый элемент стрима, применяя функцию `x &in; T -> f(x) &in; R`, при этом из исходного
  `Stream<T>` получается `Stream<R>`
* **distinct** - убирает из стрима дубликаты
* **mapToDouble, mapToInt** - возвращают числовой стрим с дополнительными методами
* flatMap(Function<T, Stream<R>> mapper) - преобразует набор стримов в один

**Терминальные:**
* **forEach** - применяет некоторое действие (не возвращающее значение) `void op(x)` к каждому элементу
* **count** - возвращает количество элементов
* **min** - возвращает минимальный элемент (по заданному `Comparator`-ом отношению порядка)
* **max** - возвращает максимальный элемент (по заданному `Comparator`-ом отношению порядка)
* **average** - возвращает среднее значение (только для числового стрима)
* **toArray** - возвращает массив из элементов стрима
* **collect** - возвращает коллекцию из элементов стрима (пример: `.collect(Collectors.toList())`)
* **toList**
* **toSet**
*  Optional<T> reduce(BinaryOperator<T> accumulator)
*  T reduce(T identity, BinaryOperator<T> accumulator)
*  U reduce(U identity, BiFunction<U,? super T,U> accumulator, BinaryOperator<U> combiner)
*  Collector<T, ?, M> toMap(Function<? super T, ? extends K> keyMapper,
   Function<? super T, ? extends U> valueMapper,
   BinaryOperator<U> mergeFunction)


- Стрим из List: list.stream()
- Стрим из Map: map.entrySet().stream()
- Стрим из массива: Arrays.stream(array)
- Стрим из указанных элементов: Stream.of("1", "2", "3")



**Примеры**

Младший человек из списка людей:

```java
    Person{ String name; Integer age}
    List<Person> persons = ...
    Person little = persons.stream().min((p1,p2) -> (p1.age.compareTo(p2.age))).get();
```

Средний возраст людей из списка:

```java
    Person{ String name; Integer age}
    List<Person> persons = ...
    double avg = persons.stream().mapToDouble(p -> (Double) p.age).average().getAsDouble();
```
        HashSet<Integer> hashSet;
        TreeSet<Integer> treeSet;
        ArrayList<Integer> arrayList;
        LinkedList<Integer> linkedList;
        HashMap<Integer, String> hashMap;

### Преобразования набора данных в набор другого типа
```java
    List<String> lst = ...;
    lst.map()
    
```

