package main.railway_booking;

public class TicketBooking {
    private static int increaseSeatNo = 1;
    String PNR;
    int seatNo;
    BerthType berthType;
    TicketStatus ticketStatus;
    String name;
    String age;

    public TicketBooking(BerthType berthType, TicketStatus ticketStatus) {
        this.berthType = berthType;
        this.ticketStatus = ticketStatus;
        this.generateSeatNo(ticketStatus,berthType);
    }

    public void generateSeatNo(TicketStatus ticketStatus,BerthType berthType) {
        if(ticketStatus != TicketStatus.CNF){
            if (ticketStatus == TicketStatus.RAC) {
                this.seatNo = increaseSeatNo;
                return;
            }
            if(BerthType.SU == berthType){
                increaseSeatNo++;
            }
            this.seatNo = increaseSeatNo++;
        }

    }

    @Override
    public String toString() {
        return "TicketBooking{" +
                "PNR='" + PNR + '\'' +
                ", seatNo=" + seatNo +
                ", berthType=" + berthType +
                ", ticketStatus=" + ticketStatus +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public String getPNR() {
        return PNR;
    }

    public void setPNR(String PNR) {
        this.PNR = PNR;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public BerthType getBerthType() {
        return berthType;
    }

    public void setBerthType(BerthType berthType) {
        this.berthType = berthType;
    }

    public TicketStatus getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(TicketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
