package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stacks.ExtractInterface;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private final int RJ_INIT = 0;
    int totalRejected = RJ_INIT;

    public HanoiRhymer() {
    }

    public HanoiRhymer(ExtractInterface list) {
        super(list);
    }

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

//alt + strzałka pozwala szybko przełączać się między plikami