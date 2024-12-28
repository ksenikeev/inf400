# Связные списки

1. Создаем структуру (класс), которая будет хранить некоторое значение 
и ссылку на следующий элемент
```
public class Element {
    public int value;
    public Element next;
    public Element(int value) {
        this.value = value;
    }
}
```
2. Создаем начало списка 
```
    Element head = new Element(1);
```
3. Обход всех элементов, начиная с головы
```
    Element e = head;
    while (e != null) {
        System.out.println(e.value);
        e = e.next;
    }
```
4. Добавление нового элемента
    1) Находим конец списка (последний элемент)
```
    Element e = head;
    while (e.next != null) {
        e = e.next;
    }
    \\теперь e - последний элемент 
```
    2) Создаем новый элемент и делаем присвоение  
```
    Element newElement = new Element(6);
    e.next = newElement;
```
теперь элемент со значением 6 - последний в связном списке 