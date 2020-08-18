package me.ktakayama.rxjava.udemy.demo;

import lombok.extern.slf4j.Slf4j;
import me.ktakayama.rxjava.udemy.demo.observable.SingleObservable;
import me.ktakayama.rxjava.udemy.demo.operators.filtering.DebounceOperator;
import me.ktakayama.rxjava.udemy.demo.operators.filtering.DistinctOperator;
import me.ktakayama.rxjava.udemy.demo.operators.filtering.ElementAtOperator;
import me.ktakayama.rxjava.udemy.demo.operators.filtering.FilterOperator;
import me.ktakayama.rxjava.udemy.demo.operators.filtering.IgnoreElementOperator;
import me.ktakayama.rxjava.udemy.demo.operators.filtering.SkipLastOperator;
import me.ktakayama.rxjava.udemy.demo.operators.filtering.SkipOperator;
import me.ktakayama.rxjava.udemy.demo.operators.filtering.TakeLastOperator;
import me.ktakayama.rxjava.udemy.demo.operators.filtering.TakeOperator;
import me.ktakayama.rxjava.udemy.demo.operators.transforming.FlatMapOperator;
import me.ktakayama.rxjava.udemy.demo.operators.transforming.GroupByOperator;
import me.ktakayama.rxjava.udemy.demo.operators.transforming.MapOperator;
import me.ktakayama.rxjava.udemy.demo.operators.transforming.ScanOperator;
import me.ktakayama.rxjava.udemy.demo.util.RxUtil;

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

//        log.info("Starting Buffer Operator");
//        BufferOperator bufferOperator = new BufferOperator();
//        bufferOperator.run();

//        log.info("Starting Group by Operator");
//        GroupByOperator groupByOperator = new GroupByOperator();
//        groupByOperator.run();
//        RxUtil.sleep(10000);

//        log.info("Starting Map Operator");
//        MapOperator mapOperator = new MapOperator();
//        mapOperator.run();

//        log.info("Starting Flat Map Operator");
//        FlatMapOperator flatMapOperator = new FlatMapOperator();
//        flatMapOperator.run();

//        log.info("Starting Scan Operator");
//        ScanOperator scanOperator = new ScanOperator();
//        scanOperator.run();

//        log.info("Starting Debounce Operator");
//        DebounceOperator debounceOperator = new DebounceOperator();
//        debounceOperator.run();

//        log.info("Starting Single Observable");
//        SingleObservable singleObservable = new SingleObservable();
//        singleObservable.run();

//        log.info("Starting Distinct Operator");
//        DistinctOperator distinctOperator = new DistinctOperator();
//        distinctOperator.run();

//        log.info("Starting Element At Operator");
//        ElementAtOperator elementAtOperator = new ElementAtOperator();
//        elementAtOperator.run();

//        log.info("Starting Ignore Element Operator");
//        IgnoreElementOperator ignoreElementOperator = new IgnoreElementOperator();
//        ignoreElementOperator.run();

//        log.info("Starting Skip Operator");
//        SkipOperator skipOperator = new SkipOperator();
//        skipOperator.run();

//        log.info("Starting Skip Operator");
//        SkipLastOperator skipLastOperator = new SkipLastOperator();
//        skipLastOperator.run();

//        log.info("Starting Take Operator");
//        TakeOperator takeOperator = new TakeOperator();
//        takeOperator.run();

//        log.info("Starting TakeLast Operator");
//        TakeLastOperator takeLastOperator = new TakeLastOperator();
//        takeLastOperator.run();

        log.info("Starting Filter Operator");
        FilterOperator filterOperator = new FilterOperator();
        filterOperator.run();

    }
}
