package com.bealon;

import java.time.*;
import java.time.format.*;
import java.util.*;


public class dateTime {

    
public static void main(String[] args) {
    // El usuario ingresa la fecha
    System.out.print("Ingrese la fecha (YYYY-MM-DD): ");
    String dateInput = getInput();
    System.out.println("Date input: " + dateInput); // para control

    // el usuario ingresa la hora
    System.out.print("Enter the time (HH:mm): ");
    String timeInput = getInput();
    System.out.println("Ingrese la hora: " + timeInput); // para control

    // Combine la fecha y la hora
    String dateTimeInput = dateInput + "T" + timeInput + ":00"+"Z"+"[America/Argentina/Buenos_Aires]";
    System.out.println("Combined dateTimeInput: " + dateTimeInput); // para control
    
   // ZonedDateTime dateTime = ZonedDateTime.of(2023, 1, 1, 12, 0, 0, 0, ZoneId.of("America/Argentina/Buenos_Aires"));

  //  System.out.println(ZonedDateTime.parse(dateTimeInput));
    ZonedDateTime tiempofinal = ZonedDateTime.parse(dateTimeInput);
    //System.out.println(tiempofinal);
    try {
        
        // muestra la fecha y la hota de todos los lugares
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
       
        int contador=0;
        for (String zoneId : zoneIds) {
            ZoneId zone = ZoneId.of(zoneId);
           // ZoneId tiempofinalZonedDateTime; // 
            ZonedDateTime convertedDateTime = tiempofinal.withZoneSameInstant(zone);
            String formattedDateTime = convertedDateTime.format(formatter);
            System.out.println(zoneId + ": " + formattedDateTime);
            contador++;
            }
            System.out.println(contador);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date or time format. Please try again.");
        }
}



    private static String getInput() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            return scanner.nextLine();
        } else {
            return ""; // devuelve vacio si no esta 
        }
    }
}


   