package org.iesfm.ioc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class InstitutoPrograma {

    private static final Logger log = LoggerFactory.getLogger(InstitutoWriter.class);

    private InstitutoFileScanner institutoFileScanner;
    private InstitutoReader institutoReader;
    private InstitutoWriter institutoWriter;

    public InstitutoPrograma(InstitutoFileScanner institutoFileScanner, InstitutoReader institutoReader, InstitutoWriter institutoWriter) {
        this.institutoFileScanner = institutoFileScanner;
        this.institutoReader = institutoReader;
        this.institutoWriter = institutoWriter;
    }

    public void ejecutar() {
        Instituto instituto = institutoReader.leeInstituto(institutoFileScanner.getFile());
        if (instituto == null) {
            log.error("No se ha encontrado el instituto");
        } else {
            institutoWriter.imprimeNomber(instituto);
        }
    }
}
