package br.com.vvaug.spotifyutils.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import br.com.vvaug.spotifyutils.response.MarketsResponse;

@FeignClient(name ="spotify-get-markets-client", url ="${feign.spotify.markets.url}")
public interface SpotifyMarketsClient {
	
	@GetMapping
	MarketsResponse getMarkets(@RequestHeader(HttpHeaders.AUTHORIZATION) String authorization);

}
