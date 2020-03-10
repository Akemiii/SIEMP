package br.gov.caixa.siemp.tests;

import java.io.Serializable;

public interface TestImpl extends Serializable {

	public String getTextByClass(final String param);
	public String getTextById(final String param);
	public String title();
	public String getTextByXpath(final String param);

}

