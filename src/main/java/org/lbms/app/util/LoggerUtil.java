package org.lbms.app.util;

import java.util.logging.Logger;

public class LoggerUtil {

    public static Logger getLogger(Class<?> cls) {
        return Logger.getLogger(cls.getName());
    }

}