package vti.com.example.finalExam.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccessoryDTO {
    private Integer Id;
    private String Name;
    private BigDecimal Price;
    private String RepairStatus;
    private String RepairDamaged;
}
