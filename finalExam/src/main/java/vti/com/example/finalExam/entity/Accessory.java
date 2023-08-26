package vti.com.example.finalExam.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Accessory")
@Getter
@Setter
@Embeddable
// :((
public class Accessory {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private int id;

    @ManyToOne
    private Car car;

    @Column(nullable = false)
    private String LicensePlate;

    @Column(nullable = false)
    private LocalDate RepairDate;

    @Column(nullable = false)
    private String Name;

    @Column(nullable = false)
    private Double Price;

    @Column(nullable = false)
    private String StatusDamaged;

    @Column(nullable = false)
    private String RepairStatus;

}
