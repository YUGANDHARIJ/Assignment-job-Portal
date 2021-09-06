package com.job.portal;

public class Candiadate 
{   
   
	String name;
	String gmail;
	String gender;
	float ugper;
	float XIIper;
	float Xper;
	int gapinedu;
	
	public Candiadate(String name, String gmail, String gender ,float ugper, float xIIper, float xper, int gapinedu) {
		super();
		this.name = name;
		this.gmail = gmail;
		this.gender=gender;
		this.ugper = ugper;
		this.XIIper = xIIper;
		this.Xper = xper;
		this.gapinedu = gapinedu;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public float getUgper() {
		return ugper;
	}
	public void setUgper(float ugper) {
		this.ugper = ugper;
	}
	public float getXIIper() {
		return XIIper;
	}
	public void setXIIper(float xIIper) {
		XIIper = xIIper;
	}
	public float getXper() {
		return Xper;
	}
	public void setXper(float xper) {
		Xper = xper;
	}
	public int getGapinedu() {
		return gapinedu;
	}
	public void setGapinedu(int gapinedu) {
		this.gapinedu = gapinedu;
	}
	
	public String getgender() {
		return gender;
	}
	public void setGapinedu(String gender) {
		this.gender= gender;
	}
	
	@Override
	public String toString() {
		return "Candiadate [name=" + name + ", gmail=" + gmail + ",gender=" + gender +", ugper=" + ugper + ", XIIper=" + XIIper + ", Xper="
				+ Xper + ", gapinedu=" + gapinedu + "]";
	}
	

}
