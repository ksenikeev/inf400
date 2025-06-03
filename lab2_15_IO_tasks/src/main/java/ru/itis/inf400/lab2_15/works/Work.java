package ru.itis.inf400.lab2_15.works;

import java.util.Set;

public class Work extends Thread {
    private Integer time;
    private Set<Work> dependencies;

    public Work(Integer time, Set<Work> dependencies) {
        super();
        this.time = time;
        this.dependencies = dependencies;
    }

    public void run() {
        // дожидаемся окончания зависимых работ (join())
        // "выполняем" нашу работу (sleep(1000 * time) )
    }
}
