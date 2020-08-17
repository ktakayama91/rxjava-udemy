package me.ktakayama.rxjava.udemy.demo.operators.filtering;

import io.reactivex.Observable;
import me.ktakayama.rxjava.udemy.demo.Observer.ObserverDemo;
import me.ktakayama.rxjava.udemy.demo.util.RxUtil;

public class DistinctOperator {

    public void run() {
        Observable.just(1,5,2,4,3,3,4,2,5,1)
        .distinct()
        .subscribe(new ObserverDemo());
    }
}
