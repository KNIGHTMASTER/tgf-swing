package com.wissensalt.tgf.swing.component.button.login;

import com.wissensalt.tgf.swing.IComponentInitializer;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class ButtonLogin extends JButton implements IComponentInitializer {

    /**
     *
     *
     */
    private static final long serialVersionUID = -1435657110313500320L;

    @PostConstruct
    @Override
    public void initComponents() {
        this.setIcon(new ImageIcon(getClass().getClassLoader().getResource("assets/bt-login.png")));
        this.setMnemonic('L');
        this.setFocusable(false);
        this.setHorizontalTextPosition(SwingConstants.CENTER);
        this.setVerticalTextPosition(SwingConstants.BOTTOM);
    }

}
