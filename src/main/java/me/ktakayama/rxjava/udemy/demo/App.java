package me.ktakayama.rxjava.udemy.demo;

import me.ktakayama.rxjava.udemy.demo.observables.ObservableUsingJust;

public class App 
{
    public static void main( String[] args )
    {
        ObservableUsingJust observableUsingJust = new ObservableUsingJust();
        observableUsingJust.getLetters();
    }
}
