package com.wissensalt.tgf.swing.component.button.panel.tab.settings.language;

import com.wissensalt.tgf.swing.component.button.base.ButtonSave;
import com.wissensalt.tgf.swing.IComponentInitializer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created on 5/31/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
@Qualifier("btSavePanelTabSettingLanguage")
public class ButtonSavePanelTabSettingLanguage extends ButtonSave implements IComponentInitializer {
    /**
     *
     *
     */
    private static final long serialVersionUID = 7799159681109708644L;

    @PostConstruct
    @Override
    public void initComponents() {
        super.initComponents();
    }
}
