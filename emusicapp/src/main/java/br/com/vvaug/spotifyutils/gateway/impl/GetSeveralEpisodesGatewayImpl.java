package br.com.vvaug.spotifyutils.gateway.impl;

import br.com.vvaug.spotifyutils.client.SpotifyEpisodeClient;
import br.com.vvaug.spotifyutils.gateway.GetSeveralEpisodesGateway;
import br.com.vvaug.spotifyutils.response.SeveralEpisodesResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class GetSeveralEpisodesGatewayImpl implements GetSeveralEpisodesGateway {
	
	private final SpotifyEpisodeClient spotifyEpisodeClient;
	
	@Override
	public SeveralEpisodesResponse getSeveralEpisodes(String ids, String authorization) {
		return spotifyEpisodeClient.getSeveralEpisodes(ids, authorization);
	}

}
