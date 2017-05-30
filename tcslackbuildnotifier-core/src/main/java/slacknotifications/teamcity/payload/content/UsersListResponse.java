package slacknotifications.teamcity.payload.content;

import com.google.gson.Gson;

import java.util.List;

public class UsersListResponse {
    private boolean ok;
    private List<SlackUser> members;

    public boolean getOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public String toJson(){
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    static UsersListResponse fromJson(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, UsersListResponse.class);
    }

    List<SlackUser> getMembers() {
        return members;
    }
}
