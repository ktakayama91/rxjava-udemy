package me.ktakayama.rxjava.udemy.demo.operators.filtering;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import lombok.extern.slf4j.Slf4j;
import me.ktakayama.rxjava.udemy.demo.Observer.ObserverDemo;
import me.ktakayama.rxjava.udemy.demo.util.RxUtil;

@Slf4j
public class DebounceOperator {

    private Random r = new Random();
    private static List<Character> characterList = new ArrayList<>();

    public void run() {
        Observable.interval(2, TimeUnit.SECONDS)
                .map(c -> {
                    characterList.add((char)(r.nextInt(26) + 'a'));
                    return characterList;
                })
                .doOnEach(response -> log.info("Current Values -> {}", response.getValue()))
                .debounce(1, TimeUnit.SECONDS)
                .subscribeOn(Schedulers.newThread())
                .observeOn(Schedulers.newThread())
                .subscribe(new ObserverDemo());

        RxUtil.sleep(10000);
    }
}
