package com.ServiciesHomeworks.service;

import com.ServiciesHomeworks.model.Time;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/home")
public class HomeworkService {
    Time time = new Time();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getTime(){
        return time.getTime();
    }


}
