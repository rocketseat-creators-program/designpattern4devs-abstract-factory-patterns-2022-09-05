package br.com.anabneri.apple.factory.abstractfactory;

import br.com.anabneri.apple.model.certificate.Certificate;
import br.com.anabneri.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {

    Certificate getCertificates();

    Packing getPacking();
}
