# Работа с датой и временем

## Класс java.util.Date

Внутреннее представление long - количество миллисекунд с 1.01.1970

new Date() - текущее время-дата

new Date(mmsec) - инициализация количеством миллисекунд с 1.01.1970

long getTime() - количество миллисекунд с 1.01.1970

setTime(mmsec) - инициализация количеством миллисекунд с 1.01.1970

### Сравнение дат

boolean after(Date when)

boolean before(Date when)

int compareTo(Date anotherDate)

### Форматирование и парсинг

SimpleDateFormat("format").parse(date_as_string)

SimpleDateFormat("format").format(date)

```java
Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2022-10-30");
```

Параметры форматирования:

- y	Year	Year	1996; 96
- M	Month in year (context sensitive)	Month	July; Jul; 07
- d	Day in month	Number	10

- H	Hour in day (0-23)	Number	0
- h	Hour in am/pm (1-12)	Number	12
- m	Minute in hour	Number	30
- s	Second in minute	Number	55
- S	Millisecond	Number	978

- X	Time zone	ISO 8601 time zone	-08; -0800; -08:00

- G	Era designator	Text	AD
- Y	Week year	Year	2009; 09
- L	Month in year (standalone form)	Month	July; Jul; 07
- w	Week in year	Number	27
- W	Week in month	Number	2
- D	Day in year	Number	189
- F	Day of week in month	Number	2
- E	Day name in week	Text	Tuesday; Tue
- u	Day number of week (1 = Monday, ..., 7 = Sunday)	Number	1
- a	Am/pm marker	Text	PM
- H	Hour in day (0-23)	Number	0
- k	Hour in day (1-24)	Number	24
- K	Hour in am/pm (0-11)	Number	0
- z	Time zone	General time zone	Pacific Standard Time; PST; GMT-08:00
- Z	Time zone	RFC 822 time zone	-0800
