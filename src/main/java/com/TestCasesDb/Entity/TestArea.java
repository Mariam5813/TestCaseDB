package com.TestCasesDb.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="test_area")
public class TestArea {
	@Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id", nullable = false)
    private TestCase testCase;

    @Column(name = "description", nullable = false, length = Integer.MAX_VALUE)
    private String description;
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer areaId;
//	
//	private String testareaName;
//	
//	
		
//	public TestArea(int areaId, String testareaName) {
//		super();
//		this.areaId = areaId;
//		this.testareaName = testareaName;
//	}
//	
//	public TestArea() {
//		super();
//	
//	}

//	public int getAreaId() {
//		return areaId;
//	}
//	public void setAreaId(int areaId) {
//		this.areaId = areaId;
//	}
//	public String getTestareaName() {
//		return testareaName;
//	}
//	public void setTestareaName(String testareaName) {
//		this.testareaName = testareaName;
//	}
	
	

}
