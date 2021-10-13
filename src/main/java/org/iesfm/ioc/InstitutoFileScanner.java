package org.iesfm.ioc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.Scanner;

public class InstitutoFileScanner {

    private static final Logger log = LoggerFactory.getLogger(InstitutoWriter.class);

    public File getFile() {
        Scanner scanner = new Scanner(System.in);
        log.info("Introduce el path al archivo");
        return new File(scanner.nextLine());
    }
}
