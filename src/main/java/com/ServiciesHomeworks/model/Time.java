package com.ServiciesHomeworks.model;

import javafx.scene.chart.PieChart;
import lombok.*;

import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalTime.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import static java.time.LocalDateTime.now;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@XmlRootElement(name = "time")

public class Time {
    LocalDateTime myDateObj = LocalDateTime.now();

    public String getTime() {
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        return formattedDate;
    }


}
