/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codexamen;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author ANDY PEÑA SAMPEDRO
 */
public class MetodosTwitter {
      ConfigurationBuilder cb = new ConfigurationBuilder();
    Twitter twitter;
    
    
    /**
     * Constructor, da acceso a nuestra cuenta en twitter.
     */
    public MetodosTwitter() {

        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("x3XClfqBRGr8XukF9lbjNcPAc")
                .setOAuthConsumerSecret("gLSWYMXlKL9FRxogCD1UcVeAMEkY8xNnwPFwyE70fefssNr39g")
                .setOAuthAccessToken("3055128525-94ajQH85l8EH02fUPSoSDgPfBamMreiWZoGN7TL")
                .setOAuthAccessTokenSecret("FpVcQuvLobDT1cEPJ8SvFZAhcj807JV4HJ0yZXIOU7zKF");
        twitter = new TwitterFactory(cb.build()).getInstance();
    }
    
    
}
