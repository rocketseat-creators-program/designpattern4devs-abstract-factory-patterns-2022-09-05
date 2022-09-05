package br.com.anabneri.apple.factory;

import br.com.anabneri.apple.factory.abstractfactory.CountryRulesAbstractFactory;
import br.com.anabneri.apple.model.macbooks.MacAir;
import br.com.anabneri.apple.model.macbooks.MacPro;
import br.com.anabneri.apple.model.macbooks.Macbook;

public class MacAirFactory extends MacbookFactory{

   public MacAirFactory(CountryRulesAbstractFactory rules) {
       super(rules);
   }

    public Macbook createNotebook(String level) {
        if(level.equals("standard")) {
            return new MacAir(rules);
        } else if(level.equals("highEnd")) {
            return new MacPro(rules);
        } else return null;
    }

}

