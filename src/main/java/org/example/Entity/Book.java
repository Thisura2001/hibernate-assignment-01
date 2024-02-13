package org.example.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.Year;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Book {
    @Id
    private String id;
    private String title;
    private String published_year;
    private Double price;
    @ManyToOne
    @JoinColumn(name ="author_id")
    private Author author;
}
