/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codexamen;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
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
                .setOAuthConsumerKey("x")
                .setOAuthConsumerSecret("x")
                .setOAuthAccessToken("x")
                .setOAuthAccessTokenSecret("x");
        twitter = new TwitterFactory(cb.build()).getInstance();
    }

    /**
     * Metodo q nos da nuestro timeLine
     */
    public void timeLine() {
        try {

            List<Status> statuses = twitter.getHomeTimeline();
            System.out.println("Showing home timeline.");
            for (Status status : statuses) {
                System.out.println(status.getUser().getName() + ":"
                        + status.getText());
            }
        } catch (TwitterException ex) {
            Logger.getLogger(MetodosTwitter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Busca tweets con el string introducido
     */
    public void buscar() {

        try {

            String preg = JOptionPane.showInputDialog("Buscar:");
            Query query = new Query(preg);
            QueryResult result = twitter.search(query);
            for (Status status : result.getTweets()) {
                System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
            }
        } catch (TwitterException ex) {
            Logger.getLogger(MetodosTwitter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Crea y publica un tweet
     */
    public void tweet() {
        try {

            String twet = JOptionPane.showInputDialog("Tweett:");
            Status status = twitter.updateStatus(twet);
            System.out.println("Successfully updated the status to [" + status.getText() + "].");
        } catch (TwitterException ex) {
            Logger.getLogger(MetodosTwitter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
