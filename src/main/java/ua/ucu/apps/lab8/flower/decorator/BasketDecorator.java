package ua.ucu.apps.lab8.flower.decorator;

import ua.ucu.apps.lab8.flower.model.Item;

public class BasketDecorator extends ItemDecorator {
    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return 4 + item.getPrice();
    }

    @Override
    public String getDescription() {
        return item.getDescription() + " + basket decoration";
    }
}

