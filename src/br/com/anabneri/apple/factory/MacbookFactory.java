package br.com.anabneri.apple.factory;

import br.com.anabneri.apple.factory.abstractfactory.CountryRulesAbstractFactory;
import br.com.anabneri.apple.model.macbooks.Macbook;

public abstract class MacbookFactory {
    CountryRulesAbstractFactory rules;

    public MacbookFactory(CountryRulesAbstractFactory rules) {
        this.rules = rules;
    }

    public Macbook orderMacbook(String level) {
        Macbook notebook = null;

        notebook = createNotebook(level);

        notebook.getHardware();
        notebook.assemble();;
        notebook.certificates();
        notebook.pack();

        return notebook;
    }

    protected abstract Macbook createNotebook(String level);
}
