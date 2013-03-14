package br.ufc.datamining.algorithm;

import java.util.Collection;

import arida.ufc.br.moap.association.api.AssociationRulesAlgorithm;
import arida.ufc.br.moap.association.api.IAssociationRule;
import arida.ufc.br.moap.association.api.Item;
import arida.ufc.br.moap.association.api.TransactionFormat;
import arida.ufc.br.moap.core.imp.Parameters;
import arida.ufc.br.moap.datamodelapi.imp.ListModelImpl;
import arida.ufc.br.moap.datamodelapi.instances.api.IInstancesBasedModel;


public class Apriori extends AssociationRulesAlgorithm {
	
	@Override
	public ListModelImpl<IAssociationRule> execute(IInstancesBasedModel data,
			Parameters parameters) {
		
		//PASSOS DO ALGORITMO
		/*
		 * 1)Fazer a contagem dos items repetidos - verificar a frequencia de cada um deles
		 * 2)Fazer uma poda de acordo com a confianca, pegar somente aqueles que passam
		 * nessa primera validacao
		 * 3)Fazer todas as combinacoes(2 a 2) e ver se passam na validacao da confianca.
		 */
		
		return null;
	}
	
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


}
