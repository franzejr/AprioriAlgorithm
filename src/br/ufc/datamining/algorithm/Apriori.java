package br.ufc.datamining.algorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

import arida.ufc.br.moap.association.api.AssociationRulesAlgorithm;
import arida.ufc.br.moap.association.api.IAssociationRule;
import arida.ufc.br.moap.association.api.Item;
import arida.ufc.br.moap.association.api.TransactionFormat;
import arida.ufc.br.moap.core.imp.Parameters;
import arida.ufc.br.moap.datamodelapi.imp.ListModelImpl;
import arida.ufc.br.moap.datamodelapi.instances.api.IInstancesBasedModel;
import br.ufc.datamining.DAO.Local;
import br.ufc.datamining.DAO.Person;

public class Apriori extends AssociationRulesAlgorithm {
	
	Vector<String> candidates = new Vector<String>(); //the current candidates
	ArrayList<Person> persons;
	ArrayList<Local> locals;

	@Override
	public ListModelImpl<IAssociationRule> execute(IInstancesBasedModel data,
			Parameters parameters) {

		// PASSOS DO ALGORITMO
		/*
		 * 1)Fazer a contagem dos items repetidos - verificar a frequencia de cada um deles 
		 * 2)Fazer uma poda de acordo com a confianca, pegar somente aqueles que passam nessa primera validacao
		 * 3)Fazer todas as combinacoes(2 a 2) e ver se passam na validacao da confianca.
		 * 
		 * Ou
		 * 1)n=1
		 * 2)Gerar lista de grupos de itens de tamanho n com frequência maior que a frequência mínima, n++ e goto 2
		 * 3)Caso grupo de itens seja == null, verificaar regras fortes, ou seja, calcular confibilidade   
		 * 
		 */
		
		System.out.println("Apriori algorithm has started.\n");
		int itemsetNumber=1; //the current itemset being looked at
		
		  //while not complete
        do
        {
            //generate the candidates
            generateCandidates(itemsetNumber);

            //determine and display frequent itemsets
            calculateFrequentItemsets(itemsetNumber);
            if(candidates.size()!=0)
            {
                System.out.println("Frequent " + itemsetNumber + "-itemsets");
                System.out.println(candidates);
            }
            //increase the itemset that is being looked at
            itemsetNumber++;
        //if there are <=1 frequent items, then its the end. This prevents reading through the database again. When there is only one frequent itemset.
        }while(candidates.size()>1);

		return null;
	}

	/*
	 * Generate all possible candidates for the n-th itemsets these candidates
	 * are stored in the candidates class vector
	 */
	private void generateCandidates(int n) {
		// TODO
	}

	/*
	 * Determine which candidates are frequent in the n-th itemsets from all
	 * possible candidates
	 */
	private void calculateFrequentItemsets(int n) {
		// TODO
	}
	
	private double itemSetFrequency(){
		return 0;}

	@Override
	public int getItemAttributeIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTransactionAttributeIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TransactionFormat getTransactionFormat() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTransactionsCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection<IAssociationRule> getAssociationRules(Item item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<IAssociationRule> getAssociationRules(
			Collection<Item> items, boolean and) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getAssociationRulesCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getItemsCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getSupport() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getConfidence() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getName() {
		return "Apriori";
	}
	
	public void setPersons(ArrayList<Person> persons) {
		this.persons = persons;
	}

	public void setLocals(ArrayList<Local> locals) {
		this.locals = locals;
	}

}
