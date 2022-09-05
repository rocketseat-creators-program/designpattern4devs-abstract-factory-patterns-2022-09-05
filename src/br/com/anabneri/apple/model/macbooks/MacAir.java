package br.com.anabneri.apple.model.macbooks;

import br.com.anabneri.apple.factory.abstractfactory.CountryRulesAbstractFactory;

public class MacAir extends Macbook {


    public MacAir(CountryRulesAbstractFactory rules) {
        super(rules);
    }


    @Override
    public void getHardware() {
        System.out.println("Hard. list");
        System.out.println("\t- Retina Scree");
        System.out.println("\t- 8GB");

    }
}
