package com.wissensalt.tgf.swing.component.menubar;

import com.wissensalt.tgf.swing.IComponentInitializer;
import com.wissensalt.tgf.swing.component.menubar.help.MenuHelp;
import com.wissensalt.tgf.swing.component.menubar.home.MenuHome;
import com.wissensalt.tgf.swing.component.menubar.login.MenuAuth;
import com.wissensalt.tgf.swing.component.menubar.settings.MenuSettings;
import com.wissensalt.tgf.swing.component.sidebar.DefaultSideBarMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;

/**
 * Created on 10/25/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class AppSwingMenuBar extends JMenuBar implements IComponentInitializer {
    /**
     *
     *
     */
    private static final long serialVersionUID = -3563571036298036734L;

    @Autowired
    private MenuHome menuHome;

    @Autowired
    private MenuAuth menuAuth;

    @Autowired
    private MenuSettings menuSettings;

    @Autowired
    private MenuHelp menuHelp;

    @Autowired
    private DefaultSideBarMenu defaultSideBarMenu;

    @PostConstruct
    @Override
    public void initComponents() {
        this.add(menuHome);
        this.add(menuAuth);
        this.add(menuSettings);
        this.add(menuHelp);

        menuAuth.getMenuLogout().addActionListener(e -> setMenuVisibility(false));
    }

    public void setMenuVisibility(boolean b){
        defaultSideBarMenu.setVisible(b);
        menuHome.setVisible(b);
        menuHome.getMenuDashboard().setVisible(b);
        menuAuth.getMenuLogin().setVisible(!b);
        menuAuth.getMenuLogout().setVisible(b);
    }
}
