package main.railway_booking;

import java.util.List;

public class TicketChart {
    private static int id = 1;
    int coatchId;
    List<TicketBooking> ticketBookingList;

    TicketChart() {
        this.coatchId = id++;
    }

    public List<TicketBooking> getTicketBookingList() {
        return ticketBookingList;
    }

    public void setTicketBookingList(List<TicketBooking> ticketBookingList) {
        this.ticketBookingList = ticketBookingList;
    }
}
