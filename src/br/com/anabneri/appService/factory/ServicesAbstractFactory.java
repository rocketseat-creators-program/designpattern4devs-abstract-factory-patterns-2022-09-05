package br.com.anabneri.appService.factory;

import br.com.anabneri.appService.services.BookService;
import br.com.anabneri.appService.services.UserService;

public interface ServicesAbstractFactory {

    UserService getUserService();

    BookService getBookService();
}
