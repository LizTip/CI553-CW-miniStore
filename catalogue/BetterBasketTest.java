package catalogue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BetterBasketTest {

    @Test
    void testMergeAddProduct() {
        BetterBasket br = new BetterBasket();
        Product p1 = new Product("0001", "toaster",12.3, 1);
        Product p2 = new Product("0002", "kettle",12.7, 1);
        Product p3 = new Product("0002", "kettle",12.7, 1);
        Product p4 = new Product("0002", "kettle",12.7, 1);
        br.add(p1);
        br.add(p2);
        br.add(p3);
        br.add(p4);
        assertEquals(2,br.size(),"incorrect size after merge");
        assertEquals(3,br.get(1).getQuantity(),"incorrect quantity after merge");
    }

    @Test
    void testSortAddProduct() {
        BetterBasket br = new BetterBasket();
        Product p1 = new Product("0004", "toaster",12.3, 1);
        Product p2 = new Product("0002", "kettle1",12.7, 1);
        Product p3 = new Product("0001", "kettle2",12.7, 1);
        Product p4 = new Product("0003", "kettle3",12.7, 1);
        br.add(p1);
        br.add(p2);
        br.add(p3);
        br.add(p4);

        assertEquals("0001",br.get(0).getProductNum(),"incorrect quantity after merge");
    }
}