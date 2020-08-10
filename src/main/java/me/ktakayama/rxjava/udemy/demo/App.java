package me.ktakayama.rxjava.udemy.demo;

import lombok.extern.slf4j.Slf4j;
import me.ktakayama.rxjava.udemy.demo.observable.ObservableUsingCreate;
import me.ktakayama.rxjava.udemy.demo.observable.ObservableUsingDefer;
import me.ktakayama.rxjava.udemy.demo.observable.ObservableUsingFromCallable;
import me.ktakayama.rxjava.udemy.demo.observable.ObservableUsingInterval;
import me.ktakayama.rxjava.udemy.demo.observable.ObservableUsingJust;
import me.ktakayama.rxjava.udemy.demo.observable.ObservableUsingRange;
import me.ktakayama.rxjava.udemy.demo.observable.ObservableUsingTimer;
import me.ktakayama.rxjava.udemy.demo.operators.filtering.BufferOperator;

@Slf4j
public class App 
{
    public static void main( String[] args )
    {
//        log.info("Starting Observable using Just");
//        ObservableUsingJust observableUsingJust = new ObservableUsingJust();
//        observableUsingJust.getLetters();

//        log.info("Starting Observable using Create");
//        ObservableUsingCreate observableUsingCreate = new ObservableUsingCreate();
//        observableUsingCreate.create();

//        log.info("Starting Observable using Defer");
//        ObservableUsingDefer observableUsingDefer = new ObservableUsingDefer();
//        observableUsingDefer.run();

//        log.info("Starting Observable using Interval");
//        ObservableUsingInterval observableUsingInterval = new ObservableUsingInterval();
//        observableUsingInterval.run();

//        log.info("Starting Observable using Timer");
//        ObservableUsingTimer observableUsingTimer = new ObservableUsingTimer();
//        observableUsingTimer.run();

//        log.info("Starting Observable using Range");
//        ObservableUsingRange observableUsingRange = new ObservableUsingRange();
//        observableUsingRange.run();

//        log.info("Starting Observable using from Callable");
//        ObservableUsingFromCallable observableUsingFromCallable = new ObservableUsingFromCallable();
//        observableUsingFromCallable.run();

        log.info("Starting Buffer Operator");
        BufferOperator bufferOperator = new BufferOperator();
        bufferOperator.run();
    }
}
