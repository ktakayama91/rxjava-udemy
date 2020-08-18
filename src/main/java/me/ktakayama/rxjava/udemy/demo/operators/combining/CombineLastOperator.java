package me.ktakayama.rxjava.udemy.demo.operators.combining;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import lombok.extern.slf4j.Slf4j;
import me.ktakayama.rxjava.udemy.demo.Observer.ObserverDemo;
import me.ktakayama.rxjava.udemy.demo.util.RxUtil;

@Slf4j
public class CombineLastOperator {

    public void run() {
        Observable<Long> observable1 = Observable.interval(1000, TimeUnit.MILLISECONDS);
        Observable<Long> observable2 = Observable.interval(2000, TimeUnit.MILLISECONDS);

        Observable.combineLatest(observable1, observable2, (o1,o2) -> {
            return "first ->" + o1.toString() + " " + "second ->" +o2.toString();

        }).take(6)
                .subscribe(new ObserverDemo());

        RxUtil.sleep(10000);

    }
}
