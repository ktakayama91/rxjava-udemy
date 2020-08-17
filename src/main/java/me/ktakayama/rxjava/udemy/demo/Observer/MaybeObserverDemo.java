package me.ktakayama.rxjava.udemy.demo.Observer;

import io.reactivex.MaybeObserver;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MaybeObserverDemo implements MaybeObserver {
    @Override
    public void onSubscribe(@NonNull Disposable disposable) {
        log.info("On Subscribe");
    }

    @Override
    public void onSuccess(@NonNull Object o) {
        log.info("On Success -> {}", o);
    }

    @Override
    public void onError(@NonNull Throwable throwable) {
        log.error("On Error {}", throwable.getMessage());
    }

    @Override
    public void onComplete() {
        log.info("On Complete");
    }
}
