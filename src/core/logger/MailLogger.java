package core.logger;

public class MailLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println(message+ " e mail olarak loglandı!");
    }
}
