package com.example.wine_shop_application.models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
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

    @Override
    public boolean equals(Object o)
    {
        if (o == this) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        Wine wine = (Wine) o;
        return wineId == wine.wineId
                && (name == wine.name || (name != null && name.equals(wine.getName())))
                && (producer == wine.producer || (producer != null && producer.equals(wine.getProducer())))
                && (type == wine.type || (type != null && type.equals(wine.getType())))
                && (color == wine.color || (color != null && color.equals(wine.getColor())))
                && (harvestDate == wine.harvestDate || (harvestDate != null && harvestDate.equals(wine.getHarvestDate())));
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + wineId.hashCode();
        result = prime * result + ((producer == null) ? 0 : producer.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((harvestDate == null) ? 0 : harvestDate.hashCode());
        return result;
    }
}
