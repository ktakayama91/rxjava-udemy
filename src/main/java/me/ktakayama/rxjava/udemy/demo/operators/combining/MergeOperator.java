package me.ktakayama.rxjava.udemy.demo.operators.combining;

import io.reactivex.Observable;
import me.ktakayama.rxjava.udemy.demo.Observer.ObserverDemo;
import me.ktakayama.rxjava.udemy.demo.model.Person;
import me.ktakayama.rxjava.udemy.demo.util.RxUtil;

public class MergeOperator {

    public void run() {
        Observable<Person> observable1 = Observable.fromIterable(RxUtil.getPersons());
        Observable<Integer> observable2 = Observable.fromIterable(RxUtil.getIntegers(10));

        Observable.merge(observable1, observable2)
                .subscribe(new ObserverDemo());
    }
}
