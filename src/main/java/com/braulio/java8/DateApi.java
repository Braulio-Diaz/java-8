package com.braulio.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateApi {

    public void verificarFecha(int version){
        if (version == 8) {
            LocalDate date = LocalDate.of(1994, 12, 29);
            LocalDate currentDate = LocalDate.now();
            System.out.println(date.isAfter(currentDate));
            System.out.println(date.isBefore(currentDate));
            System.out.println(date.isEqual(currentDate));
            System.out.println("Fecha de nacimiento: "+ date + " Fecha Actual: "+ currentDate);

            LocalTime time = LocalTime.of(18, 52, 30);
            LocalTime currentTime = LocalTime.now();
            DateTimeFormatter formater = DateTimeFormatter.ofPattern("HH:mm:ss");
            System.out.println(time.isAfter(currentTime));
            System.out.println(time.isBefore(currentTime));
            System.out.println("Hora pasada: "+ time + "/ Hora actual: "+ formater.format(currentTime));
        }
    }

    public LocalDateTime fechaYHora(){
        LocalDateTime fechaYHora = LocalDateTime.of(1994, 12, 29, 19, 30, 58);
        return fechaYHora;
    }

    public String fechaYHoraActual(){
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return formatter.format(currentDateTime);
    }

    public void periodoEntreFechas(){
        LocalDate birthdate = LocalDate.of(1994, 12, 29);
        LocalDate currentDate = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String birthdateFormatted = formatter.format(birthdate);
        String currentDateFormatted = formatter.format(currentDate);

        Period periodo = Period.between(birthdate, currentDate);

        System.out.println("Han pasado "+ periodo.getYears() + " años y " + periodo.getMonths()
        + " meses y "+ periodo.getDays()+  " dias desde: "+  birthdateFormatted + " hasta " + currentDateFormatted);
    }

    public static void main(String[] args){
        
        DateApi app = new DateApi();
        app.verificarFecha(8);
        System.out.println(app.fechaYHora());
        System.out.println(app.fechaYHoraActual());
        app.periodoEntreFechas();
    }

}
