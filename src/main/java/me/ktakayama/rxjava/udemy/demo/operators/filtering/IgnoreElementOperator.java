package me.ktakayama.rxjava.udemy.demo.operators.filtering;

import io.reactivex.Observable;
import me.ktakayama.rxjava.udemy.demo.Observer.CompletableObserverDemo;
import me.ktakayama.rxjava.udemy.demo.util.RxUtil;

public class IgnoreElementOperator {

    public void run() {
        Observable.fromIterable(RxUtil.getPersons())
                .ignoreElements()
                .subscribe(new CompletableObserverDemo());
    }
}
