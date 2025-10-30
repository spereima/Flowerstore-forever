package ua.ucu.apps.lab8.flower.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ua.ucu.apps.lab8.flower.model.Flower;
import ua.ucu.apps.lab8.flower.service.FlowerService;




@RestController
public class FlowerController {
    private final FlowerService flowerService;

    @Autowired
    private FlowerController(FlowerService flowerService){
        this.flowerService = flowerService;
    }

    @GetMapping("/flowers")
    public List<Flower> getFlowers(){
        return flowerService.getFlowers();
    }

    @PostMapping("/flowers")
    public Flower createFlower(@RequestBody Flower flower){
        return flowerService.createFlower(flower);
    }
}
