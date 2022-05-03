package org.agoncal.application.petstore.domain;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.Data;

/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */

@Data
public class CartItem {

    // ======================================
    // = Attributes =
    // ======================================

    @NotNull
    private Item item;
    @NotNull
    @Min(1)
    private Integer quantity;

    // ======================================
    // = Public Methods =
    // ======================================

    public Float getSubTotal() {
        return item.getUnitCost() * quantity;
    }
}