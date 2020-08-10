package me.ktakayama.rxjava.udemy.demo.operators.transforming;

import io.reactivex.Observable;
import me.ktakayama.rxjava.udemy.demo.Observer.ObserverDemo;
import me.ktakayama.rxjava.udemy.demo.util.RxUtil;

public class FlatMapOperator {

    public void run() {
        Observable.fromIterable(RxUtil.getIntegers(10))
                .flatMap(this::duplicate)
                .subscribe(new ObserverDemo());
    }

    private Observable<Integer> duplicate(Integer integer) {
        return Observable.create(observableEmitter -> {
            if (!observableEmitter.isDisposed()) {
                observableEmitter.onNext(integer * 2);
            } else {
                observableEmitter.onComplete();
            }
        });
    }
}
