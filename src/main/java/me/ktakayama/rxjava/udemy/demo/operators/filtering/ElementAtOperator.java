package me.ktakayama.rxjava.udemy.demo.operators.filtering;

import io.reactivex.Observable;
import me.ktakayama.rxjava.udemy.demo.Observer.MaybeObserverDemo;
import me.ktakayama.rxjava.udemy.demo.util.RxUtil;

public class ElementAtOperator {

    public void run() {
        Observable.fromIterable(RxUtil.getIntegers(10))
                .elementAt(5)
                .subscribe(new MaybeObserverDemo());
    }
}
