# Потоки ввода-ввывода в Java (InputStream OutputStream)

Работа с устройствами ввода-вывода в Java основана на классах `InputStream` и `OutputStream`, описывающих 
прием и передачу потока байтов (т.е. минимальный объем информации в рамках этой технологии - 8 бит)

## InputStream - абстрактный класс, описывающий работу с входным потоком

```java
public abstract class InputStream implements Closeable {
    // ...
}
```

После использования класс необходимо закрыть методом `close()`!

Основные методы:
- `read()` - чтение следующего байта из потока (0 .. 255), значение `-1` озночает конец потока
- `read(byte[] b)` - чтение данных из потока в буфер `b`, возвращает кол-во считанных байт или -1, если поток завершен
- `readAllBytes()` - считывает все доступные данные
- `available()` - возвращает кол-во доступных для чтения данных
- `close()` - закрывает входной поток, и освобождает все ресурсы системы, с ним связанные
- `transferTo(OutputStream out)` - считывает данные из входного потока и отправляет их в выходной поток

Базовые реализации:


## OutputStream - абстрактный класс, описывающий работу с входным потоком

```java
public abstract class OutputStream implements Closeable, Flushable {
    // ...
}
```

После использования класс необходимо закрыть методом `close()`!

Основные методы:
- `write(int b)` - записывает в поток 1 байт (int используется для того, чтобы передать значение в диапазоне 0..255)
- `write(byte[] b, int off, int len)` - записать в поток данные из массива (начиная с элемента `b[off]` в количестве `len`)
- `flush()` - сбросить буферы во входной поток устройства
- `close()` - закрывает выходной поток, и освобождает все ресурсы системы, с ним связанные

## Основные реализации
### Работа с файлами
- `FileInputStream`
- `FileOutputStream`

### Работа с массивами как с потоками
- `ByteArrayInputStream`
- `ByteArrayOutputStream`


# FilterInputStream / FilterOutputStream - базовые потоки-обертки для автоматического преобразования данных IO потоков

```
    InputStream is = ...
    FilterInputStream fis = new FilterInputStream(is);
```


## Буферизация (позволяет оптимизировать чтение и запись)

- `BufferedInputStream`
- `BufferedOutputStream`


## Типизированные потоки ввода-вывода DataInputStream / DataOutputStream

### `DataInputStream`

    - boolean readBoolean(): считывает из потока булевое однобайтовое значение

    - byte readByte(): считывает из потока 1 байт

    - char readChar(): считывает из потока значение char

    - double readDouble(): считывает из потока 8-байтовое значение double

    - float readFloat(): считывает из потока 4-байтовое значение float

    - int readInt(): считывает из потока целочисленное значение int

    - long readLong(): считывает из потока значение long

    - short readShort(): считывает значение short

    - String readUTF(): считывает из потока строку в кодировке UTF-8

    - int skipBytes(int n): пропускает при чтении из потока n байтов


### `DataOutputStream`
    - writeBoolean(boolean v) : записывает в поток булевое однобайтовое значение

    - writeByte(int v): записывает в поток 1 байт, которые представлен в виде целочисленного значения


    - writeChar(int v): записывает 2-байтовое значение char

    - writeDouble(double v): записывает в поток 8-байтовое значение double

    - writeFloat(float v): записывает в поток 4-байтовое значение float

    - writeInt(int v): записывает в поток целочисленное значение int

    - writeLong(long v): записывает в поток значение long

    - writeShort(int v): записывает в поток значение short

    - writeUTF(String str): записывает в поток строку в кодировке UTF-8


## PrintStream

- print
- println
- printf

- write (int, byte[])

# ObjectInputStream / ObjectOutputStream


# Потоки `Writer` и `Reader`

Потоки `Writer` и `Reader` функционально схожи с потоками `InputStream` и `OutputStream`,
но в отличие от них работают с символами (`char`).

### Основные методы `Writer`: 
- `append(char c)`
- `close()`
- `write(int char)`
- `write(char[] buf, int offset, int count)`
- `write(String string, int offset, int count)`

### Наследники класса `Writer`:

- BufferedWriter - буферизированный выходной символьный поток; позволяет повысить производительность за счёт снижения количества операций физической записи в выходное устройство;
- CharArrayWriter - выходной поток, который пишет в символьный массив;
- FileWriter - выходной поток, пишущий в файл; в конструкторе можно определить вывод в конец файла. Создание объекта не зависит от наличия файла, он будет создан в случае необходимости. Если файл существует и он доступен только для чтения, то передаётся исключение IOException
- FilterWriter - фильтрующий писатель
- OutputStreamWriter -выходной поток, транслирующий байты в символы
- PrintWriter - выходной поток, включающий методы print() и println()
- StringWriter - выходной поток, пишущий в строку

### Основные методы `Reader`
- `int read()`
- `close()`
- `boolean ready()`
- `int read(char[] buf, int offset, int count)`

### Наследники класса `Reader`:

- BufferedReader - буферизированный входной символьный поток; увеличивает производительность за счёт буферизации ввода;
- CharArrayReader - входной поток чтения символьного массива;
- FileReader - входной поток чтения содержимого файла; в конструкторе класса нужно указать либо путь к файлу, либо объект типа File;
- FilterReader - фильтрующий читатель;
- InputStreamReader - входной поток, транслирующий байты в символы;
- StringReader - входной поток, читающий из строки.

# Использование потоков в блоке `try`

Автоматическое закрытие
```
try (InputStream is = new FileInputStream(in)) {
    //....
}
```