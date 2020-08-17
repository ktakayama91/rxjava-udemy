package me.ktakayama.rxjava.udemy.demo.observable;

import io.reactivex.Single;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SingleObservable {

    public void run() {
        Single.just("This is a Single Observable.")
                .doOnSubscribe(disposable -> log.info("Do On Subscribe"))
                .doOnError(throwable -> log.error("Error", throwable.getMessage()))
        .subscribe(s -> log.info(s));
    }
}
