package Repository;
import java.util.List;

public class ShowHistory {
    Receiver receiver=new Receiver();
    public ShowHistory(Receiver receiver){
        this.receiver=receiver;
    }
    public List<String> execute() {
        return receiver.showHistory();
    }
}
