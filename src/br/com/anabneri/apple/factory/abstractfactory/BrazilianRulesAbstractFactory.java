package br.com.anabneri.apple.factory.abstractfactory;

import br.com.anabneri.apple.model.certificate.BrazilianCertificate;
import br.com.anabneri.apple.model.certificate.Certificate;
import br.com.anabneri.apple.model.packing.BrazilianPacking;
import br.com.anabneri.apple.model.packing.Packing;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {


    public Certificate getCertificates() {
        return new BrazilianCertificate();
    }

    public Packing getPacking() {
        return new BrazilianPacking();
    }
}
