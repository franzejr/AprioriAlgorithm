package br.ufc.datamining.DAO;

import arida.ufc.br.moap.association.api.Item;

public class Local extends Item {
	String ID;
	String name;

	public Local(String ID, String name) {
		super(ID);
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
