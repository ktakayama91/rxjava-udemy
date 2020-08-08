package me.ktakayama.rxjava.udemy.demo.observables;

import io.reactivex.Observable;
import me.ktakayama.rxjava.udemy.demo.Observer.ObserverDemo;

public class ObservableUsingJust {

    public void getLetters() {
        Observable.just("a","b","c","d","e","f","g","h","i","j")
                .subscribe(new ObserverDemo());
    }
}
