package main.railway_booking;

import java.util.ArrayList;
import java.util.List;

public class RailwayMain {
    static List<TicketBooking> ticketBookingList = new ArrayList<>();

    public static void main(String[] args) {
        initialTicketChart();
        showTicketChart();
        ticketBooking();
    }

    public static void initialTicketChart() {
        TicketChart ticketChart = new TicketChart();
        ticketBookingList.add(new TicketBooking(BerthType.LB,TicketStatus.AVL));
        ticketBookingList.add(new TicketBooking(BerthType.MB,TicketStatus.AVL));
        ticketBookingList.add(new TicketBooking(BerthType.UB,TicketStatus.AVL));
        ticketBookingList.add(new TicketBooking(BerthType.UB,TicketStatus.AVL));
        ticketBookingList.add(new TicketBooking(BerthType.MB,TicketStatus.AVL));
        ticketBookingList.add(new TicketBooking(BerthType.LB,TicketStatus.AVL));
        ticketBookingList.add(new TicketBooking(BerthType.SL,TicketStatus.RAC));
        ticketBookingList.add(new TicketBooking(BerthType.SL,TicketStatus.RAC));
        ticketBookingList.add(new TicketBooking(BerthType.SU,TicketStatus.AVL));

        ticketBookingList.add(new TicketBooking(BerthType.LB,TicketStatus.AVL));
        ticketBookingList.add(new TicketBooking(BerthType.MB,TicketStatus.AVL));
        ticketBookingList.add(new TicketBooking(BerthType.UB,TicketStatus.AVL));
        ticketBookingList.add(new TicketBooking(BerthType.UB,TicketStatus.AVL));
        ticketBookingList.add(new TicketBooking(BerthType.MB,TicketStatus.AVL));
        ticketBookingList.add(new TicketBooking(BerthType.LB,TicketStatus.AVL));
        ticketBookingList.add(new TicketBooking(BerthType.SL,TicketStatus.RAC));
        ticketBookingList.add(new TicketBooking(BerthType.SL,TicketStatus.RAC));
        ticketBookingList.add(new TicketBooking(BerthType.SU,TicketStatus.AVL));
    }

    public static void showTicketChart(){
        for(TicketBooking ticketBooking : ticketBookingList)
        System.out.println(ticketBooking.toString());
    }
    public static void ticketBooking(){

    }
}
