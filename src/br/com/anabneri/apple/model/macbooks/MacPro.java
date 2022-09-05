package br.com.anabneri.apple.model.macbooks;

import br.com.anabneri.apple.factory.abstractfactory.CountryRulesAbstractFactory;

public class MacPro extends Macbook {

    public MacPro(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    public void getHardware() {
        System.out.println("Hard. list");
        System.out.println("\t- Retina Screen");
        System.out.println("\t- 16GB");

    }
}
