package codeplays.trainee.cleanarch.infra.adapter.controller;

public class Request {
    private final String data;

    public Request(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
