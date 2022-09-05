package br.com.anabneri.apple.factory;

import br.com.anabneri.apple.factory.abstractfactory.CountryRulesAbstractFactory;
import br.com.anabneri.apple.model.macbooks.MacPro;
import br.com.anabneri.apple.model.macbooks.MacProM1;
import br.com.anabneri.apple.model.macbooks.Macbook;

public class MacProFactory extends MacbookFactory {

    public MacProFactory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    public Macbook createNotebook(String level) {
        if(level.equals("standard")) {
            return new MacPro(rules);
        } else if(level.equals("highEnd")) {
            return new MacProM1(rules);
        } else return null;
    }
}
