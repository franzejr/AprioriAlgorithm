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
	public ListModelImpl<IAssociationRule> execute(IInstancesBasedModel data,
			Parameters parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}


}
