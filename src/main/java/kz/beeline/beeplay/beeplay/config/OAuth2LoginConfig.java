package kz.beeline.beeplay.beeplay.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.security.oauth2.core.AuthorizationGrantType;
import org.springframework.security.oauth2.core.ClientAuthenticationMethod;
import org.springframework.security.oauth2.core.oidc.IdTokenClaimNames;

@Configuration
public class OAuth2LoginConfig {

    @Bean
    public ClientRegistrationRepository clientRegistrationRepository() {
        return new InMemoryClientRegistrationRepository(this.discordRegistration(),this.googleClientRegistration(),this.facebookClientRegistration());
    }
    private ClientRegistration discordRegistration() {
        return ClientRegistration.withRegistrationId("discord")
                .clientId("951411072596836383")
                .clientSecret("el4dCiuf-vaNH03eLg_B53gGTd19xmiw")
                .clientAuthenticationMethod(ClientAuthenticationMethod.POST)
                .authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
                .redirectUriTemplate("{baseUrl}/login/oauth2/code/{registrationId}")
                .scope("identify")
                .authorizationUri("https://discordapp.com/api/oauth2/authorize")
                .tokenUri("https://discordapp.com/api/oauth2/token")
                .userInfoUri("https://discordapp.com/api/users/@me")
                .userNameAttributeName("username")
                .clientName("Discord")
                .build();
    }
    private ClientRegistration googleClientRegistration() {
        return ClientRegistration.withRegistrationId("google")
                .clientId("927279916554-2n4cgqrfbcj67qntqfshq93qmk0blrnq.apps.googleusercontent.com")
                .clientSecret("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")
                .clientAuthenticationMethod(ClientAuthenticationMethod.BASIC)
                .authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
                .redirectUriTemplate("{baseUrl}/login/oauth2/code/{registrationId}")
                .scope("openid", "profile", "email")
                .authorizationUri("https://accounts.google.com/o/oauth2/v2/auth")
                .tokenUri("https://www.googleapis.com/oauth2/v4/token")
                .userInfoUri("https://www.googleapis.com/oauth2/v3/userinfo")
                .userNameAttributeName(IdTokenClaimNames.SUB)
                .jwkSetUri("https://www.googleapis.com/oauth2/v3/certs")
                .clientName("Google")
                .build();
    }
    private ClientRegistration facebookClientRegistration() {
        return ClientRegistration.withRegistrationId("facebook")
                .clientId("1001147140834795")
                .clientSecret("2af1f0a42dff88c2d3cd7a55195b1e5b")
                .clientAuthenticationMethod(ClientAuthenticationMethod.BASIC)
                .authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
                .redirectUriTemplate("{baseUrl}/login/oauth2/code/{registrationId}")
                .scope("public_profile", "email")
                .authorizationUri("https://www.facebook.com/dialog/oauth")
                .tokenUri("https://graph.facebook.com/oauth/access_token")
                .userInfoUri("https://graph.facebook.com/me")
                .userNameAttributeName("id")
                .clientName("facebook")
                .build();
    }

}
