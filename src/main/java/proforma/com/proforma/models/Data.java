package proforma.com.proforma.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

@Entity
@Table(name = "data")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] fileContent;

    private String fileName;

    private LocalDate date;
    private LocalTime time;

    @ManyToOne
    private Category category;
}
