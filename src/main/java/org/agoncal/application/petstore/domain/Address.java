package org.agoncal.application.petstore.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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

@Embeddable
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Address {

    // ======================================
    // = Attributes =
    // ======================================

    @Column(nullable = false)
    @NotNull
    @Size(min = 5, max = 50)
    private String street1;
    private String street2;
    @Column(nullable = false, length = 100)
    @NotNull
    @Size(min = 2, max = 50)
    private String city;
    private String state;
    @Column(name = "zip_code", nullable = false, length = 10)
    @NotNull
    @Size(min = 1, max = 10)
    private String zipcode;
    @Column(nullable = false, length = 50)
    @NotNull
    @Size(min = 2, max = 50)
    private String country; // TODO use an enum
}
