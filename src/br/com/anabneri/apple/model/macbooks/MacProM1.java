package br.com.anabneri.apple.model.macbooks;

import br.com.anabneri.apple.factory.abstractfactory.CountryRulesAbstractFactory;

public class MacProM1 extends Macbook {

    public MacProM1(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    public void getHardware() {
        System.out.println("Hard. list");
        System.out.println("\t- Screen retina");
        System.out.println("\t- 16GB");

    }
}
