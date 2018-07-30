package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class TestComparable {
	
	public static void main(String[] args) {
		List<Patient> patients = new ArrayList<>();
		
		patients.add(new Patient(new Date("01/03/2018"),"abc"));
		patients.add(new Patient(new Date("01/01/2018"),"xyz"));
		patients.add(new Patient(new Date("01/02/2018"),"xyx"));
		
		Collections.sort(patients, new Comparator<Patient>() {

			@Override
			public int compare(Patient o1, Patient o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		for (int i = 0; i < patients.size(); i++) {
			System.out.println(patients.get(i).getAppointmentTime()+":"+patients.get(i).getName());
			
		}
	}

}


class Patient implements Comparable<Patient>{
	Date appointmentTime;
	String name;
	public Patient(Date appointmentTime, String name) {
		super();
		this.appointmentTime = appointmentTime;
		this.name = name;
	}
	public Date getAppointmentTime() {
		return appointmentTime;
	}
	public void setAppointmentTime(Date appointmentTime) {
		this.appointmentTime = appointmentTime;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Patient o) {
		return (int) (this.getAppointmentTime().getTime()-o.getAppointmentTime().getTime());
	}
	
	
}
