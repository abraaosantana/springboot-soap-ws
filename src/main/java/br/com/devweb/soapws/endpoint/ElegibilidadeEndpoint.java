package br.com.devweb.soapws.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import br.com.devweb.soapws.model.ClienteRequest;
import br.com.devweb.soapws.model.Situacao;
import br.com.devweb.soapws.service.ElegibilidadeService;

@Endpoint
public class ElegibilidadeEndpoint {

	private static final String NAMESPACE = "http://www.devweb.com.br/soap/api/elegibilidade";
	
	@Autowired
	private ElegibilidadeService elegibilidadeService;

	@PayloadRoot(namespace = NAMESPACE, localPart = "ClienteRequest")
	@ResponsePayload
	public Situacao getStatus(@RequestPayload ClienteRequest request) {
		return elegibilidadeService.verificarElegibilidade(request);
	}

}
