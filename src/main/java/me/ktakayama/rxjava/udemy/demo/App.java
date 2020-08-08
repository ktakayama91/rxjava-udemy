package me.ktakayama.rxjava.udemy.demo;

import me.ktakayama.rxjava.udemy.demo.observable.ObservableUsingCreate;
import me.ktakayama.rxjava.udemy.demo.observable.ObservableUsingJust;

public class App 
{
    public static void main( String[] args )
    {
        ObservableUsingJust observableUsingJust = new ObservableUsingJust();
        observableUsingJust.getLetters();

        ObservableUsingCreate observableUsingCreate = new ObservableUsingCreate();
        observableUsingCreate.create();
    }
}
