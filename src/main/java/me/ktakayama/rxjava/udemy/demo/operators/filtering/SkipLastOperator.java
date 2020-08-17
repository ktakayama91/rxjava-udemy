package me.ktakayama.rxjava.udemy.demo.operators.filtering;

import io.reactivex.Observable;
import me.ktakayama.rxjava.udemy.demo.Observer.ObserverDemo;
import me.ktakayama.rxjava.udemy.demo.util.RxUtil;

public class SkipLastOperator {

    public void run() {
        Observable.fromIterable(RxUtil.getIntegers(10))
                .skipLast(5)
                .subscribe(new ObserverDemo());
    }
}
