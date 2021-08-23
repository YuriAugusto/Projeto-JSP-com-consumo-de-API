package com.brq.internet.projetojspbase.service.impl;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.brq.internet.projetojspbase.dto.ResponseFilmeDTO;
import com.brq.internet.projetojspbase.service.ListarFilmeService;

@Service
public class ListarFilmeServiceImpl implements ListarFilmeService{
	

	private static final String PATH_TRENDING = "/trending/movie/week";
	private static final String API_KEY = "api_key";
	private static final String KEY = "48d024a020fd1c6bf80019e1f5960e9e";
	
	@Autowired
	private WebTarget webTarget;

	@Override
	public ResponseFilmeDTO retornaResponse() {
		Response response = webTarget
				.path(PATH_TRENDING)
				.queryParam(API_KEY, KEY)
				.queryParam("language", "pt-BR")
				.request()
				.get();
		return response.readEntity(ResponseFilmeDTO.class);//JSON lido e objeto criado
	}
	
}