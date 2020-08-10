package me.ktakayama.rxjava.udemy.demo.operators.transforming;

import io.reactivex.Observable;
import me.ktakayama.rxjava.udemy.demo.Observer.ObserverDemo;
import me.ktakayama.rxjava.udemy.demo.util.RxUtil;

public class ScanOperator {

    public void run() {
        Observable.fromIterable(RxUtil.getIntegers(10))
                .scan((t1, t2) -> t1 + t2)
                .subscribe(new ObserverDemo());
    }
}
