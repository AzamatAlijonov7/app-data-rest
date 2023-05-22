package uz.task.appdatarest.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne(optional = false)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;

    @ManyToOne(optional = false)
    @JoinColumn(name = "photo_id", referencedColumnName = "id")
    private Photo photo;

    private String code;

    @ManyToOne(optional = false)
    @JoinColumn(name = "measurement_id", referencedColumnName = "id")
    private Measurement measurement;

    private Boolean active;

}

