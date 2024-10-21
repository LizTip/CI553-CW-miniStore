package catalogue;

import java.util.Collections;

/**
 * Improved version of Basket with merging and sorting functionality
 * 
 * @author  Liz Tipper
 * @version 1.2
 */
public class BetterBasket extends Basket {
  @Override
  public boolean add(Product pr) {
    for (Product prInList : this) {
      if (prInList.getProductNum().equals(pr.getProductNum())) {
        int quantity = pr.getQuantity() + prInList.getQuantity();
        prInList.setQuantity(quantity);
        return (true); // Product quantity updated
      }
    }
    super.add(pr); // Only add if no existing product was found
    Collections.sort(this);
    return (true);
  }
}