package relations;

public class WhatsappService implements MessageService{

    private MessageRepository repo;//=new MessageRepository();null

    public WhatsappService(MessageRepository repo) {
        this.repo = repo;
    }

    @Override
    public void sendMessage(Message message) {
        System.out.println("Mesajınız whatsappla gönderildi. Mesaj: "+message.body);
       // MessageRepository repo=new MessageRepository();
        repo.saveMessage(message);
    }
}
