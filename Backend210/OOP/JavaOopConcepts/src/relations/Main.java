package relations;
//mesaj gönderme uygulaması
public class Main {
    public static void main(String[] args) {

        Message message=new Message();
        message.body="Siparişiniz hazırlandı.";

        //mesajı maille gönderelim.
//        MailService mailService=new MailService();
//        mailService.sendMessage(message);

        //mesajı whatsappla gönderelim
//        WhatsappService whatsappService=new WhatsappService();
//        whatsappService.sendMessage(message);


        //-referansı interfaceden alırsak
        //bakımı ve geliştrmesi kolay bir uygulama olur.
        MessageRepository repo=new MessageRepository();
        MessageService service=new MailService(repo);
        service.sendMessage(message);

        service=new WhatsappService(repo);


        //gönderilen mesajlar DB ye kaydedilsin





    }
}
