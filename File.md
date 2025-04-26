# File
Управление информацией о файлах и директориях файловой системы

## Конструкторы
- File(String путь_к_каталогу)
- File(String путь_к_каталогу, String имя_файла)
- File(File каталог, String имя_файла)

## Методы

- boolean createNewFile()
- boolean delete()
- boolean exists()
- String getAbsolutePath()
- String getName()
- boolean isDirectory()
- boolean isFile()
- String getParent()
- boolean mkdir()
- boolean renameTo(File dest)
- File[] listFiles() - возвращает массив файлов и подкаталогов

# Files - утилитарный класс

- createFile
- createDirectory
- copy
- move
- delete