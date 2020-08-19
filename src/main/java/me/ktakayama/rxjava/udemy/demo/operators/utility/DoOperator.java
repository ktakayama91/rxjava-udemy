package me.ktakayama.rxjava.udemy.demo.operators.utility;

import io.reactivex.Observable;
import lombok.extern.slf4j.Slf4j;
import me.ktakayama.rxjava.udemy.demo.Observer.ObserverDemo;

@Slf4j
public class DoOperator {

    public void run() {
        Observable.just("Hello")
                .doOnSubscribe(disposable -> log.info("Do on subscribe"))
                .doOnEach(stringNotification -> log.info("Current value {}", stringNotification.getValue()))
                .doOnNext(s -> log.info("Do on next -> {}", s))
                .doOnComplete(() -> log.info("Do on Complete"))
                .subscribe(new ObserverDemo());
    }
}
