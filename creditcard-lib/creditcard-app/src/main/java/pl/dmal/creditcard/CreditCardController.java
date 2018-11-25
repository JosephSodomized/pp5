package pl.dmal.creditcard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cards")
class CreditCardController{

        CreditCardApi api;

        @Autowired
        public CreditCardController(CreditCardApi api){
            this.api = api;
        }

        @GetMapping("/{number}")
        public String ballance(){
            return "200zł";
        }

        @PostMapping("/{number}/{money}")
        public void withdraw(@PathVariable String number, @PathVariable double money){
            try{
                api.withdraw(number, money);
            }catch(Throwable e){
                System.out.print(e.getMessage());
            }
        }
}