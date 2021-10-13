package de.empulse;

import de.empulse.services.FruitService;

import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.List;

@Path("/fruits")
public class FruitResource {

    @Inject
    FruitService fruitService;

    @GET
    public List<Fruit> list() {
        return fruitService.list();
    }

    @POST
    public List<Fruit> add(Fruit fruit) {
        fruitService.add(fruit);
        return list();
    }

    @POST
    @Path("/remove")
    public List<Fruit> remove(Fruit fruit){
        fruitService.remove(fruit);
        System.out.println("Remove Click");
        return list();
    }
}
