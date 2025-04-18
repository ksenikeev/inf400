# lambda expressions

lambda - анонимная функция

(arg1, ... , argN) -> {function body}

function(arg1, ... , argN) {body}

() -> {return x;}

### 1 аргумент:
```
(a) -> {function body}
a -> {function body}
```

### 1 операнд:
```
    (arg1, ... , argN) -> { return arg1 + ... + argN }
    (arg1, ... , argN) -> return arg1 + ... + argN
    (arg1, ... , argN) -> arg1 + ... + argN

```

### 1 операнд, использующий метод method класса Func:
```
(arg1, ... , argN) -> Func.method(arg1, ... , argN)

Func::method
```