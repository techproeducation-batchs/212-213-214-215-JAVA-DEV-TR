package relations;
//message ile ilgili metodlar
public class MailService implements MessageService{

    private MessageRepository repo;//null

    public MailService(MessageRepository repo) {
        this.repo = repo;
    }

    @Override//optional
    public void sendMessage(Message message){
        System.out.println("Mesajınız maille gönderildi. Mesaj: "+message.body);
        //MessageRepository repo=new MessageRepository();
        repo.saveMessage(message);
    }


}
