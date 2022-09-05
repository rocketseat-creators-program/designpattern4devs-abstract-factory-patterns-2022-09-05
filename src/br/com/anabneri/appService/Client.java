package br.com.anabneri.appService;

import br.com.anabneri.appService.factory.ServicesAbstractFactory;
import br.com.anabneri.appService.factory.SoapAbstractFactory;
import br.com.anabneri.appService.services.BookService;
import br.com.anabneri.appService.services.UserService;

public class Client {

    public static void main(String[] args) {
        ServicesAbstractFactory factory = new SoapAbstractFactory();
//		ServicesAbstractFactory factory = new RestAbstractFactory();

        UserService userService = factory.getUserService();
        userService.save("Ana Neri");
        userService.delete(5);

        BookService carService = factory.getBookService();
        carService.save("Effective Java");
        carService.update("New Edition Effective Java");
    }
}
