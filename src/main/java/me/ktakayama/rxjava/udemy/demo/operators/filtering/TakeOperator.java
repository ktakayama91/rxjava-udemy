package me.ktakayama.rxjava.udemy.demo.operators.filtering;

import io.reactivex.Observable;
import me.ktakayama.rxjava.udemy.demo.Observer.ObserverDemo;
import me.ktakayama.rxjava.udemy.demo.util.RxUtil;

public class TakeOperator {

    public void run() {
        Observable.fromIterable(RxUtil.getIntegers(10))
                .take(3)
                .subscribe(new ObserverDemo());
    }
}
