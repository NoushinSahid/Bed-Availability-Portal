package com.capgemini.bedavailabilityportal.model;


import com.capgemini.bedavailabilityportal.Validation.ValidateBedAvaliability;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Entity
@Table(name ="AddBed")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddBed {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     @Column(name = "bedId")
     private Long bedId;
     @Column(name="hospitalName")
     @NotNull(message = "hospitalName")
     private String hName;
     @Column(name = "bedType")
     @NotNull(message = "bedType")
     private String bedType;
     @Column(name = "bedAvailability")
     @ValidateBedAvaliability(message = "It must be Avaliability or Booked")
     private String bedAvailability;
     @Column(name = "bedPrice")
     @NotNull(message = "bedPrice")
     @Size(min = 2, message = " Name should have atleast 2 characters")
     private String bedPrice;
}
