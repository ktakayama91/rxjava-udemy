package me.ktakayama.rxjava.udemy.demo.Observer;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ObserverDemo implements Observer {

    private final static Logger LOGGER = LoggerFactory.getLogger(ObserverDemo.class);

    @Override
    public void onSubscribe(@NonNull Disposable disposable) {
        LOGGER.info("On Subscribe");
    }

    @Override
    public void onNext(@NonNull Object o) {
        LOGGER.info("On Next {}", o);
    }

    @Override
    public void onError(@NonNull Throwable throwable) {
        LOGGER.error("On Error {}", throwable.getMessage());
    }

    @Override
    public void onComplete() {
        LOGGER.info("On Complete");
    }
}
