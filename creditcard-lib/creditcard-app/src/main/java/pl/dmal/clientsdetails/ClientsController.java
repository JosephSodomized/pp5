package pl.dmal.clientsdetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/client")
class ClientsController{

    private ClientsDetails client;

        @Autowired //autołączenie 
        ClientsDetailsRepository repository;

        @GetMapping("/client/{name}")
        public String name(){
            return client.getName();
        }

        @RequestMapping("/client")
        public void create(@RequestBody ClientsDetails details){
            repository.add(details);
        }

        @RequestMapping("/client")
        public ClientsDetails[] list(){
            return new ClientsDetails[] {
            new ClientsDetails("Paweł", "Jakubik", "1997-12-27")
        };
        }
}