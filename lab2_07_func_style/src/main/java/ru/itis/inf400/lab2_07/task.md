

# Реализовать метод collect в интерфейсе Map400, возвращающий список List
список получается путем преобразования значений Map400 с помощью метода apply интерфейса Function<T, R>

```java
List<R> collect(Function<T, R> function);
```