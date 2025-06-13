# Рефлексия

Исследование структуры объекта

## Задач

- Определение типа объекта
- Определение членов класса (публичные, приватные)
  - прочитать значение
  - присвоить значение
- Определение методов (название, тип возвращаемого значения, типы аргументов)
  - вызов метода
- Определение конструкторов класса

## Class

Метаданные объекта доступны через его класс `obj.getClass()`:
```java
Person person = new Person();

Class clazz = person.getClass();
```

## Публичные члены класса
```java
Field[] fields = person.getClass().getFields();

// getType - Class<?>
for (Field f : fields) {
    System.out.println(f.getName() + " : " + f.getType());
}
```

## Список всех членов
```java
Field[] fields = person.getClass().getDeclaredFields();
        for (Field f : fields) {
            f.setAccessible(true);
            System.out.println(f.getName() + " : " + f.getType() + " = " + f.get(person));
        }
```

## Список методов
```java
Method[] methods = person.getClass().getMethods();
        for (Method m : methods) {
            System.out.println(m.getReturnType().getTypeName() + " " + m.getName() );
        }
```

## Список всех методов
```java
Method[] methods = person.getClass().getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m.getReturnType().getTypeName() + " " + m.getName() );
        }
```

## Вызов метода
```java

```

## Список конструкторов
```java
Constructor[] constructors = person.getClass().getConstructors();
        for (Constructor c :constructors) {
            System.out.println(c.getName() + " " + c.getParameterCount());
        }
```

## Аннотации

Способ маркировки класса/элементов класса для придания дополнительных свойств или функций
- @Override
- @Deprecated
- @SuppressWarnings("unchecked")
- @FunctionalInterface
- @SafeVarargs (подавление сообщений при использовании аргументов обобщенных типов)

```java
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Company{
	String name() default "name";
	String value() default "1";
}
```

- @Inherited передает аннотацию по наследству
- @Target - над каким элементом можно применять аннотацию
  - ElementType.ANNOTATION_TYPE
  - ElementType.CONSTRUCTOR
  - ElementType.FIELD
  - ElementType.LOCAL_VARIABLE
  - ElementType.METHOD
  - ElementType.PACKAGE
  - ElementType.PARAMETER
  - ElementType.TYPE
- @Retention - 
  - SOURCE
  - CLASS
  - RUNTIME