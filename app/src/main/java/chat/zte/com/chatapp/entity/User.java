package chat.zte.com.chatapp.entity;

public class User {
    private Integer userId;
    private String userName;
    private String pwd;
    private String head;
    private Integer sex;
    private String time;

    public User() {
    }

    public User(Integer userId, String userName, String pwd, String head, Integer sex, String time) {
        this.userId = userId;
        this.userName = userName;
        this.pwd = pwd;
        this.head = head;
        this.sex = sex;
        this.time = time;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", pwd='" + pwd + '\'' +
                ", head='" + head + '\'' +
                ", sex=" + sex +
                ", time='" + time + '\'' +
                '}';
    }
}
