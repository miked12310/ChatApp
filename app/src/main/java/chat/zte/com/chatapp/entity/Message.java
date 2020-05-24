package chat.zte.com.chatapp.entity;

public class Message {
    private Integer id;
    private User send;
    private User recieve;
    private String content;
    private String time;

    public Message() {
    }

    public Message(Integer id, String content, String time) {
        this.id = id;
        this.content = content;
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getSend() {
        return send;
    }

    public void setSend(User send) {
        this.send = send;
    }

    public User getRecieve() {
        return recieve;
    }

    public void setRecieve(User recieve) {
        this.recieve = recieve;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "id=" + id +
                ", send=" + send +
                ", recieve=" + recieve +
                ", content=" + content +
                ", time='" + time + '\'' +
                '}';
    }
}
