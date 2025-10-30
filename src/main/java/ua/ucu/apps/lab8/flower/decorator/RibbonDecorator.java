package ua.ucu.apps.lab8.flower.decorator;

import ua.ucu.apps.lab8.flower.model.Item;

public class RibbonDecorator extends ItemDecorator {
    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return 40 + item.getPrice();
    }

    @Override
    public String getDescription() {
        return item.getDescription() + " + ribbon decoration";
    }
}

