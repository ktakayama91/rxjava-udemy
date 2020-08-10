package me.ktakayama.rxjava.udemy.demo.operators.transforming;

import io.reactivex.Observable;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import me.ktakayama.rxjava.udemy.demo.Observer.GroupedObserverDemo;
import me.ktakayama.rxjava.udemy.demo.util.RxUtil;

public class GroupByOperator {

    public void run() {
        Observable.fromIterable(RxUtil.getIntegers(10))
                .groupBy(new Function<Integer, String>() {
                    @Override
                    public String apply(@NonNull Integer integer) throws Exception {
                        return integer % 2 == 0 ? "Even":"Odd";
                    }
                })
                .observeOn(Schedulers.newThread())
                .subscribe(new GroupedObserverDemo());
    }
}
