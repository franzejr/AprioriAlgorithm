package br.ufc.datamining.main;

import java.util.ArrayList;
import java.util.Iterator;

import arida.ufc.br.moap.association.api.IAssociationRule;
import arida.ufc.br.moap.core.imp.Parameters;
import arida.ufc.br.moap.core.spi.Type;
import arida.ufc.br.moap.datamodelapi.imp.ListModelImpl;
import arida.ufc.br.moap.datamodelapi.instances.imp.InstancesBasedModelImpl;
import br.ufc.datamining.DAO.Local;
import br.ufc.datamining.DAO.Person;
import br.ufc.datamining.algorithm.Apriori;
import br.ufc.datamining.importer.Importer;

public class Main {

	public static void main(String[] args) {
		Importer importer = new Importer();
		ArrayList<Person> persons = null;
		InstancesBasedModelImpl data = new InstancesBasedModelImpl();
		
		try {
			persons = importer.doImport("data/fortaleza_basketmarket.csv");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("dsfsdff" + persons.size());
		for (Person person : persons) {
			System.out.println("Person: " + person.getID());
			for (Local local : person.getCheckIns()) {
				System.out.print(local.getID() + " ");
				//TODO
				data.addAttribute(person.getID(),Type.STRING,local);
			}
		}
		

		Parameters parameters = new Parameters();
		parameters.addParam("confidence", 2);
		parameters.addParam("support", 2);
		
		Apriori apriori = new Apriori();
		
		ListModelImpl<IAssociationRule> associations = apriori.execute(data, parameters);
		System.out.println("RESULTS:");
		for( IAssociationRule associationRule : associations.getInstances() ){
			System.out.println("------------------");
			System.out.println("ID:"+associationRule.getId());
			System.out.println("Support:"+associationRule.getSupport());
			System.out.println("Lift:"+associationRule.getLift());
		}
		System.out.println("------------------");
		

	}

}
