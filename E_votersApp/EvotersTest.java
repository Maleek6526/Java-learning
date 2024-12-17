package E_votersApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class EvotersTest {
    @Test
    public void testThatCandidatesCanBeAdded(){
        Evoters vote = new Evoters();
        vote.addCandidate("bola");
        vote.addCandidate("faith");
        vote.addCandidate("fatai");
        assertEquals(vote.getCounter(), 3);
    }

    @Test
    public void testIfPeopleCanVoteForACandidate(){
        Evoters vote = new Evoters();
        vote.addCandidate("bola");
        vote.addCandidate("faith");
        for (int i = 0; i < 5; i++) {
            vote.voteForCandidate("Bola", "shade", 18);
        }
        for (int i = 0; i < 2; i++) {
            vote.voteForCandidate("Faith", "luku", 18);
        }
        vote.voteResults();
    }

    @Test
    public void testThatPeopleCannotVoteForAnUnknownCandidate(){
        Evoters vote = new Evoters();
        vote.addCandidate("bola");
        vote.addCandidate("faith");
        assertFalse(vote.voteForCandidate("bola", "sewa", 11));

    }
}
