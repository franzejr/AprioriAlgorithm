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
	HashMap<String, Person> persons = new HashMap<String, Person>();
	HashSet<Local> locals = new HashSet<Local>();

	public ArrayList<Person> doImport(String path) throws Exception {
		BufferedReader CSVFile = new BufferedReader(new FileReader(path));
		String dataRow = CSVFile.readLine();
		while (dataRow != null) {
			String[] dataArray = dataRow.split(",");
			Person person = null;
			//System.out.println(dataArray[3]+" ");
			if (persons.containsKey(dataArray[1])) {
				person = persons.get(dataArray[1]);
			}
			else{
				person = new Person(dataArray[1]);
				persons.put(dataArray[1], person);
			}
			
			person.addCheckIn(dataArray[0],dataArray[3]);
			dataRow = CSVFile.readLine();
		}
		ArrayList<Person> list = new ArrayList<Person>(persons.values());
		return list;
	}
}
