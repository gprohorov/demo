package edu.blackjack.data;

import edu.blackjack.model.Card;
import edu.blackjack.model.Nominal;
import edu.blackjack.model.Suit;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class Data {
    private List<Card> deck = new ArrayList<>(
            Arrays.asList(

            new Card(Suit.PIKE, Nominal.N6, 6, "/img/pike/pike6.png","/img/img_1.png"),
                    new Card(Suit.HEART, Nominal.N6, 6, "/img/heart/heart6.png","/img/img_1.png"),
                    new Card(Suit.TILE, Nominal.N6, 6, "/img/tile/tile6.png","/img/img_1.png"),
                    new Card(Suit.CLOVER, Nominal.N6, 6, "/img/clover/clover6.png","/img/img_1.png"),

                    new Card(Suit.PIKE, Nominal.N7, 7,"/img/pike/pike7.png","/img/img_1.png"),
                    new Card(Suit.HEART, Nominal.N7, 7, "/img/heart/heart7.png","/img/img_1.png"),
                    new Card(Suit.TILE, Nominal.N7, 7, "/img/tile/tile7.png","/img/img_1.png"),
                    new Card(Suit.CLOVER, Nominal.N7, 7, "/img/clover/clover7.png","/img/img_1.png"),

                    new Card(Suit.PIKE, Nominal.N8, 8, "/img/pike/pike8.png","/img/img_1.png"),
                    new Card(Suit.HEART, Nominal.N8, 8,"/img/heart/heart8.png","/img/img_1.png"),
                    new Card(Suit.TILE, Nominal.N8, 8, "/img/tile/tile8.png","/img/img_1.png"),
                    new Card(Suit.CLOVER, Nominal.N8, 8,"/img/clover/clover8.png","/img/img_1.png"),

                    new Card(Suit.PIKE, Nominal.N9, 9,"/img/pike/pike9.png","/img/img_1.png"),
                    new Card(Suit.HEART, Nominal.N9, 9, "/img/heart/heart9.png","/img/img_1.png"),
                    new Card(Suit.TILE, Nominal.N9, 9, "/img/tile/tile9.png","/img/img_1.png"),
                    new Card(Suit.CLOVER, Nominal.N9, 9, "/img/clover/clover9.png","/img/img_1.png"),

                    new Card(Suit.PIKE, Nominal.N10, 10, "/img/pike/pike10.png","/img/img_1.png"),
                    new Card(Suit.HEART, Nominal.N10, 10, "/img/heart/heart10.png","/img/img_1.png"),
                    new Card(Suit.TILE, Nominal.N10, 10, "/img/tile/tile10.png","/img/img_1.png"),
                    new Card(Suit.CLOVER, Nominal.N10, 10, "/img/clover/clover10.png","/img/img_1.png"),

                    new Card(Suit.PIKE, Nominal.JACK, 2, "/img/pike/pikeJack.png","/img/img_1.png"),
                    new Card(Suit.HEART, Nominal.JACK, 2, "/img/heart/heartJack.png","/img/img_1.png"),
                    new Card(Suit.TILE, Nominal.JACK, 2, "/img/tile/tileJack.png","/img/img_1.png"),
                    new Card(Suit.CLOVER, Nominal.JACK, 2, "/img/clover/cloverJack.png","/img/img_1.png"),

                    new Card(Suit.PIKE, Nominal.QUEEN, 3, "/img/pike/pikeQueen.png","/img/img_1.png"),
                    new Card(Suit.HEART, Nominal.QUEEN, 3, "/img/heart/heartQueen.png","/img/img_1.png"),
                    new Card(Suit.TILE, Nominal.QUEEN, 3, "/img/tile/tileQueen.png","/img/img_1.png"),
                    new Card(Suit.CLOVER, Nominal.QUEEN, 3, "/img/clover/cloverQueen.png","/img/img_1.png"),

                    new Card(Suit.PIKE, Nominal.KING, 4, "/img/pike/pikeKing.png","/img/img_1.png"),
                    new Card(Suit.HEART, Nominal.KING, 4, "/img/heart/heartKing.png","/img/img_1.png"),
                    new Card(Suit.TILE, Nominal.KING, 4, "/img/tile/tileKing.png","/img/img_1.png"),
                    new Card(Suit.CLOVER, Nominal.KING, 4, "/img/clover/cloverKing.png","/img/img_1.png"),

                    new Card(Suit.PIKE, Nominal.ACE, 11, "/img/pike/pikeAce.png","/img/img_1.png"),
                    new Card(Suit.HEART, Nominal.ACE, 11, "/img/heart/heartAce.png","/img/img_1.png"),
                    new Card(Suit.TILE, Nominal.ACE, 11, "/img/tile/tileAce.png","/img/img_1.png"),
                    new Card(Suit.CLOVER, Nominal.ACE, 11, "/img/clover/cloverAce.png","/img/img_1.png")

            )

    );

    public List<Card> getDeck() {
        return deck;
    }

    public void setDeck(List<Card> deck) {
        this.deck = deck;
    }

}
