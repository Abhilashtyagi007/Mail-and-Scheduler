package com.email.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "Country")
public class Country {

    @Id
    @Column(name = "Code", length = 3)
    private String code;

    @Column(name = "Name", length = 52)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "Continent")
    private Continent continent;

    @Column(name = "Region", length = 26)
    private String region;

    @Column(name = "SurfaceArea", precision = 10, scale = 2)
    private BigDecimal surfaceArea;

    @Column(name = "IndepYear")
    private Short indepYear;

    @Column(name = "Population")
    private Integer population;

    @Column(name = "LifeExpectancy", precision = 3, scale = 1)
    private BigDecimal lifeExpectancy;

    @Column(name = "GNP", precision = 10, scale = 2)
    private BigDecimal gnp;

    @Column(name = "GNPOld", precision = 10, scale = 2)
    private BigDecimal gnpOld;

    @Column(name = "LocalName", length = 45)
    private String localName;

    @Column(name = "GovernmentForm", length = 45)
    private String governmentForm;

    @Column(name = "HeadOfState", length = 60)
    private String headOfState;

    @Column(name = "Capital")
    private Integer capital;

    @Column(name = "Code2", length = 2)
    private String code2;

    @Column(name = "status")
    private  Integer status;
}