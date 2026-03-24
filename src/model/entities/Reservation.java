package model.entities;

import model.exception.DomainExeception;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation{

    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        if(!checkOut.after(checkIn)){
            throw new IllegalArgumentException("Check-out date must be after check-in date.");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duration(){
        long diff = checkOut.getTime() - checkIn.getTime(); //pega a diferença entre duas datas em milesegundos.
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); //converte o diff de milesegundos em dias
    }

//    logica de validação foi colocada dentro da classe reservation no metodo updateDates

    public void updateDates(Date checkIn, Date checkOut){

        Date now = new Date();
        if(checkIn.before(now) || checkOut.before(now)){
            throw new DomainExeception("Reservation dates for update must be future dates.");
        }
        if(!checkOut.after(checkIn)){
            throw new IllegalArgumentException("Check-out date must be after check-in date.");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Room: "
                + roomNumber
                + ", check-In: "
                + sdf.format(checkIn)
                + ", check-out"
                + sdf.format(checkOut)
                + ", "
                + duration()
                + " nights";
    }
}
