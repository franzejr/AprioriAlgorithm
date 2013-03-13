package br.ufc.datamining.DAO;

import java.util.Collection;
import java.util.HashSet;

public class Person {

	private HashSet<Local> checkIns;
	private String ID;

	public Person(String ID) {
		this.checkIns = new HashSet<Local>();
		this.ID = ID;
	}

	public Person(String ID, Collection checkIns) {
		this.checkIns = new HashSet<Local>(checkIns);
		this.ID = ID;
	}

	public void addCheckIn(Local local) {
		checkIns.add(local);
	}

	public void addCheckIn(String ID, String name) {
		checkIns.add(new Local(ID, name));
	}

	public HashSet<Local> getCheckIns() {
		return checkIns;
	}

	public String getID() {
		return ID;
	}

	@Override
	public int hashCode() {
		if (ID != null) {
			return ID.hashCode();
		}
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Person local1 = (Person) obj;
		if (this.ID.equals(local1.ID))
			return true;
		return false;
	}
	
}