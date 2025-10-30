package ua.ucu.apps.lab8.flower;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ua.ucu.apps.lab8.flower.decorator.BasketDecorator;
import ua.ucu.apps.lab8.flower.decorator.PaperDecorator;
import ua.ucu.apps.lab8.flower.decorator.RibbonDecorator;
import ua.ucu.apps.lab8.flower.model.CactusFlower;
import ua.ucu.apps.lab8.flower.model.FlowerBucket;
import ua.ucu.apps.lab8.flower.model.Item;
import ua.ucu.apps.lab8.flower.model.RomashkaFlower;



@SpringBootApplication
public class Lab8Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab8Application.class, args);

		Item item = new FlowerBucket();
        ((FlowerBucket) item).addFlowers(new RomashkaFlower());
        ((FlowerBucket) item).addFlowers(new CactusFlower());

        item = new PaperDecorator(item);
        item = new RibbonDecorator(item);
        item = new BasketDecorator(item);

        System.out.println(item.getDescription());
        System.out.println("Total price: " + item.getPrice());
	}

}
