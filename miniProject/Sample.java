package miniProject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Sample {
	private float TAMIL;
	private float ENGLISH;
	private float MATHS;
	private float SCIENCE;
	private float SOCIAL;
	
	

	public Sample(float TAMIL, float ENGLISH, float MATHS, float SCIENCE, float SOCIAL) {
		super();
		this.TAMIL = TAMIL;
		this.ENGLISH = ENGLISH;
		this.MATHS = MATHS;
		this.SCIENCE = SCIENCE;
		this.SOCIAL = SOCIAL;
	}
	
	public float getTAMIL() {
		return TAMIL;
	}

	public void setTAMIL(float tAMIL) {
		TAMIL = tAMIL;
	}

	public float getENGLISH() {
		return ENGLISH;
	}

	public void setENGLISH(float eNGLISH) {
		ENGLISH = eNGLISH;
	}

	public float getMATHS() {
		return MATHS;
	}

	public void setMATHS(float mATHS) {
		MATHS = mATHS;
	}

	public float getSCIENCE() {
		return SCIENCE;
	}

	public void setSCIENCE(float sCIENCE) {
		SCIENCE = sCIENCE;
	}

	public float getSOCIAL() {
		return SOCIAL;
	}

	public void setSOCIAL(float sOCIAL) {
		SOCIAL = sOCIAL;
	}

	@Override
	public String toString() {
		return "Sample [TAMIL=" + TAMIL + ", ENGLISH=" + ENGLISH + ", MATHS=" + MATHS + ", SCIENCE=" + SCIENCE
				+ ", SOCIAL=" + SOCIAL + "]";
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample s1=new Sample(51,84,63,52,66);
		Sample s2=new Sample(52,85,64,54,63);
		Sample s3=new Sample(53,86,65,56,60);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
			}
	
	 

}
