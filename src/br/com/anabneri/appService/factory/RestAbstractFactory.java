package br.com.anabneri.appService.factory;

import br.com.anabneri.appService.services.BookRestService;
import br.com.anabneri.appService.services.BookService;
import br.com.anabneri.appService.services.UserRestService;
import br.com.anabneri.appService.services.UserService;

public class RestAbstractFactory implements ServicesAbstractFactory {

    @Override
    public UserService getUserService() {
        return new UserRestService();
    }

    @Override
    public BookService getBookService() {
        return new BookRestService();
    }
}
