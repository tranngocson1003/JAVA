package vti.com.example.finalExam.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Car")
@Getter
@Setter
@IdClass(CarId.class)
// :))
public class Car {
    @Id
    @Column(nullable = false, name = "license_plate")
    private String LicensePlate;
    @Id
    @Column(nullable = false, name = "repair_date")
    private LocalDate RepairDate;

    @Column(nullable = false)
    private String CustomerName;

    @Column(nullable = false)
    private String Catalogs;

    @Column(nullable = false)
    private String f;


}
