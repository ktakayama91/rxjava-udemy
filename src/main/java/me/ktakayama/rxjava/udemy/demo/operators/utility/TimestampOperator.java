package me.ktakayama.rxjava.udemy.demo.operators.utility;

import io.reactivex.Observable;
import me.ktakayama.rxjava.udemy.demo.Observer.ObserverDemo;

public class TimestampOperator {

    public void run() {
        Observable.just("Hello", "World")
                .timestamp()
                .subscribe(new ObserverDemo());
    }
}
