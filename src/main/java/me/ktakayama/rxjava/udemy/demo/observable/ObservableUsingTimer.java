package me.ktakayama.rxjava.udemy.demo.observable;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import me.ktakayama.rxjava.udemy.demo.Observer.ObserverDemo;
import me.ktakayama.rxjava.udemy.demo.util.RxUtil;

public class ObservableUsingTimer {

    public void run() {
        Observable.timer(5, TimeUnit.SECONDS)
                .subscribe(new ObserverDemo());
        RxUtil.sleep(10000);
    }
}
