package me.ktakayama.rxjava.udemy.demo.Observer;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.observables.GroupedObservable;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GroupedObserverDemo implements Observer<GroupedObservable<String, Integer>> {
    @Override
    public void onSubscribe(@NonNull Disposable disposable) {
        log.info("On Subscribe");
    }

    @Override
    public void onNext(@NonNull GroupedObservable<String, Integer> booleanIntegerGroupedObservable) {
        log.info("Key {}", booleanIntegerGroupedObservable.getKey());

        booleanIntegerGroupedObservable.subscribe(new ObserverDemo());
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
