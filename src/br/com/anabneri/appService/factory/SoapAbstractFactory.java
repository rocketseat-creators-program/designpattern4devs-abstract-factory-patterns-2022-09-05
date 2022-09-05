package br.com.anabneri.appService.factory;

import br.com.anabneri.appService.services.BookService;
import br.com.anabneri.appService.services.BookSoapService;
import br.com.anabneri.appService.services.UserService;
import br.com.anabneri.appService.services.UserSoapService;

public class SoapAbstractFactory implements ServicesAbstractFactory {

    @Override
    public UserService getUserService() {
        return new UserSoapService();
    }

    @Override
    public BookService getBookService() {
        return new BookSoapService();
    }
}
