package ua.ucu.apps.lab8.flower.decorator;

import ua.ucu.apps.lab8.flower.model.Item;

public class PaperDecorator extends ItemDecorator {
    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return 13 + item.getPrice();
    }

    @Override
    public String getDescription() {
        return item.getDescription() + " + paper decoration";
    }
}
