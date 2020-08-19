package me.ktakayama.rxjava.udemy.demo.operators.utility;

import io.reactivex.Observable;
import io.reactivex.SingleObserver;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import lombok.extern.slf4j.Slf4j;
import me.ktakayama.rxjava.udemy.demo.util.RxUtil;

@Slf4j
public class AllOperator {

    public void run() {
        Observable.fromIterable(RxUtil.getIntegers(10))
                .all(integer -> integer > 4)
                .subscribe(new SingleObserver<Boolean>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable disposable) {
                        log.info("Subscribed");
                    }

                    @Override
                    public void onSuccess(@NonNull Boolean aBoolean) {
                        log.info("Do all values are greater than 4? {}", aBoolean);
                    }

                    @Override
                    public void onError(@NonNull Throwable throwable) {

                    }
                });
    }
}
