package org.eternity.theater.step02;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience) {
        // fixme TicketSeller 가 TicketOffice 의 내부 상태를 직접 접근하여 통제하는 부분
        ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
    }
}
