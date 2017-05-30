package slacknotifications.teamcity.payload.content;

class SlackUser {
    String id;
    String team_id;
    String name;
    boolean deleted;
    String color;
    String real_name;
    String tz;
    String tz_label;
    String tz_offset;
    SlackProfile profile;
    boolean is_admin;
    boolean is_owner;
    int updated;
    boolean has_2fa;
}
