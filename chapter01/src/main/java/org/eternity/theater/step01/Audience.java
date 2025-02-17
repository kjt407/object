package org.eternity.theater.step01;

public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    // fixme 관중의 가방 정보를 외부에서 접근 가능한 문제점
    public Bag getBag() {
        return bag;
    }
}
