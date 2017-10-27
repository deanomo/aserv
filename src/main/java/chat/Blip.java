package chat;

public class Blip {
    private long id;
    private String content;

    public Blip(long id) {
        this.id = id;
        content = String.format("this is blip %d", id);
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
