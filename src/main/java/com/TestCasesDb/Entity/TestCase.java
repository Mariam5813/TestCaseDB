package com.TestCasesDb.Entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "test_case")
public class TestCase {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id", nullable = false)
    private TestArea testArea;

    @Column(name = "name", nullable = false, length = Integer.MAX_VALUE)
    private String name;

    @Column(name = "result", nullable = false, length = Integer.MAX_VALUE)
    private String result;

    @Column(name = "testname", nullable = false, length = Integer.MAX_VALUE)
    private String testname;

    @Column(name = "timeofexecution", nullable = false)
    private Instant timeofexecution;

    @Column(name = "area_id", nullable = false)
    private Integer areaId;

    @Column(name = "assumptions", length = Integer.MAX_VALUE)
    private String assumptions;

//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name="test_cases")
//public class TestCase {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer tcId;
//	private Integer areaId;
//	private String tcName;
//	private String tcAssumptions;
//	private String tcResult;
//	private String testerName;
//	private LocalDateTime timeStamp;
//	
//	
//	public TestCase(int tcId, int areaId, String tcName, String tcAssumptions, String tcResult, String testerName,
//			LocalDateTime timeStamp) {
//		super();
//		this.tcId = tcId;
//		this.areaId = areaId;
//		this.tcName = tcName;
//		this.tcAssumptions = tcAssumptions;
//		this.tcResult = tcResult;
//		this.testerName = testerName;
//		this.timeStamp = timeStamp;
//	}
//
//
//	
//	
//	public TestCase() {
//		super();
//		
//	}
//
//
//
//
//	public int getTcId() {
//		return tcId;
//	}
//
//
//	public void setTcId(int tcId) {
//		this.tcId = tcId;
//	}
//
//
//	public int getAreaId() {
//		return areaId;
//	}
//
//
//	public void setAreaId(int areaId) {
//		this.areaId = areaId;
//	}
//
//
//	public String getTcName() {
//		return tcName;
//	}
//
//
//	public void setTcName(String tcName) {
//		this.tcName = tcName;
//	}
//
//
//	public String getTcAssumptions() {
//		return tcAssumptions;
//	}
//
//
//	public void setTcAssumptions(String tcAssumptions) {
//		this.tcAssumptions = tcAssumptions;
//	}
//
//
//	public String getTcResult() {
//		return tcResult;
//	}
//
//
//	public void setTcResult(String tcResult) {
//		this.tcResult = tcResult;
//	}
//
//
//	public String getTesterName() {
//		return testerName;
//	}
//
//
//	public void setTesterName(String testerName) {
//		this.testerName = testerName;
//	}
//
//
//	public LocalDateTime getTimeStamp() {
//		return timeStamp;
//	}
//
//
//	public void setTimeStamp(LocalDateTime timeStamp) {
//		this.timeStamp = timeStamp;
//	}
//	
//	
//	
	
	
}
