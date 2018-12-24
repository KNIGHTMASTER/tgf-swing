package com.wissensalt.tgf.swing.component.button.base;

import com.wissensalt.tgf.swing.IComponentInitializer;

import javax.swing.*;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class ButtonSave extends JButton implements IComponentInitializer {

    /**
     *
     *
     */
    private static final long serialVersionUID = -1441161236689632531L;

    @Override
    public void initComponents() {
        this.setText("Save");
        this.setMnemonic('S');
        this.setFocusable(false);
        this.setHorizontalTextPosition(SwingConstants.CENTER);
        this.setVerticalTextPosition(SwingConstants.BOTTOM);
    }

}
