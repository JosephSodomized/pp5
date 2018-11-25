package pl.dmal.clientsdetails;

import java.util.HashMap;
import java.util.Map;

class ClientsDetailsRepository{

    private Map<String, ClientsDetails> client = new HashMap<String,ClientsDetails>();

    public void add(ClientsDetails c){
        client.put(c.getName(), c);
    }

}