package br.com.anabneri.apple.model.macbooks;

import br.com.anabneri.apple.factory.abstractfactory.CountryRulesAbstractFactory;

public abstract class Macbook {

    CountryRulesAbstractFactory rules;

    public Macbook(CountryRulesAbstractFactory rules) {
        this.rules = rules;
    }

    public abstract void getHardware();

    public void assemble() {
        System.out.println("Assembling all the hardwares");
    }

    public void certificates() {
        System.out.println("Testing all the certificates");
        System.out.println(rules.getCertificates().applyCertification());
    }

    public void pack() {
        System.out.println("Packing the device");
        System.out.println(rules.getPacking().pack());
    }


}
