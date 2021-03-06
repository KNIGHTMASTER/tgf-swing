package com.wissensalt.tgf.swing.controller.dialog;

import com.wissensalt.tgf.swing.IParameterizedComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class ControllerDialogServer implements IParameterizedComponent<Object> {

    private static final Logger LOGGER = LoggerFactory.getLogger(ControllerDialogServer.class);

    @Override
    public void setParam(Object p_Param) {

    }

    @Override
    public Object getParam() {
        return null;
    }
}
