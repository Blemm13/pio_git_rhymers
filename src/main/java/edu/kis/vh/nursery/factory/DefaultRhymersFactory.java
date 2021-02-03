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
/*
* Pytanie: Jaki wybór będzie najlepszy (napisz komentarz)?
*
* Wybieram IntArrayStack, ponieważ pozwala on na nieco łatwiejsze dodawanie danych
* pod względem wydajności. Struktura IntLinkedList pozwala na dostęp do każdego pola, niezależnie od pozycji, co nie jest poszukiwaną
* cechą dla tego typu programu. Interesuje nas w tym przypadku najprosza możliwa implementacja struktury LIFO.
*
* Stack również posiada prostszą implementację, ponieważ może funkcjonować bez klasy Node.
*
* Zakładając, że nie zakładamy edytowania pól, które wrzucamy do listy rozsądniejszym wyborem
* z mojej perspektywy zawsze będzie IntArrayStack.
* */