package org.iesfm.ioc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InstitutoWriter {

    private static final Logger log = LoggerFactory.getLogger(InstitutoWriter.class);

    public void imprimeNomber(Instituto instituto) {
        log.info(instituto.getNombre());
    }
}
