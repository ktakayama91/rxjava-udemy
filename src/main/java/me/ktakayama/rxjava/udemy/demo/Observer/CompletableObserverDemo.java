package me.ktakayama.rxjava.udemy.demo.Observer;

import io.reactivex.CompletableObserver;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CompletableObserverDemo implements CompletableObserver {
    @Override
    public void onSubscribe(@NonNull Disposable disposable) {
        log.info("On Subscribe");
    }

    @Override
    public void onComplete() {
        log.info("On Complete");
    }

    @Override
    public void onError(@NonNull Throwable throwable) {
        log.error("On Error {}", throwable.getMessage());
    }
}
