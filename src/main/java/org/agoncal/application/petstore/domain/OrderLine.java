package org.agoncal.application.petstore.domain;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
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
