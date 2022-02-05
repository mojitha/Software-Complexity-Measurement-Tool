package com.user;

import java.util.ArrayList;
import java.util.List;

public class User {
	private static User userInstanceSingleton;
	private String filePath,fileName,fileDir;
	private String sizeKW = "1",sizeID = "1",sizeOP = "1",sizeNV = "1",sizeSL = "1",variableGV = "1",
			variableLV = "1",variablePTV = "1",variableCTV = "1",methodPRT = "1",methodCRT = "1",
			methodVRT = "1",methodPDTP = "1",methodCDTP = "1",inheritanceNI = "1",inheritanceFLI = "1",
			inheritanceSLI = "1",inheritanceTLI = "1",inheritanceOLI = "1",controlStructuresIF = "1",
			controlStructuresLOOP = "1",controlStructuresSWI = "1",controlStructuresCASE = "1";
	private static List<Integer> CCSList = new ArrayList<>();
	private static List<Integer> CIList = new ArrayList<>();
	private static List<Integer> CSList = new ArrayList<>();
	private static List<Integer> CVList = new ArrayList<>();
	
	private User() {}
	
	public static User getInstance() {
		if(userInstanceSingleton == null) {
			synchronized (User.class) {
				userInstanceSingleton = new User();
			}
		}
		return userInstanceSingleton;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileDir() {
		return fileDir;
	}

	public void setFileDir(String fileDir) {
		this.fileDir = fileDir;
	}

	public String getSizeKW() {
		return sizeKW;
	}

	public void setSizeKW(String sizeKW) {
		this.sizeKW = sizeKW;
	}

	public String getSizeID() {
		return sizeID;
	}

	public void setSizeID(String sizeID) {
		this.sizeID = sizeID;
	}

	public String getSizeOP() {
		return sizeOP;
	}

	public void setSizeOP(String sizeOP) {
		this.sizeOP = sizeOP;
	}

	public String getSizeNV() {
		return sizeNV;
	}

	public void setSizeNV(String sizeNV) {
		this.sizeNV = sizeNV;
	}

	public String getSizeSL() {
		return sizeSL;
	}

	public void setSizeSL(String sizeSL) {
		this.sizeSL = sizeSL;
	}

	public String getVariableGV() {
		return variableGV;
	}

	public void setVariableGV(String variableGV) {
		this.variableGV = variableGV;
	}

	public String getVariableLV() {
		return variableLV;
	}

	public void setVariableLV(String variableLV) {
		this.variableLV = variableLV;
	}

	public String getVariablePTV() {
		return variablePTV;
	}

	public void setVariablePTV(String variablePTV) {
		this.variablePTV = variablePTV;
	}

	public String getVariableCTV() {
		return variableCTV;
	}

	public void setVariableCTV(String variableCTV) {
		this.variableCTV = variableCTV;
	}

	public String getMethodPRT() {
		return methodPRT;
	}

	public void setMethodPRT(String methodPRT) {
		this.methodPRT = methodPRT;
	}

	public String getMethodCRT() {
		return methodCRT;
	}

	public void setMethodCRT(String methodCRT) {
		this.methodCRT = methodCRT;
	}

	public String getMethodVRT() {
		return methodVRT;
	}

	public void setMethodVRT(String methodVRT) {
		this.methodVRT = methodVRT;
	}

	public String getMethodPDTP() {
		return methodPDTP;
	}

	public void setMethodPDTP(String methodPDTP) {
		this.methodPDTP = methodPDTP;
	}

	public String getMethodCDTP() {
		return methodCDTP;
	}

	public void setMethodCDTP(String methodCDTP) {
		this.methodCDTP = methodCDTP;
	}

	public String getInheritanceNI() {
		return inheritanceNI;
	}

	public void setInheritanceNI(String inheritanceNI) {
		this.inheritanceNI = inheritanceNI;
	}

	public String getInheritanceFLI() {
		return inheritanceFLI;
	}

	public void setInheritanceFLI(String inheritanceFLI) {
		this.inheritanceFLI = inheritanceFLI;
	}

	public String getInheritanceSLI() {
		return inheritanceSLI;
	}

	public void setInheritanceSLI(String inheritanceSLI) {
		this.inheritanceSLI = inheritanceSLI;
	}

	public String getInheritanceTLI() {
		return inheritanceTLI;
	}

	public void setInheritanceTLI(String inheritanceTLI) {
		this.inheritanceTLI = inheritanceTLI;
	}

	public String getInheritanceOLI() {
		return inheritanceOLI;
	}

	public void setInheritanceOLI(String inheritanceOLI) {
		this.inheritanceOLI = inheritanceOLI;
	}

	public String getControlStructuresIF() {
		return controlStructuresIF;
	}

	public void setControlStructuresIF(String controlStructuresIF) {
		this.controlStructuresIF = controlStructuresIF;
	}

	public String getControlStructuresLOOP() {
		return controlStructuresLOOP;
	}

	public void setControlStructuresLOOP(String controlStructuresLOOP) {
		this.controlStructuresLOOP = controlStructuresLOOP;
	}

	public String getControlStructuresSWI() {
		return controlStructuresSWI;
	}

	public void setControlStructuresSWI(String controlStructuresSWI) {
		this.controlStructuresSWI = controlStructuresSWI;
	}

	public String getControlStructuresCASE() {
		return controlStructuresCASE;
	}

	public void setControlStructuresCASE(String controlStructuresCASE) {
		this.controlStructuresCASE = controlStructuresCASE;
	}

	public static List<Integer> getCCSList() {
		return CCSList;
	}

	public static void setCCSList(List<Integer> cCSList) {
		CCSList = cCSList;
	}

	public static List<Integer> getCIList() {
		return CIList;
	}

	public static void setCIList(List<Integer> cIList) {
		CIList = cIList;
	}

	public static List<Integer> getCSList() {
		return CSList;
	}

	public static void setCSList(List<Integer> cSList) {
		CSList = cSList;
	}

	public static List<Integer> getCVList() {
		return CVList;
	}

	public static void setCVList(List<Integer> cVList) {
		CVList = cVList;
	}

	@Override
	public String toString() {
		return "User [filePath=" + filePath + ", fileName=" + fileName + ", fileDir=" + fileDir + ", sizeKW=" + sizeKW
				+ ", sizeID=" + sizeID + ", sizeOP=" + sizeOP + ", sizeNV=" + sizeNV + ", sizeSL=" + sizeSL
				+ ", variableGV=" + variableGV + ", variableLV=" + variableLV + ", variablePTV=" + variablePTV
				+ ", variableCTV=" + variableCTV + ", methodPRT=" + methodPRT + ", methodCRT=" + methodCRT
				+ ", methodVRT=" + methodVRT + ", methodPDTP=" + methodPDTP + ", methodCDTP=" + methodCDTP
				+ ", inheritanceNI=" + inheritanceNI + ", inheritanceFLI=" + inheritanceFLI + ", inheritanceSLI="
				+ inheritanceSLI + ", inheritanceTLI=" + inheritanceTLI + ", inheritanceOLI=" + inheritanceOLI
				+ ", controlStructuresIF=" + controlStructuresIF + ", controlStructuresLOOP=" + controlStructuresLOOP
				+ ", controlStructuresSWI=" + controlStructuresSWI + ", controlStructuresCASE=" + controlStructuresCASE
				+ "]";
	}
	
}
