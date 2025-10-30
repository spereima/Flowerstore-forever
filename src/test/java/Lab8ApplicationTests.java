import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import ua.ucu.apps.lab8.flower.decorator.BasketDecorator;
import ua.ucu.apps.lab8.flower.decorator.PaperDecorator;
import ua.ucu.apps.lab8.flower.decorator.RibbonDecorator;
import ua.ucu.apps.lab8.flower.model.Item;

class Lab8ApplicationTests {

    static class TestItem extends Item {
        @Override
        public double getPrice() {
            return 100;
        }

        @Override
        public String getDescription() {
            return "Basic item";
        }
    }

    @Test
    void testBasketDecorator() {
        Item baseItem = new TestItem();
        Item basket = new BasketDecorator(baseItem);

        assertEquals(104, basket.getPrice(), 0.001);
        assertEquals("Basic item + basket decoration", basket.getDescription());
    }

    @Test
    void testPaperDecorator() {
        Item baseItem = new TestItem();
        Item paper = new PaperDecorator(baseItem);

        assertEquals(113, paper.getPrice(), 0.001);
        assertEquals("Basic item + paper decoration", paper.getDescription());
    }

    @Test
    void testRibbonDecorator() {
        Item baseItem = new TestItem();
        Item ribbon = new RibbonDecorator(baseItem);

        assertEquals(140, ribbon.getPrice(), 0.001);
        assertEquals("Basic item + ribbon decoration", ribbon.getDescription());
    }

    @Test
    void testMultipleDecoratorsTogether() {
        Item baseItem = new TestItem();
        Item decorated = new RibbonDecorator(new PaperDecorator(new BasketDecorator(baseItem)));

        assertEquals(157, decorated.getPrice(), 0.001);
        assertEquals("Basic item + basket decoration + paper decoration + ribbon decoration",
                     decorated.getDescription());
    }
}