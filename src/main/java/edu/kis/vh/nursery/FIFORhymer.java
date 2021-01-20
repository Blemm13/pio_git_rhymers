package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    public final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        final int RET = temp.countOut();

        while (!callCheck()) {
            temp.countIn(super.countOut());
        }

        while (!temp.callCheck())
            countIn(temp.countOut());


        return RET;
    }
}
