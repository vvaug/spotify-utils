package br.com.vvaug.spotifyutils.usecase.impl;

import org.springframework.stereotype.Service;

import br.com.vvaug.spotifyutils.gateway.GetEpisodeGateway;
import br.com.vvaug.spotifyutils.response.EpisodeResponse;
import br.com.vvaug.spotifyutils.usecase.GetEpisodeUseCase;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class GetEpisodeUseCaseImpl implements GetEpisodeUseCase {
	
	private final GetEpisodeGateway getEpisodeGateway;
	
	@Override
	public EpisodeResponse execute( String id,String authorization) {
		return getEpisodeGateway.getEpisode(id,authorization);
	}

}
