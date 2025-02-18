package org.eternity.theater.step02;

public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    public Bag(long amount) {
        this(null, amount);
    }

    public Bag(Invitation invitation, long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    public boolean hasInvitation() {
        return invitation != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    // fixme Bag 객체는 수동적이다 Bag 객체를 관리하는 주체는 스스로가 아닌 API 이용자이다.
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    // fixme Bag 현금을 계산하는 로직은 가방이 스스로 하도록 유도해야한다
    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    // fixme Bag 현금을 계산하는 로직은 가방이 스스로 하도록 유도해야한다
    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
