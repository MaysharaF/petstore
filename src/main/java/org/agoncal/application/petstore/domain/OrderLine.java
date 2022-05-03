package org.agoncal.application.petstore.domain;

import javax.persistence.*;

import lombok.Data;

/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */

@Entity
@Data
public class OrderLine {

    // ======================================
    // = Attributes =
    // ======================================

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private Integer quantity;
    @OneToOne
    @JoinColumn(name = "item_fk", nullable = false)
    private Item item;

    // ======================================
    // = Public Methods =
    // ======================================

    public Float getSubTotal() {
        return getUnitCost() * quantity;
    }

}
