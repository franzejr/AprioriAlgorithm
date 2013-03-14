package br.ufc.datamining.importer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

import br.ufc.datamining.DAO.Local;
import br.ufc.datamining.DAO.Person;

public class Importer {
	ArrayList<Person> persons;
	HashSet<Local> locals = new HashSet<Local>();

	public void doImport(String path) throws Exception {	
		
		Person person = null;
		Local local = null;
		HashMap<String, Person> personsAux = new HashMap<String, Person>();
		
		BufferedReader CSVFile = new BufferedReader(new FileReader(path));
		String dataRow = CSVFile.readLine();
		while (dataRow != null) {
			String[] dataArray = dataRow.split(",");
			person = null;
			//System.out.println(dataArray[3]+" ");
			if (personsAux.containsKey(dataArray[1])) {
				person = personsAux.get(dataArray[1]);
			}
			else{
				person = new Person(dataArray[1]);
				personsAux.put(dataArray[1], person);
			}
			local = new Local(dataArray[0],dataArray[3]);
			person.addCheckIn(local);
			locals.add(local);
			dataRow = CSVFile.readLine();
		}
		persons = new ArrayList<Person>(personsAux.values());
	}
	public ArrayList<Person> getPersons(){
		return persons; 
	}
	public ArrayList<Local> getLocals() {
		return new ArrayList<Local>(locals);
	}
}
