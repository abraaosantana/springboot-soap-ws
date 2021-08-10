package br.com.devweb.soapws.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.devweb.soapws.model.ClienteRequest;
import br.com.devweb.soapws.model.Situacao;

@Service
public class ElegibilidadeService {

	public Situacao verificarElegibilidade(ClienteRequest request) {
		Situacao situacao = new Situacao();
		List<String> criterios = situacao.getCriterioIncompativel();

		if (!(request.getIdade() > 30 && request.getIdade() <= 60)) {
			criterios.add("Idade de ser entre 30 e 60 anos");
		}
		
		if (request.getRendaAnual() < 200000) {
			criterios.add("Renda mínima anual deve ser maior que 200.000");
		}
		
		if (request.getPontuacao() < 500) {
			criterios.add("Pontuação baixa tente novamente após 6 meses");
		}

		if (!criterios.isEmpty()) {
			situacao.setValorAprovado(0);
			situacao.setElegivel(false);
		} else {
			situacao.setValorAprovado(500000);
			situacao.setElegivel(true);
			criterios.clear();
		}
		return situacao;

	}

}
