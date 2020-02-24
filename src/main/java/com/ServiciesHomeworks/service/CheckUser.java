package com.ServiciesHomeworks.service;
import com.ServiciesHomeworks.model.User;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;

@Path("/check")
public class CheckUser {
    @POST
    @Produces(MediaType.APPLICATION_XML)
    public String createUser(User user)  {
       return user.checkUser(user);
    }
}
