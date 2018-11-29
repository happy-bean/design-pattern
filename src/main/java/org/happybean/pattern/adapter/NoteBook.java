package org.happybean.pattern.adapter;

/**
 * @author wgt
 * @date 2018-11-18
 * @description
 **/
public class NoteBook {

    private ThreePlugIf plug;

    public NoteBook(ThreePlugIf plug) {
        this.plug = plug;
    }

    /**
     * 充电
     */
    public void charge() {
        plug.powerWithThree();
    }

    public static void main(String[] args) {

        GBTwoPlug twoPlug = new GBTwoPlug();
        ThreePlugIf threePlug = new TwoPlugAdapter(twoPlug);

        NoteBook noteBook = new NoteBook(threePlug);
        noteBook.charge();

        threePlug = new TwoPlugAdapterExtends();
        noteBook = new NoteBook(threePlug);
        noteBook.charge();
    }
}
