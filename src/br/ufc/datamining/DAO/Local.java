package br.ufc.datamining.DAO;

public class Local {
	String ID;
	String name;

	public Local(String ID, String name) {
		this.ID = ID;
		this.name = name;
	}

	public String getID() {
		return ID;
	}
	
	public String getName() {
		return name;
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
		Local local1 = (Local) obj;
		if (this.ID.equals(local1.ID))
			return true;
		return false;
	}

}
