package me.ktakayama.rxjava.udemy.demo.operators.utility;

import io.reactivex.Observable;
import lombok.extern.slf4j.Slf4j;
import me.ktakayama.rxjava.udemy.demo.util.RxUtil;

@Slf4j
public class ContainsOperator {

    public void run() {
        Observable.fromIterable(RxUtil.getIntegers(10))
                .contains(5)
                .subscribe(aBoolean -> log.info("Did the observable emit 5? {}", aBoolean));
    }
}
