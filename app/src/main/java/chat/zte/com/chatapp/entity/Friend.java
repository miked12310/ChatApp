package chat.zte.com.chatapp.entity;

public class Friend {
    private Integer id;
    private User user_me;
    private User user_friend;
    private String time;

    public Friend() {
    }

    public Friend(Integer id, String time) {
        this.id = id;
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser_me() {
        return user_me;
    }

    public void setUser_me(User user_me) {
        this.user_me = user_me;
    }

    public User getUser_friend() {
        return user_friend;
    }

    public void setUser_friend(User user_friend) {
        this.user_friend = user_friend;
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
                ", user_me=" + user_me +
                ", user_friend=" + user_friend +
                ", time='" + time + '\'' +
                '}';
    }
}
