package com.ServiciesHomeworks.model;

import lombok.*;

import javax.xml.bind.annotation.XmlRootElement;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@XmlRootElement(name = "numbers")

public class Numbers {
    int a;
    int b;

    public Integer sum(int a, int b){
        return a + b;
    }
}
