package br.com.anabneri.apple;

import br.com.anabneri.apple.factory.MacAirFactory;
import br.com.anabneri.apple.factory.MacProFactory;
import br.com.anabneri.apple.factory.MacbookFactory;
import br.com.anabneri.apple.factory.abstractfactory.BrazilianRulesAbstractFactory;
import br.com.anabneri.apple.factory.abstractfactory.CountryRulesAbstractFactory;
import br.com.anabneri.apple.model.macbooks.Macbook;

public class Client {

    public static void main(String[] args) {
        CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
        MacbookFactory macAirFactory = new MacAirFactory(rules);
        MacbookFactory macProFactory = new MacProFactory(rules);

        System.out.println("### Ordering the MacAir");
        Macbook mac1 = macAirFactory.orderMacbook("standard");
        System.out.println(mac1);

        System.out.println("\n\n### Ordering the MacPro finally");
        Macbook mac2 = macProFactory.orderMacbook("highEnd");
        System.out.println(mac2);
    }
}
