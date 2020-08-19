package me.ktakayama.rxjava.udemy.demo.operators.utility;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import me.ktakayama.rxjava.udemy.demo.Observer.ObserverDemo;
import me.ktakayama.rxjava.udemy.demo.util.RxUtil;

public class TimeoutOperator {

    public void run() {
        Observable.timer(2, TimeUnit.SECONDS)
                .timeout(1, TimeUnit.SECONDS)
                .subscribe(new ObserverDemo());

        RxUtil.sleep(3000);
    }
}
