package br.ufc.datamining.main;

import java.util.ArrayList;

import br.ufc.datamining.DAO.Local;
import br.ufc.datamining.DAO.Person;
import br.ufc.datamining.importer.Importer;

public class Main {
	
	public static void main(String[] args){
		Importer importer = new Importer();
		ArrayList<Person> persons = null;
		try {
			persons =  importer.doImport("data/fortaleza_basketmarket.csv");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("dsfsdff"+persons.size());
		for(Person person : persons){
			System.out.println("Person: "+person.getID());
			for(Local local : person.getCheckIns()){
				System.out.print(local.getID()+" ");
			}
		}
		
	}

}
