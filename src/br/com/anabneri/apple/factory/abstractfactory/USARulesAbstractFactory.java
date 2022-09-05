package br.com.anabneri.apple.factory.abstractfactory;

import br.com.anabneri.apple.model.certificate.Certificate;
import br.com.anabneri.apple.model.certificate.USACertificate;
import br.com.anabneri.apple.model.packing.Packing;
import br.com.anabneri.apple.model.packing.USAPacking;

public class USARulesAbstractFactory implements CountryRulesAbstractFactory {

    public Certificate getCertificates() {
        return new USACertificate();
    }

    public Packing getPacking() {
        return new USAPacking();
    }
}
