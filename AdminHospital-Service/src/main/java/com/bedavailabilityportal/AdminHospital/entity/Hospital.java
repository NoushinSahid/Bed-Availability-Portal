package com.bedavailabilityportal.AdminHospital.entity;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "hospital")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hospital {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="hospitalId")
	private Long hId;
	@Column(name="hospitalName")
	@NotNull(message = "hospitalName")
	private String hName;
	@Column(name="hospitalNumber")
	@NotNull(message = "hospitalNumber")
	@Size(min = 2, message = " Name should have atleast 2 characters")
	private String hNumber;
	@Column(name="hospitalAddress")
	@NotNull(message = "hospitalAddress")
	private String hAddress;
	@Column(name="hospitalState")
	@NotNull(message = "hospitalState")
	private String hState;
	@Column(name="hospitalCity")
	@NotNull(message = "hospitalCity")
	private String hCity;
	@Column(name="hospitalType")
	@NotNull(message = "hospitalType")
	private String hType;
//    @OneToMany(targetEntity = AddBed.class,cascade=CascadeType.ALL)
//	@JoinColumn(name="HB_fk",referencedColumnName ="hId" )
//	private List<AddBed> Beds;


}
