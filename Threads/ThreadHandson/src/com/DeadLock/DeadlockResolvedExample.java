package com.DeadLock;

public class DeadlockResolvedExample {
    public static void main(String[] args) {
        Shared obj = new Shared();

        new Thread(() -> obj.methodA()).start();
        new Thread(() -> obj.methodB()).start();
    }
}