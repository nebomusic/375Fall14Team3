package com.example.informationhubapp;

import java.util.ArrayList;
import java.util.List;

public class FamilyList {
	
	private List <FamilyMember> familyList;
	
	public FamilyList() {
		familyList = new ArrayList <FamilyMember> (0);
	}
	
	public List<FamilyMember> getFamilyMembers() {
		return familyList;
	}
	
	public void addFamilyMember(FamilyMember f) {
		familyList.add(f);
	}
	
}
