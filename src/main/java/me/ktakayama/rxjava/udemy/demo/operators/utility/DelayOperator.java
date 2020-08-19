package me.ktakayama.rxjava.udemy.demo.operators.utility;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import me.ktakayama.rxjava.udemy.demo.Observer.ObserverDemo;
import me.ktakayama.rxjava.udemy.demo.util.RxUtil;

public class DelayOperator {

    public void run() {
        Observable.fromIterable(RxUtil.getPersons())
                .delay(5, TimeUnit.SECONDS)
                .subscribe(new ObserverDemo());

        RxUtil.sleep(6000);
    }
}
