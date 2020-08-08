package me.ktakayama.rxjava.udemy.demo.observable;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.annotations.NonNull;
import lombok.extern.slf4j.Slf4j;
import me.ktakayama.rxjava.udemy.demo.Observer.ObserverDemo;
import me.ktakayama.rxjava.udemy.demo.model.Person;
import me.ktakayama.rxjava.udemy.demo.util.PersonUtil;

@Slf4j
public class ObservableUsingCreate {

    public void create() {
        List<Person> persons = PersonUtil.getPersons();

        Observable.create(new ObservableOnSubscribe<Object>() {
            @Override
            public void subscribe(@NonNull ObservableEmitter<Object> observableEmitter) throws Exception {
                try {
                    persons.forEach(observableEmitter::onNext);
                } catch (Exception e) {
                    observableEmitter.onError(e);
                }
                observableEmitter.onComplete();
            }
        }).subscribe(new ObserverDemo());
    }


}
