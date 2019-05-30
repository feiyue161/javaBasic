package com.neuedu.work0529;

public class InstrumentTest {
    public static void main(String[] args) {

        Instrument in = new Instrument();
        Wind w1 = new Wind();
        Brass b1 = new Brass();
        w1.play();
        in.play();
        b1.play();
    }
}
