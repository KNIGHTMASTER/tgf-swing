package com.wissensalt.tgf.swing.controller.dialog;

import com.wissensalt.tgf.swing.UIConstant;
import com.wissensalt.tgf.swing.component.dialog.DialogLogin;
import com.wissensalt.tgf.swing.controller.auth.ControllerAuth;
import com.wissensalt.tgf.swing.view.frame.MainFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class ControllerDialogLogin {

    @Autowired
    private ControllerAuth controllerAuth;
    
    public void btLoginActionPerformed(java.awt.event.ActionEvent evt, JTextField txtUserName, MainFrame mainFrame, java.awt.Component rootPane, JPasswordField txtPassword, DialogLogin dialogLogin) {
        String userName = txtUserName.getText().trim();
        String password = String.valueOf(txtPassword.getPassword()).trim();
        txtUserName.setText(UIConstant.Common.Punctuation.EMPTY);
        txtPassword.setText(UIConstant.Common.Punctuation.EMPTY);
        controllerAuth.authenticateAndAuthorize(mainFrame, dialogLogin, userName, password);
    }
    
    public void btResetActionPerformed(java.awt.event.ActionEvent evt, JTextField txtUserName, JPasswordField txtPassword){
        txtUserName.setText(UIConstant.Common.Punctuation.EMPTY);
        txtPassword.setText(UIConstant.Common.Punctuation.EMPTY);
        txtUserName.requestFocus();
    }
}
