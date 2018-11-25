package pl.dmal.creditcard;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class CreditCardConfiguration{

    @Bean
    public CreditCardApi creditCardApi(){
        CreditCardRepository repo = new CreditCardRepository();
        CreditCard c1 = new CreditCard("1234");
        repo.add(c1);

        return new CreditCardApi(repo);
        
    }
}