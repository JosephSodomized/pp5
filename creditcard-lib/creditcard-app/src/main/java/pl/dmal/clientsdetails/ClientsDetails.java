package pl.dmal.clientsdetails;

class ClientsDetails{
    
   private String name, surname, birthDate;

   public ClientsDetails(String name, String surname, String birthDate){
       this.name = name;
       this.surname = surname;
       this.birthDate = birthDate;
   }

   public String getName(){
       return name;
   }

   public String getSurname(){
        return surname;
   }

   public String getBirthDate(){
        return birthDate;
   }
}