package com.wissensalt.tgf.swing.component.combobox;

import com.wissensalt.tgf.swing.IComponentInitializer;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;

/**
 * Created on 5/30/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class ComboBoxLanguage extends JComboBox implements IComponentInitializer {
    /**
     *
     *
     */
    private static final long serialVersionUID = 7406884693673187302L;

    @PostConstruct
    @Override
    public void initComponents() {
        this.setModel(
                new DefaultComboBoxModel(
                        new String[]{
                                "English (Default)",
                                "Bahasa Indonesia",
                        }
                )
        );
    }
}
