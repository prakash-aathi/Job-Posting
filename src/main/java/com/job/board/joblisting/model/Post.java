package com.job.board.joblisting.model;

import java.util.Arrays;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "jobPost")
public class Post {

    private String profile;
    private String desc;
    private String location;
    private String exp;
    private String techs[];

    public String getProfile() {
        return profile;
    }
    public void setProfile(String profile) {
        this.profile = profile;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getExp() {
        return exp;
    }
    public void setExp(String exp) {
        this.exp = exp;
    }
    public String[] getTechs() {
        return techs;
    }

    public void setTechs(String[] techs) {
        this.techs = techs;
    }

    

    public Post() {
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((profile == null) ? 0 : profile.hashCode());
        result = prime * result + ((desc == null) ? 0 : desc.hashCode());
        result = prime * result + ((location == null) ? 0 : location.hashCode());
        result = prime * result + ((exp == null) ? 0 : exp.hashCode());
        result = prime * result + Arrays.hashCode(techs);
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
        Post other = (Post) obj;
        if (profile == null) {
            if (other.profile != null)
                return false;
        } else if (!profile.equals(other.profile))
            return false;
        if (desc == null) {
            if (other.desc != null)
                return false;
        } else if (!desc.equals(other.desc))
            return false;
        if (location == null) {
            if (other.location != null)
                return false;
        } else if (!location.equals(other.location))
            return false;
        if (exp == null) {
            if (other.exp != null)
                return false;
        } else if (!exp.equals(other.exp))
            return false;
        if (!Arrays.equals(techs, other.techs))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Post [profile=" + profile + ", desc=" + desc + ", location=" + location + ", exp=" + exp + ", techs="
                + Arrays.toString(techs) + "]";
    }

    
    

    
}
