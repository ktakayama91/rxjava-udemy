package me.ktakayama.rxjava.udemy.demo.operators.combining;

import io.reactivex.Observable;
import me.ktakayama.rxjava.udemy.demo.Observer.ObserverDemo;
import me.ktakayama.rxjava.udemy.demo.util.RxUtil;

public class ZipOperator {

    public void run() {
        Observable observable1 = Observable.fromIterable(RxUtil.getIntegers(10));
        Observable observable2 = Observable.fromIterable(RxUtil.getPersons());

        observable1.zipWith(observable2, (o1,o2) ->
                o1.toString() + ": " + o2.toString())
                .subscribe(new ObserverDemo());
    }
}
