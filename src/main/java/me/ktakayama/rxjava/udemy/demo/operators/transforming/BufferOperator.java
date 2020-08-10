package me.ktakayama.rxjava.udemy.demo.operators.transforming;

import io.reactivex.Observable;
import me.ktakayama.rxjava.udemy.demo.Observer.ObserverDemo;
import me.ktakayama.rxjava.udemy.demo.util.RxUtil;

public class BufferOperator {

    public void run() {
        Observable.fromIterable(RxUtil.getIntegers(13))
                .buffer(3)
                .subscribe(new ObserverDemo());
    }
}
