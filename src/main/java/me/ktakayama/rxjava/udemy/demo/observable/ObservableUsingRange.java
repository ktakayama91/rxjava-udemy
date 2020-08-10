package me.ktakayama.rxjava.udemy.demo.observable;

import io.reactivex.Observable;
import me.ktakayama.rxjava.udemy.demo.Observer.ObserverDemo;

public class ObservableUsingRange {

    public void run() {
        Observable.range(2, 10)
                .subscribe(new ObserverDemo());
    }
}
