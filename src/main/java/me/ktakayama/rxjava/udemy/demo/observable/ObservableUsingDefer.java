package me.ktakayama.rxjava.udemy.demo.observable;

import io.reactivex.Observable;
import me.ktakayama.rxjava.udemy.demo.Observer.ObserverDemo;
import me.ktakayama.rxjava.udemy.demo.model.Person;
import me.ktakayama.rxjava.udemy.demo.util.RxUtil;

/**
 * @author Kei Takayama
 * Created on 8/7/20.
 */
public class ObservableUsingDefer {

    public void run() {
        Observable<Person> observable = Observable.defer(() -> Observable.fromIterable(RxUtil.getPersons()));

        observable.subscribe(new ObserverDemo());
    }
}
