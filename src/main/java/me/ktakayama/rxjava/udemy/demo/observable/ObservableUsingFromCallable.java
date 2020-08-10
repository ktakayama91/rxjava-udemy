package me.ktakayama.rxjava.udemy.demo.observable;

import java.util.concurrent.Callable;

import io.reactivex.Observable;
import me.ktakayama.rxjava.udemy.demo.Observer.ObserverDemo;
import me.ktakayama.rxjava.udemy.demo.util.RxUtil;

public class ObservableUsingFromCallable {

    public void run() {
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                RxUtil.sleep(2000);
                return "Hello";
            }
        };

        /* from callable */
        Observable.fromCallable(callable)
                .subscribe(new ObserverDemo());
    }
}
