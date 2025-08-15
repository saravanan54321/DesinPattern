package org.example.Behaviouralpattern.ObserverPattern;

public interface Subject {

   // for attaching observer
    void attach (Observer obs);
    void dettach (Observer obs);
    // for notify observer
    void notifyObserver();
}
