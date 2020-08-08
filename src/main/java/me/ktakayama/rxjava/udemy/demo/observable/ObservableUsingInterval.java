package me.ktakayama.rxjava.udemy.demo.observable;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import me.ktakayama.rxjava.udemy.demo.Observer.ObserverDemo;
import me.ktakayama.rxjava.udemy.demo.util.RxUtil;

/**
 * @author Kei Takayama
 * Created on 8/7/20.
 */
public class ObservableUsingInterval {

    public void run() {
        Observable.interval(1, TimeUnit.SECONDS)
                .subscribe(new ObserverDemo());
        RxUtil.sleep(3000);
    }
}
