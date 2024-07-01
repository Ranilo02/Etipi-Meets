package com.etipimeets.Etipi.Meets.model;

public class UsersToMeets extends Base {

    private User user;
    private Meeting meeting;

    public UsersToMeets(User user, Meeting meeting) {
        this.user = user;
        this.meeting = meeting;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Meeting getMeeting() {
        return meeting;
    }

    public void setMeeting(Meeting meeting) {
        this.meeting = meeting;
    }

    @Override
    public String toString() {
        return "UsersToMeets [user=" + user + ", meeting=" + meeting + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((user == null) ? 0 : user.hashCode());
        result = prime * result + ((meeting == null) ? 0 : meeting.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UsersToMeets other = (UsersToMeets) obj;
        if (user == null) {
            if (other.user != null)
                return false;
        } else if (!user.equals(other.user))
            return false;
        if (meeting == null) {
            if (other.meeting != null)
                return false;
        } else if (!meeting.equals(other.meeting))
            return false;
        return true;
    }

}
