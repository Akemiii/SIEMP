package br.gov.caixa.siemp.query;


public class Query {
	
	public static String SelecionarContrato(String contrato) {
		
	 String query = "Select * from EMP.EMPTB266_CONTRATO where NU_CONTRATO = " + contrato;
	 return query;
	
	}

	public static String EnvelhecerLiberacao(String contrato, int meses) {
		String query = "UPDATE EMP.EMPTB468_LIBERACAO	SET DT_LIBERACAO   = DT_LIBERACAO - "+ meses +" MONTH 	WHERE NU_CONTRATO = " + contrato;
		
		return query;
	}
	
	public static String AtualizarLiberacao(String contrato, int meses) {
		String query = "UPDATE EMP.EMPTB468_LIBERACAO	SET DT_LIBERACAO   = DT_LIBERACAO + "+ meses +" MONTH  	WHERE NU_CONTRATO = " + contrato;
		
		return query;
	}
	
	public static String EnvelhecerReembolso(String contrato, int meses) {
		String query = "UPDATE EMP.EMPTB469_REEMBOLSO SET DT_REEMBOLSO   = DT_REEMBOLSO - "+ meses +" MONTH  WHERE NU_CONTRATO =" + contrato;
		
		return query;
	}
	
	public static String AtualizaraReembolso(String contrato, int meses) {
		String query = "UPDATE EMP.EMPTB469_REEMBOLSO SET DT_REEMBOLSO   = DT_REEMBOLSO + "+ meses +" MONTH  WHERE NU_CONTRATO =" + contrato;
		
		return query;
	}
	
	public static String EnvelhecerContrato(String contrato, int meses) {
		String query = "UPDATE EMP.EMPTB266_CONTRATO SET DT_BASE_EVLCO      = DT_BASE_EVLCO      - "+ meses +" MONTH   ,"
				+ " DT_ASSINATURA      = DT_ASSINATURA      - "+ meses +" MONTH , "
				+ "DT_FINAL_CONTRATO  = DT_FINAL_CONTRATO  - "+ meses +" MONTH  , "
				+ "DT_LIBERACAO_CRDTO = DT_LIBERACAO_CRDTO - "+ meses +" MONTH , "
				+ "DT_VCTO_PRMA_PRCO  = DT_VCTO_PRMA_PRCO  - "+ meses +" MONTH ,"
				+ " DT_ULTMA_STCO      = DT_ULTMA_STCO      - "+ meses +" MONTH ,"
				+ " TS_INCLUSAO        = TS_INCLUSAO        - "+ meses +" MONTH ,"
				+ " TS_CNTRE_ATLZO     = TS_CNTRE_ATLZO     - "+ meses +" MONTH ,"
				+ " DT_INCRO_JUROS     = DT_INCRO_JUROS     - "+ meses +" MONTH ,"
				+ " DT_BASE_EVOLUCAO_CARENCIA = DT_BASE_EVOLUCAO_CARENCIA   - "+ meses +" MONTH ,"
				+ " DT_CONTRATACAO     = DT_CONTRATACAO     - "+ meses +" MONTH  WHERE NU_CONTRATO = "+ contrato;
		
		return query;
	}
	
	public static String AtualizarContrato(String contrato, int meses) {
		String query = "UPDATE EMP.EMPTB266_CONTRATO SET DT_BASE_EVLCO      = DT_BASE_EVLCO      + "+ meses +" MONTH   ,"
				+ " DT_ASSINATURA      = DT_ASSINATURA      + "+ meses +" MONTH , "
				+ "DT_FINAL_CONTRATO  = DT_FINAL_CONTRATO  + "+ meses +" MONTH  , "
				+ "DT_LIBERACAO_CRDTO = DT_LIBERACAO_CRDTO + "+ meses +" MONTH , "
				+ "DT_VCTO_PRMA_PRCO  = DT_VCTO_PRMA_PRCO  + "+ meses +" MONTH ,"
				+ " DT_ULTMA_STCO      = DT_ULTMA_STCO      + "+ meses +" MONTH ,"
				+ " TS_INCLUSAO        = TS_INCLUSAO        + "+ meses +" MONTH ,"
				+ " TS_CNTRE_ATLZO     = TS_CNTRE_ATLZO     + "+ meses +" MONTH ,"
				+ " DT_INCRO_JUROS     = DT_INCRO_JUROS     + "+ meses +" MONTH ,"
				+ " DT_BASE_EVOLUCAO_CARENCIA = DT_BASE_EVOLUCAO_CARENCIA   + "+ meses +" MONTH ,"
				+ " DT_CONTRATACAO     = DT_CONTRATACAO     + "+ meses +" MONTH  WHERE NU_CONTRATO = "+ contrato;
		
		return query;
	}
	
	public static String AvaliacaoRiscoFaseContrato(String contrato) {
		return "INSERT INTO EMP.EMPTB516_FASE_CONTRATO( NU_CONTRATO,TS_GERACAO,NU_FASE,CO_ACAO,CO_USUARIO,CO_TERMINAL,CO_APLICACAO )VALUES( "+ contrato +",CURRENT_TIMESTAMP,7,'I','SIGCR','127.0.1.1','EMPPOVIN' )";
	}
	
	public static String AvaliacaoRiscoContrato(String contrato) {
		return "UPDATE EMP.EMPTB266_CONTRATO SET NU_AVALIACAO = 1 WHERE NU_CONTRATO  = "+ contrato;
	}
	
	public static String AvaliacaoRiscoETPAFRMO(String contrato) {
		return "UPDATE EMP.EMPTB271_ETPA_FRMO SET IC_CONCLUIDA  = 'S', CO_ABA = '2' WHERE NU_CONTRATO = "+ contrato +" AND CO_ETAPA = '4'";
	}
	
	public static String GravameFaseContrato(String contrato) {
		return "INSERT INTO EMP.EMPTB516_FASE_CONTRATO( NU_CONTRATO,TS_GERACAO,NU_FASE,CO_ACAO,CO_USUARIO,CO_TERMINAL,CO_APLICACAO )VALUES( "+contrato+",CURRENT_TIMESTAMP,17,'I','SIGCR','127.0.1.1','EMPPOVIN' )";
	}
	
	public static String GravameETPAFRMO(String contrato) {
		return "UPDATE EMP.EMPTB271_ETPA_FRMO SET IC_CONCLUIDA  = 'S', CO_ABA =  '2' WHERE NU_CONTRATO = "+contrato+" AND CO_ETAPA = '6'";
	}
	
}
