package codeplays.trainee.cleanarch.domain.usecase;

public class RequestModel {

    private final String data;

    public RequestModel(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
