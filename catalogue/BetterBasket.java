package catalogue;

import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Improved version of Basket with merging and sorting functionality
 * 
 * @author  Liz Tipper
 * @version 1.0
 */
public class BetterBasket extends Basket implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Merges items with the same product number in the basket
   */
  public void mergeItems() {
    Map<String, Product> mergedProducts = new HashMap<>();
    for (Product product : this) {
      if (mergedProducts.containsKey(product.getProductNum())) {
        Product existingProduct = mergedProducts.get(product.getProductNum());
        existingProduct.setQuantity(existingProduct.getQuantity() + product.getQuantity());
      } else {
        mergedProducts.put(product.getProductNum(), product);
      }
    }
    this.clear();
    this.addAll(mergedProducts.values());
  }

  /**
   * Sorts the basket items by product number
   */
  public void sortItemsByProductNumber() {
    Collections.sort(this, Comparator.comparing(Product::getProductNum));
  }
}
