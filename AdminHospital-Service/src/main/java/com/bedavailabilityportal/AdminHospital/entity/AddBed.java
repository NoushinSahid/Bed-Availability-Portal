package com.bedavailabilityportal.AdminHospital.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
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
     @NotNull(message = "bedAvailability")
     private String bedAvailability;
     @Column(name = "bedPrice")
     @NotNull(message = "bedPrice")
     @Size(min = 2, message = " Name should have atleast 2 characters")
     private String bedPrice;
}
