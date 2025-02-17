package org.eternity.theater.step01;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    // fixme 티켓 판매자가 근무중인 매표소 정보를 불필요하게 외부 노출함
    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }
}
