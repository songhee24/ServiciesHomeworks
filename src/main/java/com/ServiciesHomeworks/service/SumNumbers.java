package com.ServiciesHomeworks.service;
import com.ServiciesHomeworks.model.Numbers;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/sum")
public class SumNumbers {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public String getSum(Numbers numbers){
        Integer numbers1 = numbers.sum(numbers.getA(),numbers.getB());
        return numbers1.toString();
    }
}
