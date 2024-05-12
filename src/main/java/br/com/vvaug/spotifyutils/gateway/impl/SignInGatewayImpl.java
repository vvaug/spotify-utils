package br.com.vvaug.spotifyutils.gateway.impl;

import br.com.vvaug.spotifyutils.client.GetAccessTokenClient;
import br.com.vvaug.spotifyutils.gateway.SignInGateway;
import br.com.vvaug.spotifyutils.response.SignInResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SignInGatewayImpl implements SignInGateway {

    private final GetAccessTokenClient getAccessTokenClient;
    @Override
    public SignInResponse execute(String secretId, String clientId, String grant_type) {
        return getAccessTokenClient.getAccessToken(clientId, secretId, grant_type);
    }
}
