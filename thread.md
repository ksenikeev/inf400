# 


currentThread()
getId()
getName() / setName(name)

join() - ожидаем завершения выполнения потока
{
    thread.join();

    // код будет выполнен только после завершения потока thread 
}
setDaemon(boolean on) - 
sleep(long millis) - "усыпить" поток
Runtime.getRuntime().availableProcessors();

# synchronized
```
public synchronized void func() {

//...логика метода
}
```

```
private SyncObject syncObj = new SyncObject();


synchronized (syncObj) {

   // одновременно здесь может быть только один поток
}
```

```
public void func() {

   synchronized (this)
   {
       //...логика метода
   }
}


public synchronized void func() {

   
}
```