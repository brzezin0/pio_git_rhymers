package edu.kis.vh.nursery;

/**
 * Klasa dziedzicząca po DefaultCountingOutRhymer i przysłaniajaca metodę countIn.
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {
    /**
     * totalRejected to zmienna przechowujaca liczbe odrzuconych numerow
     */    private int totalRejected = 0;
    /**
     *  reportRejected jest metodą zwracająca totalRejected.
     */
    public int reportRejected() {
        return totalRejected;
    }
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
