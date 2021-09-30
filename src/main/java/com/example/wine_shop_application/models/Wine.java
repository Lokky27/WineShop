package com.example.wine_shop_application.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "wines")
public class Wine
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "wine_id")
    private Long wineId;

    @Column(name = "name")
    private String name;

    @Column(name = "producer")
    private String producer;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private Type type;

    @Column(name = "color")
    @Enumerated(EnumType.STRING)
    private Color color;

    @Column(name = "harvest_date")
    private LocalDate harvestDate;


}
