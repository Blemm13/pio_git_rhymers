package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.stacks.ExtractInterface;
import edu.kis.vh.nursery.stacks.IntArrayStack;

public class DefaultRhymersFactory implements RhymersFactory {

    @Override
    public DefaultCountingOutRhymer getStandardRhymer() {
        return new DefaultCountingOutRhymer();
    }

    @Override
    public DefaultCountingOutRhymer getFalseRhymer() {
        return new DefaultCountingOutRhymer();
    }

    @Override
    public DefaultCountingOutRhymer getFIFORhymer() {
        return new FIFORhymer();
    }

    @Override
    public DefaultCountingOutRhymer getHanoiRhymer() {
        return new HanoiRhymer();
    }

}

class FIFORhymer extends DefaultCountingOutRhymer {

    public FIFORhymer() {
    }

    public FIFORhymer(ExtractInterface list) {
        super(list);
    }

    public final IntArrayStack temp = new IntArrayStack();


    @Override
    public int countOut() {
        final int ret = temp.countOut();

        while (!callCheck()) {
            temp.countIn(super.countOut());
        }

        while (!temp.callCheck())
            countIn(temp.countOut());


        return ret;
    }
}
