public class NewEntity{
    @id
    private long id;
    private String name;
     @notblank(message="No blank allowed");
     @email(message="invalid format");
     private String email;
     
}