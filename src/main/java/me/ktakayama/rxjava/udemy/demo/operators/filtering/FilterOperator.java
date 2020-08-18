package me.ktakayama.rxjava.udemy.demo.operators.filtering;

import io.reactivex.Observable;
import me.ktakayama.rxjava.udemy.demo.Observer.ObserverDemo;
import me.ktakayama.rxjava.udemy.demo.util.RxUtil;

public class FilterOperator {

    public void run() {
        Observable.fromIterable(RxUtil.getPersons())
                .filter(person -> person.getAge() % 4 == 0)
                .subscribe(new ObserverDemo());
    }
}
